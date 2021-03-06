package com.elseboot3909.gcrclient.credentials.dataStore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.dataStore
import com.elseboot3909.gcrclient.ServerData
import com.elseboot3909.gcrclient.ServersList
import com.elseboot3909.gcrclient.credentials.ServersListSerializer
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.runBlocking

/**
 *
 */
internal class CredentialsDataStore (context: Context) {
    private val fileName = "servers_data.pb"

    private val Context.credentialsConfig: DataStore<ServersList> by dataStore(
        fileName = fileName,
        serializer = ServersListSerializer,
    )

    private val dataStore = context.credentialsConfig

    val serversList: Flow<ServersList> by lazy {
        runBlocking {
            dataStore.data
        }
    }

    /**
     * This function allows to add server data into storage
     *
     * @param serverData data of the server to be added
     */
    fun addServerData(serverData: ServerData) {
        runBlocking {
            dataStore.updateData {
                it.toBuilder().addServerData(serverData).build()
            }
        }
    }

    /**
     * This function allows to remove server data from storage by server's URL
     *
     * @param serverUrl the URL of the server to be removed
     */
    fun removeServerData(serverUrl: String) {
        runBlocking {
            dataStore.updateData { list ->
                val newList = list.serverDataList.filter { v -> v.serverURL != serverUrl }
                if (newList.size != list.toBuilder().serverDataList.size) {
                    list.toBuilder().clear().addAllServerData(newList).build()
                } else {
                    list
                }
            }
        }
    }
}
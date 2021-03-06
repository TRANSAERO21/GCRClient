package com.elseboot3909.gcrclient.utils

import com.elseboot3909.gcrclient.R
import com.elseboot3909.gcrclient.entity.external.AccountInfo

object AccountUtils {

    val dummyAvatars = arrayOf(
        R.drawable.ic_dummy_avatar_1,
        R.drawable.ic_dummy_avatar_2,
        R.drawable.ic_dummy_avatar_3,
        R.drawable.ic_dummy_avatar_4,
        R.drawable.ic_dummy_avatar_5
    )

    fun getAvatarById(id: Int): Int {
        return dummyAvatars[id % dummyAvatars.size]
    }

    fun getShowedName(account: AccountInfo): String {
        return when {
            account.display_name.isNotEmpty() -> account.display_name
            account.username.isNotEmpty() -> account.username
            account.name.isNotEmpty() -> account.name
            account.email.isNotEmpty() -> account.email
            else -> account._account_id.toString()
        }
    }

}

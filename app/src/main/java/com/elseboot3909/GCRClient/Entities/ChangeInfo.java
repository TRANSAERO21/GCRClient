package com.elseboot3909.GCRClient.Entities;

public class ChangeInfo {

    private String id;
    private String project;
    private String branch;
    private String topic;
    //private String attention_set;
    private String assignee;
    //private String hashtags;
    private String change_id;
    private String subject;
    private String status;
    private String created;
    private String updated;
    private boolean submitted;
    private String submitter;
    private boolean starred;
    private String stars;
    private boolean reviewed;
    private String submit_type;
    private String mergeable;
    private String submittable;
    private Integer insertions;
    private Integer deletions;
    private Integer total_comment_count;
    private Integer unresolved_comment_count;
    private Integer _number;
    //private String owner;
    private String actions;
    //private String submit_records;
    //private String requirements;
    //private String submit_requirements;
    private String labels;
    private String permitted_labels;
    private String removable_reviewers;
    private String reviewers;
    private String pending_reviewers;
    private String reviewer_updates;
    private String messages;
    private String current_revision;
    private String revisions;
    private String meta_rev_id;
    private String tracking_ids;
    private boolean _more_changes;
    private String problems;
    private boolean is_private;
    private boolean work_in_progress;
    private boolean has_review_started;
    private String revert_of;
    private String submission_id;
    private String cherry_pick_of_change;
    private String cherry_pick_of_patch_set;
    private String contains_git_conflicts;

    public String getSubject() {
        return this.subject;
    }

    public String getProject() {
        return this.project;
    }

    public String getBranch() {
        return this.branch;
    }
}
 package com.example.cryptopricechecker.details;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class DeveloperData {

   @SerializedName("forks")
   int forks;

   @SerializedName("stars")
   int stars;

   @SerializedName("subscribers")
   int subscribers;

   @SerializedName("total_issues")
   int totalIssues;

   @SerializedName("closed_issues")
   int closedIssues;

   @SerializedName("pull_requests_merged")
   int pullRequestsMerged;

   @SerializedName("pull_request_contributors")
   int pullRequestContributors;

   @SerializedName("code_additions_deletions_4_weeks")
   CodeAdditionsDeletions4Weeks codeAdditionsDeletions4Weeks;

   @SerializedName("commit_count_4_weeks")
   int commitCount4Weeks;

   @SerializedName("last_4_weeks_commit_activity_series")
   List<String> last4WeeksCommitActivitySeries;


    public void setForks(int forks) {
        this.forks = forks;
    }
    public int getForks() {
        return forks;
    }
    
    public void setStars(int stars) {
        this.stars = stars;
    }
    public int getStars() {
        return stars;
    }
    
    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
    }
    public int getSubscribers() {
        return subscribers;
    }
    
    public void setTotalIssues(int totalIssues) {
        this.totalIssues = totalIssues;
    }
    public int getTotalIssues() {
        return totalIssues;
    }
    
    public void setClosedIssues(int closedIssues) {
        this.closedIssues = closedIssues;
    }
    public int getClosedIssues() {
        return closedIssues;
    }
    
    public void setPullRequestsMerged(int pullRequestsMerged) {
        this.pullRequestsMerged = pullRequestsMerged;
    }
    public int getPullRequestsMerged() {
        return pullRequestsMerged;
    }
    
    public void setPullRequestContributors(int pullRequestContributors) {
        this.pullRequestContributors = pullRequestContributors;
    }
    public int getPullRequestContributors() {
        return pullRequestContributors;
    }
    
    public void setCodeAdditionsDeletions4Weeks(CodeAdditionsDeletions4Weeks codeAdditionsDeletions4Weeks) {
        this.codeAdditionsDeletions4Weeks = codeAdditionsDeletions4Weeks;
    }
    public CodeAdditionsDeletions4Weeks getCodeAdditionsDeletions4Weeks() {
        return codeAdditionsDeletions4Weeks;
    }
    
    public void setCommitCount4Weeks(int commitCount4Weeks) {
        this.commitCount4Weeks = commitCount4Weeks;
    }
    public int getCommitCount4Weeks() {
        return commitCount4Weeks;
    }
    
    public void setLast4WeeksCommitActivitySeries(List<String> last4WeeksCommitActivitySeries) {
        this.last4WeeksCommitActivitySeries = last4WeeksCommitActivitySeries;
    }
    public List<String> getLast4WeeksCommitActivitySeries() {
        return last4WeeksCommitActivitySeries;
    }
    
}
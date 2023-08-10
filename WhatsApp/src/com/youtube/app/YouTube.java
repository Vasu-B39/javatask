package com.youtube.app;

public class YouTube {
	   
    private String channelName;
    private String ownerName;
    private int subscribersCount;
    private int videosCount;
    private boolean isVerified;
    private String about;
    private String country;
    private String joinDate;
    private boolean isMonetized;
    private String website;
    private boolean isLiveStreamingEnabled;
    private boolean isCommentsEnabled;
    private boolean isNotificationsEnabled;
    private boolean isSubtitlesEnabled;

   
    
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getSubscribersCount() {
        return subscribersCount;
    }

    public void setSubscribersCount(int subscribersCount) {
        this.subscribersCount = subscribersCount;
    }

    public int getVideosCount() {
        return videosCount;
    }

    public void setVideosCount(int videosCount) {
        this.videosCount = videosCount;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public boolean isMonetized() {
        return isMonetized;
    }

    public void setMonetized(boolean isMonetized) {
        this.isMonetized = isMonetized;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isLiveStreamingEnabled() {
        return isLiveStreamingEnabled;
    }

    public void setLiveStreamingEnabled(boolean isLiveStreamingEnabled) {
        this.isLiveStreamingEnabled = isLiveStreamingEnabled;
    }

    public boolean isCommentsEnabled() {
        return isCommentsEnabled;
    }

    public void setCommentsEnabled(boolean isCommentsEnabled) {
        this.isCommentsEnabled = isCommentsEnabled;
    }

    public boolean isNotificationsEnabled() {
        return isNotificationsEnabled;
    }

    public void setNotificationsEnabled(boolean isNotificationsEnabled) {
        this.isNotificationsEnabled = isNotificationsEnabled;
    }

    public boolean isSubtitlesEnabled() {
        return isSubtitlesEnabled;
    }

    public void setSubtitlesEnabled(boolean isSubtitlesEnabled) {
        this.isSubtitlesEnabled = isSubtitlesEnabled;
    }

}
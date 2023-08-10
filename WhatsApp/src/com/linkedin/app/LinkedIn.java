package com.linkedin.app;

public class LinkedIn {

    private String fullName;
    private String headline;
    private String currentJob;
    private String company;
    private String location;
    private int connectionsCount;
    private String summary;
    private String industry;
    private String email;
    private long phoneNumber;
    private String profilePictureURL;
    private boolean isPremiumMember;
    private boolean isJobSeeker;
    private boolean isVisibilityLimited;

   

    // Getter and Setter methods
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(String currentJob) {
        this.currentJob = currentJob;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getConnectionsCount() {
        return connectionsCount;
    }

    public void setConnectionsCount(int connectionsCount) {
        this.connectionsCount = connectionsCount;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfilePictureURL() {
        return profilePictureURL;
    }

    public void setProfilePictureURL(String profilePictureURL) {
        this.profilePictureURL = profilePictureURL;
    }

    public boolean isPremiumMember() {
        return isPremiumMember;
    }

    public void setPremiumMember(boolean isPremiumMember) {
        this.isPremiumMember = isPremiumMember;
    }

    public boolean isJobSeeker() {
        return isJobSeeker;
    }

    public void setJobSeeker(boolean isJobSeeker) {
        this.isJobSeeker = isJobSeeker;
    }

    public boolean isVisibilityLimited() {
        return isVisibilityLimited;
    }

    public void setVisibilityLimited(boolean isVisibilityLimited) {
        this.isVisibilityLimited = isVisibilityLimited;
    }

}
package com.facebook.app;

public class FaceBook {
	 
    private String username;
    private String fullName;
    private int friendsCount;
    private int followersCount;
    private int postsCount;
    private boolean isPrivate;
    private String bio;
    private String location;
    private String email;
    private String phoneNumber;
    private String profilePictureURL;
    private boolean isVerified;
    private boolean isTimelineEnabled;
    private boolean isTaggingAllowed;

  
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(int friendsCount) {
        this.friendsCount = friendsCount;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(int postsCount) {
        this.postsCount = postsCount;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfilePictureURL() {
        return profilePictureURL;
    }

    public void setProfilePictureURL(String profilePictureURL) {
        this.profilePictureURL = profilePictureURL;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public boolean isTimelineEnabled() {
        return isTimelineEnabled;
    }

    public void setTimelineEnabled(boolean isTimelineEnabled) {
        this.isTimelineEnabled = isTimelineEnabled;
    }

    public boolean isTaggingAllowed() {
        return isTaggingAllowed;
    }

    public void setTaggingAllowed(boolean isTaggingAllowed) {
        this.isTaggingAllowed = isTaggingAllowed;
    }

   
}
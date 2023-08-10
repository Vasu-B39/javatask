package com.instagram.app;

public class Instagram {
    
    private String username;
    private String fullName;
    private int followersCount;
    private int followingCount;
    private int postsCount;
    private boolean isPublic;
    private String bio;
    private String website;
    private String email;
    private long phoneNumber;
    private int noOfBlocked;
    private boolean isVerified;
    private boolean isBusinessAccount;
    private boolean isSponsored;

   
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getFollowersCount() {
        return this.followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public int getFollowingCount() {
        return this.followingCount;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
    }

    public int getPostsCount() {
        return this.postsCount;
    }

    public void setPostsCount(int postsCount) {
        this.postsCount = postsCount;
    }

    public boolean isPublic() {
        return this.isPublic;
    }

    public void setPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNoOfBlocked() {
        return this.noOfBlocked;
    }

    public void setNoOfBlocked(int noOfBlocked) {
        this.noOfBlocked = noOfBlocked;
    }

    public boolean isVerified() {
        return this.isVerified;
    }

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public boolean isBusinessAccount() {
        return this. isBusinessAccount;
    }

    public void setBusinessAccount(boolean isBusinessAccount) {
        this.isBusinessAccount = isBusinessAccount;
    }

    public boolean isSponsored() {
        return this.isSponsored;
    }

    public void setSponsored(boolean isSponsored) {
        this.isSponsored = isSponsored;
    }
}
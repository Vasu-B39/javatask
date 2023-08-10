package com.snapchat.app;

public class Snapchat {
    
    private String username;
    private int snapScore;
    private int streakCount;
    private boolean isPremium;
    private boolean isVerified;
    private String email;
    private String phoneNumber;
    private String bitmojiAvatarURL;
    private boolean isGhostMode;
    private String location;
    private boolean isSnapMapVisible;
    private boolean isNotificationsOn;
    private boolean isFiltersEnabled;
    private boolean isLensesEnabled;

   
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSnapScore() {
        return this.snapScore;
    }

    public void setSnapScore(int snapScore) {
        this.snapScore = snapScore;
    }

    public int getStreakCount() {
        return this.streakCount;
    }

    public void setStreakCount(int streakCount) {
        this.streakCount = streakCount;
    }

    public boolean isPremium() {
        return this.isPremium;
    }

    public void setPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }

    public boolean isVerified() {
        return this.isVerified;
    }

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBitmojiAvatarURL() {
        return this.bitmojiAvatarURL;
    }

    public void setBitmojiAvatarURL(String bitmojiAvatarURL) {
        this.bitmojiAvatarURL = bitmojiAvatarURL;
    }

    public boolean isGhostMode() {
        return this.isGhostMode;
    }

    public void setGhostMode(boolean isGhostMode) {
        this.isGhostMode = isGhostMode;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isSnapMapVisible() {
        return this.isSnapMapVisible;
    }

    public void setSnapMapVisible(boolean isSnapMapVisible) {
        this.isSnapMapVisible = isSnapMapVisible;
    }

    public boolean isNotificationsOn() {
        return this.isNotificationsOn;
    }

    public void setNotificationsOn(boolean isNotificationsOn) {
        this.isNotificationsOn = isNotificationsOn;
    }

    public boolean isFiltersEnabled() {
        return this.isFiltersEnabled;
    }

    public void setFiltersEnabled(boolean isFiltersEnabled) {
        this.isFiltersEnabled = isFiltersEnabled;
    }

    public boolean isLensesEnabled() {
        return this.isLensesEnabled;
    }

    public void setLensesEnabled(boolean isLensesEnabled) {
        this.isLensesEnabled = isLensesEnabled;
    }
}
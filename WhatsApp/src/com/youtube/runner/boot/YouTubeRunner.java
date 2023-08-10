package com.youtube.runner.boot;

import com.youtube.app.YouTube;

public class YouTubeRunner {

    public static void main(String[] args) {
        
        YouTube channel = new YouTube();

       
        channel.setChannelName("XWorkz");
        channel.setOwnerName("Mr. Omkar");
        channel.setSubscribersCount(100000);
        channel.setVideosCount(500);
        channel.setVerified(true);
        channel.setAbout("Educational platform");
        channel.setCountry("India");
        channel.setJoinDate("2020-01-01");
        channel.setMonetized(true);
        channel.setWebsite("https://www.xworkz.com");
        channel.setLiveStreamingEnabled(true);
        channel.setCommentsEnabled(true);
        channel.setNotificationsEnabled(true);
        channel.setSubtitlesEnabled(true);

     
        System.out.println("Channel Name: " + channel.getChannelName());
        System.out.println("Owner Name: " + channel.getOwnerName());
        System.out.println("Subscribers Count: " + channel.getSubscribersCount());
        System.out.println("Videos Count: " + channel.getVideosCount());
        System.out.println("Verified: " + channel.isVerified());
        System.out.println("About: " + channel.getAbout());
        System.out.println("Country: " + channel.getCountry());
        System.out.println("Join Date: " + channel.getJoinDate());
        System.out.println("Monetized: " + channel.isMonetized());
        System.out.println("Website: " + channel.getWebsite());
        System.out.println("Live Streaming Enabled: " + channel.isLiveStreamingEnabled());
        System.out.println("Comments Enabled: " + channel.isCommentsEnabled());
        System.out.println("Notifications Enabled: " + channel.isNotificationsEnabled());
        System.out.println("Subtitles Enabled: " + channel.isSubtitlesEnabled());
    }
}
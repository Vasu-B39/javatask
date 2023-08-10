package com.pubg.runner.boot;

import com.pubg.app.Pubg;

public class PubgRunner {

	public static void main(String[] args) {

		Pubg pubg = new Pubg();

		pubg.setPlayerName("Player123");
		pubg.setPlayerID("12345678");
		pubg.setLevel(50);
		pubg.setExperience(15000);
		pubg.setMatchesPlayed(500);
		pubg.setKills(1000);
		pubg.setWins(50);
		pubg.setKdRatio(2.0);
		pubg.setClanName("Xtreme Gamers");
		pubg.setServerRegion("Asia");
		pubg.setBattlePassActive(true);
		pubg.setBattlePassLevel(20);
		pubg.setMicEnabled(true);
		pubg.setSquadPlayEnabled(true);

		System.out.println("Player Name: " + pubg.getPlayerName());
		System.out.println("Player ID: " + pubg.getPlayerID());
		System.out.println("Level: " + pubg.getLevel());
		System.out.println("Experience: " + pubg.getExperience());
		System.out.println("Matches Played: " + pubg.getMatchesPlayed());
		System.out.println("Kills: " + pubg.getKills());
		System.out.println("Wins: " + pubg.getWins());
		System.out.println("K/D Ratio: " + pubg.getKdRatio());
		System.out.println("Clan Name: " + pubg.getClanName());
		System.out.println("Server Region: " + pubg.getServerRegion());
		System.out.println("Battle Pass Active: " + pubg.isBattlePassActive());
		System.out.println("Battle Pass Level: " + pubg.getBattlePassLevel());
		System.out.println("Mic Enabled: " + pubg.isMicEnabled());
		System.out.println("Squad Play Enabled: " + pubg.isSquadPlayEnabled());
	}
}
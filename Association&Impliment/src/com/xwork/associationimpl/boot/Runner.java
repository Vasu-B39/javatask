package com.xwork.associationimpl.boot;

import com.xwork.associationimpl.app.Browser;
import com.xwork.associationimpl.app.Cricket;
import com.xwork.associationimpl.app.Flute;
import com.xwork.associationimpl.app.FootBall;
import com.xwork.associationimpl.app.Guitor;
import com.xwork.associationimpl.app.Hocky;
import com.xwork.associationimpl.app.Internet;
import com.xwork.associationimpl.app.Lan;
import com.xwork.associationimpl.app.Man;
import com.xwork.associationimpl.app.Music;
import com.xwork.associationimpl.app.Player;
import com.xwork.associationimpl.app.Singer;
import com.xwork.associationimpl.app.Song;
import com.xwork.associationimpl.app.User;
import com.xwork.associationimpl.app.ValleyBall;
import com.xwork.associationimpl.app.Wan;

public class Runner {

	public static void main(String[] args) {
		
		Internet internet=new Internet();
		
		Browser browser=new Browser();
		browser.speed();
		System.out.println(browser);
		System.out.println(internet);
		
		System.out.println("====================");
		
		User user=new User();
		Lan user1=new User();
		Wan user2=new User();
		Man user3=new User();
		System.out.println("internet specifies by:"+user+user1+user2+user3);
		
		System.out.println("====================");
		
		Cricket  cricket1=new Cricket();
		
		Player player=new Player();
		player.setBatsMan(cricket1);
		System.out.println(player);
		
		ValleyBall player1=new Player();
		FootBall player2=new Player();
		Hocky player3=new Player();
		
		System.out.println("====================");
		
		Song song1=new Song();
		
		Music music=new Music();
		music.setSong(song1);
		System.out.println(music);
		
		Singer music2=new Music();
		Flute music3=new Music();
		Guitor music4=new Music();
		
		
		
		
		
	}

}

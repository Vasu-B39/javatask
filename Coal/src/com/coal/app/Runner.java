package com.coal.app;

import com.amoeba.app.Amoeba;
import com.amoeba.app.Taste;

import  com.bangle.app.Bangle;
import  com.bangle.app.ColorBangle;


import com.gate.app.Gate;
import  com.gate.app.HomeGate;

import com.dinosaur.app.Dinosaur;
import com.dinosaur.app.BigDinosaur;

import com.theater.app.Theater;
import com.theater.app.Offline1;

import com.drum.app.Drum;
import com.drum.app.PlasticTank;

import com.mic.app.Mic;
import com.mic.app.MicroMic;

import com.flex.app.Flex;
import com.flex.app.Showoff;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Invoking in main Method Runner");

				Coal coal2=new Coal();
				coal2.black();
				coal2.bestCoal();
				Coal coal3=new FilterCoal();
				coal3.black();
				
				Amoeba amoeba=new Amoeba();
				amoeba.shapeLess();
				amoeba.AmoebaCook();
				Amoeba amoeba1=new Taste();
				amoeba1.AmoebaCook();
				
				Bangle bangle=new Bangle();
				bangle.glassBangle();
				bangle.set();
				Bangle bangle1=new ColorBangle();
				bangle1.set();
				
				Gate gate=new Gate();
				gate.IndianGate();
				gate.ironGate();
				HomeGate gate1=new HomeGate();
				gate1.ironGate();
				
				Dinosaur dinosaur=new Dinosaur();
				dinosaur.dragon();
				dinosaur.FierDragon();
				Dinosaur dinosaur1=new BigDinosaur();
				dinosaur1.dragon();
				
				Theater theater=new Theater();
				theater.online1();
				theater.qrCode1();
				Theater theater1=new Offline1();
				theater1.online1();
				
				Drum drum=new Drum();
				drum.barrel();
				drum.syntax();
				Drum drum1=new PlasticTank();
				drum1.syntax();
				
				Mic mic=new Mic();
				mic.wired();
				mic.wireless();
				Mic mic1=new MicroMic();
				mic1.wireless();
				
				Flex flex=new Flex();
				flex.poster();
				flex.brag();
				Flex flex1=new Showoff();
				flex1.poster();
	}
}

package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class AnimalFarm {

AnimalFarm() {

	/*
	 * 1. Ask the user which animal they want, then play the sound of that
	 * animal.
	 
	 

	/* 2. Make it so that the user can keep entering new animals. */
//for (int i = 0; i < 10; i++) {
//	
//}
	String animal=JOptionPane.showInputDialog(null, "What animal do you want?");

if(animal.equals("cow")) {
playMoo();
}
else if(animal.equals("duck")) {
	playQuack();
}
else if(animal.equals("dog"));
playWoof();
}




void playMoo() {
	playNoise(mooFile);
}

void playQuack() {
	playNoise(quackFile);
}

void playWoof() {
	playNoise(woofFile);
}

String quackFile = "quack.wav";
String mooFile = "moo.wav";
String woofFile = "woof.wav";
String meowFile = "meow.wav";
String llamaFile = "llama.wav";


/* Ignore this stuff */

public void playNoise(String soundFile) {
	try {
		 System.out.println(soundFile);
		 Clip clip = AudioSystem.getClip();
		 clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
		 clip.start();
		 Thread.sleep(3400);
	} catch (Exception ex) {
  	ex.printStackTrace();
	}
}

public static void main(String[] args) {
	new AnimalFarm();
}

}


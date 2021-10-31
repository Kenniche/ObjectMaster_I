package com.kenniche;

import com.kenniche.object.Human;
import com.kenniche.object.Ninja;
import com.kenniche.object.Wizard;
import com.kenniche.object.Samurai;

public class HumanTest {

	public static void main(String[] args) {
		// Create a new object named myHuman
		Human myHuman = new Human();
		Human myHuman2 = new Human();
		Human myHuman3 = new Human();
				
		// Wizard, Ninja, Samurai  class overrides the instance method in Human	
		Human Wizard = myHuman;
		Human Ninja = myHuman2;
		Human Samurai = myHuman3;
		
		//Create Objects myWizard, myNinja, mySamurai  
		Wizard myWizard = new Wizard();
		Ninja myNinja = new Ninja();
		Samurai mySamurai = new Samurai();
		
		// Use Method Attack
		myWizard.Attack(myHuman);
		myNinja.Attack(myHuman2);
		mySamurai.Attack(myHuman3);	
		
	}

}

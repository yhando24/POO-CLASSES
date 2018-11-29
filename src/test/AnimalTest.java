package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import Bean.Animal;

public class AnimalTest {
	

	// String race, String surnom, char sexe, String numTatouage
	Animal animal1 = new Animal("Lion", "Marco", 'M', "854");
	Animal animal2 = new Animal("Lion", "Ace",'F', "585");
	

	@Test 
	public void TestaccouplementMemeSexeImpossible() {
		boolean test = animal1.setAccouple(animal2);
		System.err.println(test);
	
		assertTrue(test, "Pas Possible entre memeSexe");
	}
	

	@Test
	public void TestMetissageImpossible() {

		animal2.setRace("Singe");
		assertTrue(animal1.setAccouple(animal2),"Pas de métissage" );

	}
	
	@Test
	public void TestMalRecoitAccoupler() {
		boolean test = animal1.setAccouple(animal2);
		assertTrue(test, "Un Mal doit accoupler une femme et non l'inverse");
	}
	
	

}

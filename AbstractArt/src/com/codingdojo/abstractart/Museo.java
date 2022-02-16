package com.codingdojo.abstractart;

import java.util.ArrayList;

public class Museo {

	public static void main(String[] args) {
		ArrayList<Arte> museo = new ArrayList<Arte> ();
		
		Pintura pintura1 = new Pintura("Test1", "Test1", "Test1", "Test1");
		Pintura pintura2 = new Pintura("Test2", "Test2", "Test2", "Test2");
		Pintura pintura3 = new Pintura("Test3", "Test3", "Test3", "Test3");
		
		Escultura escultura1 = new Escultura("Test1", "Test1", "Test1", "Test1");
		Escultura escultura2 = new Escultura("Test2", "Test2", "Test2", "Test2");
		
		museo.add(pintura1);
		museo.add(pintura2);
		museo.add(pintura3);
		museo.add(escultura1);
		museo.add(escultura2);
		
		for (Arte arte : museo) {
			arte.verArte();
		}
		
	}

}

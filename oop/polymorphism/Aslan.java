package org.ismek.oop.polymorphism;

public class Aslan extends Hayvan implements Yuruyebilir {

	@Override
	public void yurur(String nasil) {
		System.out.println("Aslan" + nasil + "y�r�r");

	}
}
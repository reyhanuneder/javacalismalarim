package org.ismek.dizi;

import java.util.Scanner;

public class MetotDortIslem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1.Say�y� Giriniz: ");
		int sayi1 = scanner.nextInt();

		System.out.println("2.Say�y� Giriniz: ");
		int sayi2 = scanner.nextInt();

		System.out.println("�stedi�iniz ��lemi Yaz�n�z Ard�ndan Enter'a Bas�n�z:");
		System.out.println("B�lme ��in 1'e Bas�n�z");
		System.out.println("�arpma ��in 2'e Bas�n�z");
		System.out.println("Toplama ��in 3'e Bas�n�z");
		System.out.println("��karma ��in 4'e Bas�n�z");

		int secenek = scanner.nextInt();
		if (secenek == 1) {
			bolme(sayi1,sayi2);
		} else if (secenek == 2) {
			carpma(sayi1,sayi2);
		} else if (secenek == 3) {
			toplama(sayi1,sayi2);
		} else if (secenek == 4) {
			cikarma(sayi1,sayi2);
		
		}
		else { System.out.println("yanl�� de�er girdiniz.");}
	}
	public static void toplama(int sayi1, int sayi2) {
		int sonuc = (sayi1 + sayi2);
		System.out.println("Sonu�: " + sonuc);
	}

	public static void cikarma(int sayi1, int sayi2) {
		int sonuc = (sayi1 - sayi2);
		System.out.println("Sonu�: " + sonuc);
	}

	public static void carpma(int sayi1, int sayi2) {
		int sonuc = (sayi1 * sayi2);
		System.out.println("Sonu�: " + sonuc);
	}

	public static void bolme(int sayi1, int sayi2) {
		float sonuc = ((float) sayi1 / sayi2);
		System.out.println("Sonu�: " + sonuc);
	}

}
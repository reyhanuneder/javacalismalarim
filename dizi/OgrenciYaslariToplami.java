package org.ismek.dizi;

import java.util.Scanner;

public class OgrenciYaslariToplami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("s�n�f mevcudunu giriniz.");
		int ogrenciSayisi = scanner.nextInt();
		int toplam = 0;
		int[] yasDizisi = new int[ogrenciSayisi];
		for (int i = 0; i < yasDizisi.length; i++) {
			System.out.print((i+1) + ". ya�� giriniz.");
			int yas = scanner.nextInt();
			yasDizisi[i] = yas;
			toplam += yas;
		}
		System.out.println("ya�lar toplam�= "+toplam);
		System.out.print("ka��nc� ��renci");
		int kacinciOgrenci = scanner.nextInt();
		int ogrenciYasi = yasDizisi[kacinciOgrenci-1];
		System.out.println(ogrenciYasi);
	}
	
}

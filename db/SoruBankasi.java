package org.ismek.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

import javax.management.modelmbean.DescriptorSupport;

public class SoruBankasi {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ders adı giriniz.");

		String dersAdi = scanner.next();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://10.1.8.20:3306/soru_bankasi?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey",
					"ogrenci", "1234");
			// here sonoo is database name, root is username and password
			PreparedStatement prepareStatement = con
					.prepareStatement("INSERT INTO soru_bankasi.ders (ders) VALUES ('" + dersAdi + "')");
			
	
//				' or '1' = '1
//				PreparedStatement prepareStatement = con
//						.prepareStatement("SELECT * FROM sakila.actor where first_name = '" + aktorAdi + "'");

			boolean execute = prepareStatement.execute();
			if (!execute) {
				System.out.println("Kayıt eklendi");
			} else {
				System.out.println("Kayıt eklenemedi");
			}
			

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
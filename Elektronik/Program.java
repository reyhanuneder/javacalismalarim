package org.ismek.Elektronik;

public class Program {

	public static void main(String[] args) {
		
		Marka marka = new Marka();
		marka.adi = "Samsung";
		
		BuzDolabi buzdolabi = new BuzDolabi();
		buzdolabi.setAkimGucu(5);
		buzdolabi.setFiyat(3000);
		buzdolabi.derinDonduruculu = false;
		buzdolabi.enerjiSinifi = EnerjiSinifi.Aplusplus;
//		System.out.println(buzdolabi.isCalisiyor());
//		buzdolabi.fisiTak();
//		System.out.println(buzdolabi.isCalisiyor());
//		buzdolabi.kapakAc();
		
		CamasirMakinesi camasirMakinesi = new CamasirMakinesi();
		camasirMakinesi.setAkimGucu(5);
		camasirMakinesi.setFiyat(3000);
		camasirMakinesi.devirHizi = 3;
		camasirMakinesi.yikamaKapasitesi = 7;
		camasirMakinesi.enerjiSinifi = EnerjiSinifi.Aplus;
//		camasirMakinesi.fisiTak();
//		camasirMakinesi.kapakAc();
		
		BeyazEsya[] esyalarim = new BeyazEsya[2];
		esyalarim[0] = buzdolabi;
		esyalarim[1] = camasirMakinesi;
		
		for (BeyazEsya beyazEsya : esyalarim) {
			beyazEsya.fisiTak();
			beyazEsya.kapakAc();
	}

	}
	}

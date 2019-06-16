package org.ismek.Elektronik;

public class CamasirMakinesi extends BeyazEsya {

	int devirHizi;
	int yikamaKapasitesi;
	
	@Override
	public void kapakAc() {
		if (isCalisiyor()) {
			System.out.println("Kapak açilamaz");
		} else {
			System.out.println("Kapak açildi");
}
	}
}
package org.ismek.Elektronik;

public class CamasirMakinesi extends BeyazEsya {

	int devirHizi;
	int yikamaKapasitesi;
	
	@Override
	public void kapakAc() {
		if (isCalisiyor()) {
			System.out.println("Kapak a�ilamaz");
		} else {
			System.out.println("Kapak a�ildi");
}
	}
}
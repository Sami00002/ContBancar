
public class contLei extends contBancar {

	public contLei(String numarCont, float suma) {
		super(numarCont, suma);
	}

	public void transfer(contLei contDestinatie, float suma) {
		if (this.removeSuma(suma))
			contDestinatie.addSuma(suma);
	}

	public float getSumaTotala() {
		return this.getSuma();
	}
}

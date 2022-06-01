
public class FonduriInsuficiente extends Exception {

	private contBancar contBancar;

	public FonduriInsuficiente(contBancar contBancar) {
		super();
		this.contBancar = contBancar;
	}

	public contBancar getContBancar() {
		return contBancar;
	}

	public void setContBancar(contBancar contBancar) {
		this.contBancar = contBancar;
	}

	public String toString() {
		return "Contul: " + contBancar.getNumarCont() + "are disponibila doar suma de " + contBancar.getSumaTotala()
				+ ", asadar nu se poate trensfera suma de" + suma;
	}

}

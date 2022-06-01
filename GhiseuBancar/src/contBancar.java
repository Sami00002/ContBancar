
public abstract class contBancar implements sumaTotala {

	private String numarCont;
	private float suma;

	public contBancar(String numarCont, float suma) {
		this.numarCont = numarCont;
		this.suma = suma;
	}

	public String getNumarCont() {
		return numarCont;
	}

	public float getSuma() {
		return suma;
	}

	public void setSuma(float suma) {
		this.suma = suma;
	}

	public void setNumarCont(String numarCont) {
		this.numarCont = numarCont;
	}

	public contBancar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addSuma(float suma) {
		this.suma += suma;
	}

	public boolean removeSuma(float suma) {
		if (this.suma < suma) {
			System.out.println("Fonduri insuficiente!");
			return false;
		}
		this.suma -= suma;
		return true;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		contBancar other = (contBancar) obj;
		if (numarCont == null) {
			if (other.numarCont != null)
				return false;
		} else if (!numarCont.equals(other.numarCont))
			return false;
		return true;
	}
}

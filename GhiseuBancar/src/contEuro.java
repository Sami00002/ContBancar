import java.util.Objects;

public class contEuro extends contBancar {
	private String accountNumber;
	private float accountSum;

	public contEuro(String numarCont, float suma, String accountNumber, float accountSum) {
		super(numarCont, suma);
		this.accountNumber = accountNumber;
		this.accountSum = accountSum;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getAccountSum() {
		return accountSum;
	}

	public void setAccountSum(float accountSum) {
		this.accountSum = accountSum;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, accountSum);
	}

}

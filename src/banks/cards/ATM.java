package banks.cards;

public interface ATM {
	public void balanceInquery();
	public void pinChange(double newPin);
	public double getPin();
}

package banks.cards;

public class Sbi implements ATM {
double balance;
double pin;

	public void balanceInquery() {
		// TODO Auto-generated method stub
		 System.out.println("Your SBI balance is :" +balance);

	}


	public void pinChange(double newPin) {
		// TODO Auto-generated method stub
		pin= newPin;
		System.out.println("Your SBI new pin is :"+pin);

	}
	public double getPin(){
		return pin;
		
	}

}

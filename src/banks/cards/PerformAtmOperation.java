package banks.cards;
import java.util.Scanner;
public class PerformAtmOperation {
	Scanner sc = new Scanner(System.in);
	public void performAtmOperation(ATM atm){
		System.out.println("Enter Your pin");
		double pinEntered = sc.nextDouble();
		if(pinEntered == atm.getPin()){
			atm.balanceInquery();
			System.out.println("Enter new pin");
			double newPin = sc.nextDouble();
			atm.pinChange(newPin);
			
		}
		else{
			System.out.println("Wrong Pin");
			
		}
		
	}
	
	public static void main(String...sd){
		Hdfc hdfc = new Hdfc();
		Sbi sbi = new Sbi();
		hdfc.balance = 1000;
		hdfc.pin = 6969;
		sbi.balance = 2000;
		sbi.pin = 1504;
		new PerformAtmOperation().performAtmOperation(hdfc);
		new PerformAtmOperation().performAtmOperation(sbi);
	
		
		
		
		
	}

}

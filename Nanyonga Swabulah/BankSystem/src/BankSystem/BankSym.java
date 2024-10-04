package BankSystem;
import java.util.Scanner;
public class BankSym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable declaration
double AccountNumber;
String AccountName;
double Balance=0;
double deposit;
double withdrawal;
Scanner user=new Scanner(System.in);
System.out.println("Enter AccountNumber:");
AccountNumber=user.nextDouble();
System.out.println("Enter AccountName");
AccountName=user.next();
//deposit
System.out.println("Enter deposit amount");
deposit=user.nextDouble();
if(deposit>0) {
Balance=Balance+deposit;
System.out.println("Deposit Successfully:");
}
else {
	System.out.println("Re-enter the correct amount");
}
	//withdrawal
	System.out.println("Enter withdrawal amount");
	withdrawal = user.nextDouble();
	if((withdrawal>0)&&(withdrawal<Balance)) {
		withdrawal=Balance - withdrawal;
		System.out.println("Insufficient funds on the Account");
	}
	
	while(deposit>0) {
		System.out.println("The Balance is:"+deposit);
		deposit++;
		break;
	}
		

}
}
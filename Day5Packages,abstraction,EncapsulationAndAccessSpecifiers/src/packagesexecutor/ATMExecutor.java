package packagesexecutor;
import java.util.Scanner;
import packages.ATM;
public class ATMExecutor {
public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the card no: ");
		String card_no=s.nextLine();
		ATM obj=new ATM();
		obj.display(card_no);

}
}

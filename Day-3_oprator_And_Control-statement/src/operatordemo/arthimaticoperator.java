package operatordemo;

import java.util.Scanner;

public class arthimaticoperator {

	public static void main(String[] args) 
	{
	
Scanner s= new Scanner(System.in);
System.out.println("Enter the value");
int a =s.nextInt();
int b =s.nextInt();

System.out.println("The addition is"+(a+b));
System.out.println("The subtraction is"+(a-b));
System.out.println("The multification is"+(a*b));
System.out.println("The divisino"+(a/b ));
System.out.println("The modules is"+(a%b));
s.close();				


}
}


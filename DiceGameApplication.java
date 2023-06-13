import java.util.Scanner;
class DiceGameApplication{
    public static void main(String[] args){
	int num1,num2,sum;
	Scanner sc = new Scanner(System.in);

	System.out.println("What is your name?");
	System.out.print(">");
	String name = sc.next();
	
	System.out.println("Hello, "+name+"!");
	
	System.out.println("Rolling dice...");
	num1=(int)(Math.random()*5)+1;
	num2=(int)(Math.random()*5)+1;
	sum=num1+num2;

	System.out.println("Die 1: "+num1);
	System.out.println("Die 2: "+num2);
	System.out.println("Total value: "+sum);
    }
}

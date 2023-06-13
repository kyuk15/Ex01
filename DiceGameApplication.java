class DiceGameApplication{
    public static void main(String[] args){
	int num1,num2,sum;
	
	System.out.println("Rolling dice...");
	num1=(int)(Math.random()*5)+1;
	num2=(int)(Math.random()*5)+1;
	sum=num1+num2;

	System.out.println("Die 1: "+num1);
	System.out.println("Die 2: "+num2);
	System.out.println("Total value: "+sum);

	if(sum>7){
	    System.out.println("You won!");
	}
	else
	    System.out.println("You lost");
    }
}

package pgms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num1=153;
		int arm=0;
		int temp=num1;
		while(num1>0)
		{
			int rem=num1%10;
			arm=arm+(rem*rem*rem);
			num1=num1/10;
		}
		if(temp==arm)
		{
			System.out.println("Given number is Armstrong");
		}
		else
		{
			System.out.println("Given number is not an Armstrong");
		}

	}

}

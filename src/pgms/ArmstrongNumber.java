package pgms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		int arm=0;
		int temp=num;
		while(num>0)
		{
			int rem=num%10;
			arm=arm+(rem*rem*rem);
			num=num/10;
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

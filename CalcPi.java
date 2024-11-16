// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double sum = 1.0;
		double divisor = 3.0;
		if (num%2!=0)
		{
			while (num >0)
			{
				if(num%2!=0)
				{
				sum = sum - (1/divisor);
				divisor = divisor + 2.0;
				num--;
				}
				else
				{
				sum = sum + (1/divisor);
				divisor+=2;
				num--;
				}
			}
		
		}
		else
			{
				while (num >0)
				{
				if(num%2==0)
				{
				sum = sum - (1/divisor);
				divisor = divisor + 2.0;
				num--;
				}
				else
				{
				sum = sum + (1/ divisor);
				divisor = divisor +2;
				num--;
				}
				}
			}
			System.out.println("pi according to Java: " + Math.PI);
			System.out.println("pi, approximated: " + sum*4);
	}
}

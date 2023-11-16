package java_programs;

public class PrimeNumber {

	public static void main(String[] args) {
		/*int num=10,fact=1,count=0;  //forward process
		while(num>=fact)
		{
			if(num%fact==0)
			{
				System.out.println(fact);
				count++;
			}
			fact++;
		}
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("Not a Prime no");*/
		
		int num=22,fact=22,x=1,count=0;  //backward process
		while(num>=x)
		{
			if(fact%num==0)
			{
				System.out.println(num);
				count++;
			}
			num--;
	    }
		if(count==2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}

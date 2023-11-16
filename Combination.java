package java_programs;

public class Combination {

	public static void main(String[] args) {
		int fact=1,r=1,num1=1,num2=1,num3=1;
		while(fact<=5)
		{
			
			num1=num1*fact;
			fact++;
		}
		while(r<=3)
		{
			num2=num2*r;
			r++;
		}
		int total=fact-r;
		while(total>=1)
		{
			num3=num3*total;
			total--;
		}
		int result=num1/(num2*num3);
		System.out.println(result);

	}

}

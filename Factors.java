package java_programs;

public class Factors {

	public static void main(String[] args) {
		int num=56,start=1,count=0;
		while(num>=start)
		{
			if(num%start==0)
			{
				System.out.println(start);
				count++;
			}
			start++;
		}
		System.out.println("number of factors are " +count);
		

	}

}

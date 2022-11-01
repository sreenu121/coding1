import java.util.*;
class Avg3sub
{
	public static void main(String...args)
	{
		int mrk1,mrk2,mrk3;
		int totalmarks;
		double avgoftotal;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER TELUGU MARKS");
		 mrk1 = sc.nextInt();
		System.out.println("ENTER ENGLISH MARKS");
		 mrk2 = sc.nextInt();
		System.out.println("ENTER THE KANADA MARKS");
	     mrk3 = sc.nextInt();
		totalmarks = mrk1+mrk2+mrk3;
		avgoftotal = totalmarks/3;
		System.out.println( "the sum of the three subject's"+totalmarks);
		System.out.println("the avg of the three subjects"+ avgoftotal);
	}
}
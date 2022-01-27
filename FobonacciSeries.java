import java.util.Scanner;
public class FobonacciSeries {

	public static void main(String[] args) {
		int number, a=0, b=0,c=1;
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter number");
		number =sc.nextInt();
		System.out.println("Fibonacci series:");
        for(int i=1;i<=number;i++)
        {
        	a=b;
        	b=c;
        	c=a+b;
        	System.out.print(a + " ");
        }

	}

}

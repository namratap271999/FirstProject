import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:"); 
		String s= sc.nextLine();
		
        int n=s.length();
		for(int index= n-1;index>=0;index++)
		{
			if(s.charAt(index)!=s.charAt(n-index-1))
				System.out.println("Ginen string is not Palindrome");
			else
				System.out.println("Ginen string is Palindrome");
			
			
		}
	}
}

import java.util.Scanner;

public class OwmVersionOfSplit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:"); 
		String stringtosplit= sc.nextLine();
		System.out.println("Enter Where to split");
		 char spiltAt=sc.next().charAt(0);
		 new OwmVersionOfSplit().split (stringtosplit,spiltAt);

	}
	void split(String stringtosplit,char spiltAt)
	{
		int n=stringtosplit.length();
		char []arrayOfChar = new char[n];
		
		for(int i=0;i<n;i++)
		{
			if(stringtosplit.charAt(i)==spiltAt)
			{
				
			    System.out.print(" ");
			}
			else
			{
				arrayOfChar[i]=stringtosplit.charAt(i);
			}
		
		System.out.print(stringtosplit.charAt(i));
		}
				
		}
	}



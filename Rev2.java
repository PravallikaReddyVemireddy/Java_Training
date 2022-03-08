package pr1;
import java.util.Scanner;
public class Rev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String=");
		String str;
		str=sc.next();
		System.out.println("String length="+str.length());
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		

	}

}

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TaskB {

	public static void main(String[] args) throws FileNotFoundException {
//		Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(new FileInputStream("input.txt"));
		PrintWriter out = new PrintWriter("output.txt");
		//a - smaller, b - bigger
		int h=sc.nextInt(), b=sc.nextInt(),a=sc.nextInt();
		long sum=0;
		/**
		 * Correct
		 *  _
		 * | |
		 * | |_
		 * |___| 
		 */
		for(int i=0;i<=h-b;i++){
			sum+=(2*i+1);
		}
		/**
		 * correct
		 *      _
		 *  ___| |
		 * |_____|
		 */
		int k=2*h+1-a-b;
		while(k>0){
			sum+=k;
			k-=2;
		}
		/**
		 * correct
		 *  _____
		 * |  ___| 
		 * |_|
		 */
		if(b%2==1)
			for(int i=(b-1)/2;i<=h-a;i++)
				sum+=(2*i+2-b);			
		else
			for(int i=b/2;i<=h-a;i++)
				sum+=(2*(i-b/2+1));
		/**
		 *  Correct
		 *  ___
		 * |_  |
		 *   | |
		 *   |_|
		 */
		if(a%2==1)
			for(int i=(a-1)/2;i<=h-b;i++)
				sum+=(2*i+2-a);			
		else
			for(int i=a/2;i<=h-b;i++)
				sum+=(2*(i-a/2+1));
//		System.out.println(sum);
		out.println(sum);
		out.close();
		sc.close();		
	}
	
}

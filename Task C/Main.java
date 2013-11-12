import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		//Scanner sc=new Scanner(new FileInputStream("input.txt"));
		//a - smaller, b - bigger
		int h=sc.nextInt(), a=sc.nextInt(),b=sc.nextInt();
		long sum=0;
		for(int i=0;i<=h-b;i++){
			sum+=(2*i+1);
		}
		for(int i=(b-a);i<=h-a;i++){
			sum+=(2*(i-b/2+1));
		}
		if(b%2==1)
			for(int i=(b-1)/2;i<=h-a;i++)
				sum+=(2*i+2-b);			
		else
			for(int i=b/2;i<=h-a;i++)
				sum+=(2*(i-b/2+1));	
		if(a%2==1)
			for(int i=(a-1)/2;i<=h-b;i++)
				sum+=(2*i+2-a);			
		else
			for(int i=a/2;i<=h-b;i++)
				sum+=(2*(i-a/2+1));
		
		System.out.println(sum);
		sc.close();		
	}
	
}

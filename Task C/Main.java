import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new FileInputStream("input.txt"));
		int h=sc.nextInt(), a=sc.nextInt(),b=sc.nextInt();
		long sum=0;
		sc.close();
	}

}

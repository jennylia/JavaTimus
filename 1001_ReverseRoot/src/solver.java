import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Scanner;

public class solver {

	public static String pathIn = "/Users/JLian/Desktop/GGJSol/Timus/1001_ReverseRoot/src/input.txt";
	public static String pathOut = "/Users/JLian/Desktop/GGJSol/Timus/1001_ReverseRoot/src/jenny.txt";

	public static double[] reverseSqRoot(long[] num){
		double[] newArray = new double[num.length];
		
		for(int i = num.length - 1; i>0; i--){
			newArray[i] = Math.sqrt(i);
		}
		return newArray;
	};
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileReader(pathIn));
		PrintWriter pw = new PrintWriter(new FileWriter(pathOut));		
		long[] answer = new long[4];

		for (int i = 0; i < 4; i++) {
			
			answer[i] = Long.parseLong(sc.next());
		}
		
		double[] modAnswer = reverseSqRoot(answer);
		
		for(double i: modAnswer){
			System.out.println(i);
		}
		
		System.out.println();
		pw.flush();
		pw.close();
		sc.close();
	}
}

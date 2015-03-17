import java.io.*;
import java.util.*;


public class Solver {
	
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		
		int numberVal = Integer.parseInt(in.next());
		if (numberVal == 0){
			//didn't specify
		}
		
		if (numberVal < 5){
			out.write("few");
		}else if(numberVal < 10){
			out.write("several");
		}else if(numberVal < 20){
			out.write("pack");
		}else if(numberVal < 50){
			out.write("lots");
		}else if(numberVal < 100){
			out.write("horde");
		}else if(numberVal < 250){
			out.write("throng");
		}else if(numberVal <500){
			out.write("swarm");
		}else if(numberVal <1000){
			out.write("zounds");
		}else{
			out.write("legion");
		}
		
		
		
		
		in.close();
		out.close();
		out.flush();
	}

}

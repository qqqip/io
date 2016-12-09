package file.second;

import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) throws Exception {
		
		PrintStream ps = new PrintStream("data.txt");
		
		ps.println("박재범,10,20,30");
		ps.println("켄타로,30,60,40");
		ps.println("성시경,40,20,70");
		ps.println("권  건,20,80,100");
		
		ps.close();
	}
}

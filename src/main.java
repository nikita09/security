import java.util.Scanner;
public class main {
	public static ReferenceObject parser(String line, subject Lyle, subject Hal, object Hobj, object Lobj){
		String instruction = "";
		String subName = "";
		String obName = "";
		int value = 0;
		String[] intline = new String[4];
		String temp ="";
		int counter = 0;
		int i = 0;
		while((i<line.length()) && (counter < 4)){
			if(line.charAt(i)==' ')
				intline[counter]=temp;
			temp+=line.charAt(i);
			i++;
			counter++;
		}
		ReferenceObject refobj = new ReferenceObject("", new subject("",SecurityLvl.LOW), new object("", SecurityLvl.LOW), 0);
		
		if((intline[1].equals("Lyle")) && (intline[2].equals("HObj")))
			return new ReferenceObject(intline[0],Lyle,Hobj,Integer.parseInt(intline[3]));
		else if((intline[1].equals("Lyle")) && (intline[2].equals("LObj")))
			return new ReferenceObject(intline[0],Lyle,Lobj,Integer.parseInt(intline[3]));
		else if((intline[1].equals("Hal")) && (intline[2].equals("LObj")))
			return new ReferenceObject(intline[0],Hal,Lobj,Integer.parseInt(intline[3]));
		else if((intline[1].equals("Hal")) && (intline[2].equals("HObj")))
			return new ReferenceObject(intline[0],Hal,Hobj,Integer.parseInt(intline[3]));
		
		return refobj;
		
	}
	
	public static void main(String[] args){
	ReferenceMonitor refMon = new ReferenceMonitor();
	SecurityLvl low = SecurityLvl.LOW;
	SecurityLvl high = SecurityLvl.HIGH;
	
		
	subject Lyle = new subject("Lyle", low);
	subject Hal = new subject("Hal", high);
	
	object Hobj = new object("HObj", high);
	object Lobj = new object("LObj", low);
	
	Scanner scan = new Scanner(System.in);
	String input = "";
	
	while(scan.hasNextLine()){
		input = scan.nextLine();
		ReferenceObject refobj = parser(input, Lyle, Hal, Hobj, Lobj);
		
	}
	
	
	
	}
	
	
	
}

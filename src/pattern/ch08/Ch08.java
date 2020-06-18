package pattern.ch08;

public class Ch08 {
	
	public static void main(String[] args) {
		
		ComputerFactory computerFactory = new ComputerFactory(new LgGramBluePrint()); 

		computerFactory.make();
		
		Computer computer = computerFactory.getComputer();
		
		System.out.println(computer);
	}
}

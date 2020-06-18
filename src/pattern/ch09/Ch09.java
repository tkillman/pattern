package pattern.ch09;

import pattern.ch08.Computer;

public class Ch09 {
	
	public static void main(String[] args) {
		
		Computer computer = ComputerBuilder.start().setCpu(3).build();
		System.out.println(computer);
	}
}

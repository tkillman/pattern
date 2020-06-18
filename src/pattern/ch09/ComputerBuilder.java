package pattern.ch09;

import pattern.ch08.Computer;

public class ComputerBuilder {
	
	private Computer computer;
	
	public ComputerBuilder() {
		computer = new Computer();
	}
	
	public static ComputerBuilder start(){
		return new ComputerBuilder();
	}
	
	public ComputerBuilder setCpu(int i) {
		this.computer.setCpu(i);
		return this;
	}
	
	public Computer build() {
		return computer;
	}
}

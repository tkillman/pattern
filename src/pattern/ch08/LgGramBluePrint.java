package pattern.ch08;

public class LgGramBluePrint extends BluePrint{

	Computer computer;
	
	public LgGramBluePrint() {
		this.computer = new Computer();
	}
	@Override
	void setCpu() {
		// TODO Auto-generated method stub
		computer.setCpu(5);
	}

	@Override
	void setRam() {
		// TODO Auto-generated method stub
		computer.setRam(7);
	}

	@Override
	void setHard() {
		// TODO Auto-generated method stub
		computer.setHard(9);
	}
	@Override
	Computer getComputer() {
		// TODO Auto-generated method stub
		return this.computer;
	}	
}

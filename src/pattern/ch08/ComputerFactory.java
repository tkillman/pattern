package pattern.ch08;

public class ComputerFactory {
	
	private BluePrint bluePrint;
	
	public ComputerFactory(BluePrint bluePrint) {
		this.bluePrint = bluePrint;
	}
	
	public void make() {
		bluePrint.setCpu();
		bluePrint.setRam();
		bluePrint.setHard();
	}
	
	public Computer getComputer() {
		return bluePrint.getComputer();
	}
}

package pattern.ch08;

public class Computer {
	private int cpu;
	
	private int ram;
	
	private int hard;

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHard() {
		return hard;
	}

	public void setHard(int hard) {
		this.hard = hard;
	}
	
	@Override
	public String toString() {
		return "cpu :: " + cpu + ", ram :: " + ram + ", hard :: " + hard;
	}
}

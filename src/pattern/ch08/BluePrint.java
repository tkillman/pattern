package pattern.ch08;

public abstract class BluePrint {
	
	abstract void setCpu(); // cpu 설정
	
	abstract void setRam(); // ram 설정
	
	abstract void setHard(); // hard 설정
	
	abstract Computer getComputer(); //컴퓨터 반환
}

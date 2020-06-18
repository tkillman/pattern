package pattern.ch12;

public class PrintMorseCode extends MorseCode{
	
	public PrintMorseCode g() {
		dash();dash();dot();
		return this;
	}
}

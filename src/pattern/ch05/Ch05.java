package pattern.ch05;

public class Ch05 {
	
	public static void main(String[] args) {
		SystemSpeaker systemSpeaker = SystemSpeaker.getSystemSpeakerInstance();
		SystemSpeaker systemSpeaker2 = SystemSpeaker.getSystemSpeakerInstance();
		
		systemSpeaker.setVolumn(5);
		System.out.println(systemSpeaker.getVolumn());
		System.out.println(systemSpeaker2.getVolumn());
		
		systemSpeaker2.setVolumn(10);
		System.out.println(systemSpeaker.getVolumn());
		System.out.println(systemSpeaker2.getVolumn());
	}
	
}

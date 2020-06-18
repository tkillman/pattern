package pattern.ch05;

public class SystemSpeaker {
	
	private int volumn;
	
	private static SystemSpeaker systemSpeakerInstance;
	
	private SystemSpeaker() {
		
	}
	
	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}

	public static SystemSpeaker getSystemSpeakerInstance() {
		
		if (systemSpeakerInstance == null) {
			systemSpeakerInstance = new SystemSpeaker();
		}
		
		return systemSpeakerInstance;
	}
}

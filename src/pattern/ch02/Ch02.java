package pattern.ch02;

public class Ch02 {
	
	public static void main(String[] args) {
		
		AbstGameConnector AbstGameConnector = new AbstGameConnectorImpl();
		
		String str = "aa"; // 로그인 정보
		AbstGameConnector.requestConnection(str);
		
	}
}

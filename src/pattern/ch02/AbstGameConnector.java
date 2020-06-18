package pattern.ch02;

public abstract class AbstGameConnector {
	
	protected abstract String doSecurity(String string); //보완
	protected abstract boolean authentication(String id, String password); // 로그인 체크
	protected abstract int authorization(String userName); // 로그인자의 권한확인
	protected abstract String connection(String info); //접속
	
	public String requestConnection(String str){
		// 보안 작업 -> 암호화 된 문자열을 복호화
		String decodedInfo = doSecurity(str);
		
		//반환된 것을 가지고 아이디, 암호를 받는다.
		String id = "aa";
		
		if(!authentication(id, decodedInfo)) {
			throw new Error("아이디 암호 불일치");
		}
		
		int i = authorization(id);
		
		switch (i) {
			case 0:
				//유료회원
				break;
			case 1:
				//무료회원
				break;
			default:
				//신규유저
				break;
		}		
		
		
		return connection(str);
	}
	
	
}

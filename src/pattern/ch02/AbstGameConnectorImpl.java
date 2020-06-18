package pattern.ch02;

public class AbstGameConnectorImpl extends AbstGameConnector {

	@Override
	protected String doSecurity(String string) {
		// TODO Auto-generated method stub
		System.out.println("복호화 과정");
		return null;
	}

	@Override
	protected boolean authentication(String id, String password) {
		// TODO Auto-generated method stub
		System.out.println("로그인 체크 과정");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		// TODO Auto-generated method stub
		System.out.println("유저의 권한 확인");
		return 0;
	}

	@Override
	protected String connection(String info) {
		// TODO Auto-generated method stub
		System.out.println("마지막 접속단계");
		return null;
	}

}

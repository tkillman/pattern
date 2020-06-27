package pattern.ch01;

public class Ch01 {

	public static void main(String[] args) {
		Character character = new Character();
		character.attack(); // 맨손 공격

		character.setWeapon(new Sword());
		character.attack(); // 칼로 공격

		character.setWeapon(new Ax());
		character.attack(); // 도끼로 공격
	}
}

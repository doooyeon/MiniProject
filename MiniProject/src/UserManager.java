
public class UserManager {
	/* �ӽ� Ŭ���� 
	 * ���� ���ɼ� ����*/

	public static boolean createUser(String ID, String pwd) {
		/* �ؽ��Լ��� ���ڵ� �� DB�� ���� */
		/* ����� DB�� ��θ� ���� �����Ͽ� ���� */
		return true;
	}

	public static boolean removeUser(String ID, String pwd) {
		/* ���� ���� */
		return true;
	}

	public static boolean confirmUser(String ID, String pwd) {
		/* ������ �ؽð��� DB�� �ؽ� �� �� ��, ���� ���� */
		return true;
	}
	
	public static boolean saveBestScore(User user, int score) {
		user.setBestScore(score);
		saveUserData(user);
		return true;
	}
	
	public static boolean saveLastStage(User user, int stage) {
		user.setLastStage(stage);
		saveUserData(user);
		return true;
	}

	public static boolean saveUserData(User user) {
		/* ���Ͽ� ���� */
		return true;
	}
}

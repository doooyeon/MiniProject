
public class UserManager {
	/* 임시 클래스 
	 * 삭제 가능성 있음*/

	public static boolean createUser(String ID, String pwd) {
		/* 해시함수로 인코딩 후 DB에 저장 */
		/* 사용자 DB는 경로를 직접 설정하여 생성 */
		return true;
	}

	public static boolean removeUser(String ID, String pwd) {
		/* 위와 동일 */
		return true;
	}

	public static boolean confirmUser(String ID, String pwd) {
		/* 생성된 해시값과 DB의 해시 값 비교 후, 접속 승인 */
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
		/* 파일에 쓰기 */
		return true;
	}
}

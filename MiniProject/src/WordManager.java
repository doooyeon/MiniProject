import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class WordManager {
	private Vector<Word> list; // 출현된 단어들을 관리하는 배열
	private ArrayList<String> entry; // 텍스트 파일에 있는 단어 복사

	// 단어들 하강에 필요한 좌표와 기울기 정보
	private static final int BOUND_X = 1017;
	private static final int BOUND_Y = 740;
	private static final int APPEARANCE_X1 = 643;
	private static final int APPEARANCE_X2 = 1017;
	private static final int LIMIT_X1 = 26;
	private static final int LIMIT_X2 = 515;
	private static final int START_Y = 517;
	private static final int END_Y = 358;
	private static final double BOUND_SLOPE = 182.0 / 418.0;

	// 파일에서 
	public WordManager() {
		/* 파일 입출력으로 파일의 모든 단어를 entry 배열에 삽입 */
	}

	// 단어를 생성하여 list에 삽입
	public void createWord() {
		int next;
		while (true) {
			if (/* list내에 중복된 단어 없는지 체크 */ true) {
				next = (int) (Math.random() * entry.size()); // entry 내 랜덤하게 단어 선출
				break;
			}
		}
		String nextWord = entry.get(next); // 단어 결정
		int appearanceX = (int) (Math.random() * (APPEARANCE_X2 - APPEARANCE_X1) + APPEARANCE_X1); // 출현 x 좌표 랜덤 선정
		int appearanceY = getAppearanceY(appearanceX); // x좌표에 따른 y좌표 설정
		double slope = getSlope(appearanceX); // 출현 위치에 따른 하강 기울기 결정

		list.add(new Word(nextWord, 1, slope, appearanceX, appearanceY)); // list에 단어 추가
	}
	
	// 단어를 리스트에서 제거
	public void removeWord(int index) {
		list.remove(index);
		/* 만약에 구한 동물 모션을 추가하려면 
		 * 단어 클래스에 boolean lifeFlag; 라는 맴버를 추가해서 false일때 다른 모션 출력하도록 함 */
	}

	// 단어들을 이동시키는 메소
	public void flowWord() {
		/* 단어 전체 순환하면서 좌표 이동 */
		Iterator<Word> it = list.iterator();
		while (it.hasNext()) { // 리스트 내 단어 전체 순환
			it.next().setLocation();

		}
		if (/* 단어 객체가 일정한 위치에 도달하면 */true) {
			removeWord(/*해당 단어 인덱스*/0);
		}
	}

	public double getSlope(int x) {
		int limitX = (x - APPEARANCE_X1) * (LIMIT_X2 - LIMIT_X1) / (APPEARANCE_X2 - APPEARANCE_X1) + LIMIT_X1;
		int slope = (START_Y - END_Y) / (x - limitX);
		return slope;
	}

	// 단어가 출현할 x좌표에 따른 y좌표 반환
	private int getAppearanceY(int x) {
		int appearanceY = (int) (BOUND_SLOPE * (x - BOUND_X));
		return appearanceY;
	}

}

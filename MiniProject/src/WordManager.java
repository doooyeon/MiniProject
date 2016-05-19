import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class WordManager {
	private Vector<Word> list; // ������ �ܾ���� �����ϴ� �迭
	private ArrayList<String> entry; // �ؽ�Ʈ ���Ͽ� �ִ� �ܾ� ����

	// �ܾ�� �ϰ��� �ʿ��� ��ǥ�� ���� ����
	private static final int BOUND_X = 1017;
	private static final int BOUND_Y = 740;
	private static final int APPEARANCE_X1 = 643;
	private static final int APPEARANCE_X2 = 1017;
	private static final int LIMIT_X1 = 26;
	private static final int LIMIT_X2 = 515;
	private static final int START_Y = 517;
	private static final int END_Y = 358;
	private static final double BOUND_SLOPE = 182.0 / 418.0;

	// ���Ͽ��� 
	public WordManager() {
		/* ���� ��������� ������ ��� �ܾ entry �迭�� ���� */
	}

	// �ܾ �����Ͽ� list�� ����
	public void createWord() {
		int next;
		while (true) {
			if (/* list���� �ߺ��� �ܾ� ������ üũ */ true) {
				next = (int) (Math.random() * entry.size()); // entry �� �����ϰ� �ܾ� ����
				break;
			}
		}
		String nextWord = entry.get(next); // �ܾ� ����
		int appearanceX = (int) (Math.random() * (APPEARANCE_X2 - APPEARANCE_X1) + APPEARANCE_X1); // ���� x ��ǥ ���� ����
		int appearanceY = getAppearanceY(appearanceX); // x��ǥ�� ���� y��ǥ ����
		double slope = getSlope(appearanceX); // ���� ��ġ�� ���� �ϰ� ���� ����

		list.add(new Word(nextWord, 1, slope, appearanceX, appearanceY)); // list�� �ܾ� �߰�
	}
	
	// �ܾ ����Ʈ���� ����
	public void removeWord(int index) {
		list.remove(index);
		/* ���࿡ ���� ���� ����� �߰��Ϸ��� 
		 * �ܾ� Ŭ������ boolean lifeFlag; ��� �ɹ��� �߰��ؼ� false�϶� �ٸ� ��� ����ϵ��� �� */
	}

	// �ܾ���� �̵���Ű�� �޼�
	public void flowWord() {
		/* �ܾ� ��ü ��ȯ�ϸ鼭 ��ǥ �̵� */
		Iterator<Word> it = list.iterator();
		while (it.hasNext()) { // ����Ʈ �� �ܾ� ��ü ��ȯ
			it.next().setLocation();

		}
		if (/* �ܾ� ��ü�� ������ ��ġ�� �����ϸ� */true) {
			removeWord(/*�ش� �ܾ� �ε���*/0);
		}
	}

	public double getSlope(int x) {
		int limitX = (x - APPEARANCE_X1) * (LIMIT_X2 - LIMIT_X1) / (APPEARANCE_X2 - APPEARANCE_X1) + LIMIT_X1;
		int slope = (START_Y - END_Y) / (x - limitX);
		return slope;
	}

	// �ܾ ������ x��ǥ�� ���� y��ǥ ��ȯ
	private int getAppearanceY(int x) {
		int appearanceY = (int) (BOUND_SLOPE * (x - BOUND_X));
		return appearanceY;
	}

}

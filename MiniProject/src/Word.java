import java.awt.Color;

import javax.swing.JLabel;

public class Word extends JLabel {
	String word; // �ܾ�
	// �ܾ��� ������ �Ҹ� ������ x��ǥ�� �������� �Ѵ�.
	int startX; // ����� ���� x��ǥ
	int endX; // ������ ���� x��ǥ
	int cntMoveX; // y�� 1pxl �̵��ϱ� ������ x�� �̵� Ƚ��
	int speed; // �ӵ�
	double slope; // ����
	String type; // ���� Ÿ��

	public Word(String word, int speed, double slope, int x, int y) {

		this.word = word;
		this.speed = speed;
		this.slope = slope;
		this.setText(word); // �����ʿ�
		cntMoveX = 1;
	}

	public Word(String word) {
		this.word = word;
		setText(word);
		setSize(200, 50);
		setForeground(Color.black);

	} //test2


	public boolean equals(String word) {
		if (this.word.equals(word)) {
			return true;
		}
		return false;
	}

	public void setLocation2() {
		int dy = (int) (speed * slope * cntMoveX++);
		if (dy >= 1) {
			cntMoveX = 0;
		}
		int x = this.getX();
		int y = this.getY();

		this.setLocation(x + speed, y + dy);
	}

	public void setLocation() {
		/* ���� ���ɼ� ���� */
		int dy = (int) (speed * slope * cntMoveX);
		if (dy < 1) {
			cntMoveX++;
		}
		else {
			cntMoveX = 0;
		}
		int x = this.getX();
		int y = this.getY();

		this.setLocation(x + speed, y + dy);
		/* �ܾ� �̹����� ��ǥ�� ���� */
		/* �ٽ� �׷���� �ϳ�? */
	}

	public boolean isEnd() {
		if (this.getX() < endX) {
			return false;
		}
		return true;
	}

	public int getSpeed() {
		return speed;
	}
}
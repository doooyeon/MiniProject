import java.awt.Color;

import javax.swing.JLabel;

public class Word extends JLabel {
	String word; // 단어
	// 단어의 출현과 소멸 기준은 x좌표를 기준으로 한다.
	int startX; // 출발할 때의 x좌표
	int endX; // 도착할 때의 x좌표
	int cntMoveX; // y가 1pxl 이동하기 까지의 x의 이동 횟수
	int speed; // 속도
	double slope; // 기울기
	String type; // 동물 타입

	public Word(String word, int speed, double slope, int x, int y) {

		this.word = word;
		this.speed = speed;
		this.slope = slope;
		this.setText(word); // 수정필요
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
		/* 수정 가능성 있음 */
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
		/* 단어 이미지의 좌표도 변경 */
		/* 다시 그려줘야 하나? */
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
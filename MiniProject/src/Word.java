import java.awt.Color;

import javax.swing.JLabel;

public class Word extends JLabel {
	String word; // �ܾ�
	int speed; // �ӵ�
	double slope; // ����
	String type; // ���� Ÿ��

	public Word(String word, int speed, double slope, int x, int y) {
		this.word = word;
		this.speed = speed;
		this.slope = slope;
	}

	public Word(String word) {
		this.word = word;
		setText(word);
		setSize(200, 50);
		setForeground(Color.black);
	} //test
}
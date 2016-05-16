import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Player extends JPanel {

	User user; // ���� ����
	JLabel nameCard;
	int Life; // ������
	int nowScore; // ���� ����
	int countHitCharecter; // ���� ���� ��(Ÿ���� ����ϱ� ����)
	int typingVelocity; // Ÿ��

	public Player(User user) {
		this.user = user;
		setBounds(20, 40, 200, 50);
		setLayout(new FlowLayout(FlowLayout.CENTER));

		nameCard = new JLabel(user.userName);
		nameCard.setFont(new Font("���� ���", Font.BOLD, 30));
		add(nameCard);

		setOpaque(false);
	}
	
	public void setScore(int score) {
		nowScore = score;
	}
}

class User {
	public String userName = "user";
	private int lastStage; // ������ Ŭ���� ��������
	private int bestScore; // ������ �ְ� ����3

	public void setBestScore(int score) {
		bestScore = score;
	}

	public void setLastStage(int stage) {
		// �������� �Է� ��� ����ұ�...
		lastStage = stage;
	}

	public int getBestScore() {
		return bestScore;
	}

	public int getLastStage() {
		return lastStage;
	}
	
	
}
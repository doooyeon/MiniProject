import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LifeBarPanel extends JPanel {
	ImageIcon filledHeart = new ImageIcon("images/filled_heart.png");
	ImageIcon emptyHeart = new ImageIcon("images/empty_heart.png");
	int maxLife;
	int nowLife;

	public LifeBarPanel() {
		maxLife = 5; // �ӽ�
		nowLife = 3; // �ӽ�
		setLayout(new FlowLayout());
		setBounds(780, 620, 200, 35); // 200, 30

		// ������ ��Ʈ
		for (int i = 0; i < nowLife; i++) {
			JLabel oneLife = new JLabel(filledHeart);
			add(oneLife);
		}

		// ȸ�� ��Ʈ
		for (int i = 0; i < maxLife - nowLife; i++) {
			JLabel oneLife = new JLabel(emptyHeart);
			//oneLife.setForeground(Color.GREEN);
			//oneLife.setBackground(Color.GREEN);
			add(oneLife);
		}
		setOpaque(false);
	}
	
	public void updateLifeBar(/* fail ��ȣ */) {
		/*
		 * �������� �ϳ� ���̰� �ٽ� ���
		 * */
	}
}

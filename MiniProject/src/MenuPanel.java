import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPanel extends BasePanel {
	private MainApp main; // �����гη� ���ư��� ���� �г� ���۷���
	// �г�
	private GameFrame gamePanel = new GameFrame();
	// ��ư
	private JButton btnGameStart = new JButton("�����ϱ�");
	private JButton btnWordSetting = new JButton("�ܾ��Է�");
	private JButton btnRanking = new JButton("��ŷ����");
	private JButton btnLogout = new JButton("�α׾ƿ�");

	public MenuPanel(MainApp mp) {
		super(/*�̹��� ���*/);
		main = mp; // ���� �г� ���� ����
		setBackground(Color.CYAN); // ���� ���� ����

		btnGameStart.setFont(new Font("���� ���", Font.BOLD, 30));
		btnGameStart.setBounds(400, 200, 200, 70);

		btnWordSetting.setFont(new Font("���� ���", Font.BOLD, 30));
		btnWordSetting.setBounds(400, 300, 200, 70);

		btnRanking.setFont(new Font("���� ���", Font.BOLD, 30));
		btnRanking.setBounds(400, 400, 200, 70);

		btnLogout.setFont(new Font("���� ���", Font.BOLD, 30));
		btnLogout.setBounds(400, 500, 200, 70);

		add(btnGameStart);
		add(btnWordSetting);
		add(btnRanking);
		add(btnLogout);

		btnGameStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				main.setContentPane(gamePanel);
			}
		});
		btnWordSetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				/* �ܾ� ���� �г� */
			}
		});
		btnRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				/* ��ŷ �г� */
			}
		});
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				main.setContentPane(main.getMainPanel());
			}
		});
	}

	public BasePanel getBasePanel() {
		return this;
	}

	@Override
	public void initPanel() {

	}
}

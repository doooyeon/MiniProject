import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPanel extends BasePanel {
	private MainAppication main; // �����гη� ���ư��� ���� �г� ���۷���
	// �г�
	private GameFrame gamePanel = new GameFrame();
	// ��ư
	private JButton btnGameStart;
	private JButton btnWordSetting;
	private JButton btnRanking;
	private JButton btnLogout = new JButton("�α׾ƿ�");

	public MenuPanel(MainAppication mp) {
		super("images/menuBG.png");
		setSize(MainAppication.WIDTH, MainAppication.HEIGHT);
		main = mp; // ���� �г� ���� ����
		
		ImageIcon gameIcon = new ImageIcon("images/�����ϱ�.png");
		btnGameStart = new JButton(gameIcon);
		btnGameStart.setBorderPainted(false);
		btnGameStart.setFocusPainted(false);
		btnGameStart.setContentAreaFilled(false);
		btnGameStart.setBounds(445, 100, 370, 100);

		ImageIcon wordIcon = new ImageIcon("images/�ܾ��Է�.png");
		btnWordSetting = new JButton(wordIcon);
		btnWordSetting.setBorderPainted(false);
		btnWordSetting.setFocusPainted(false);
		btnWordSetting.setContentAreaFilled(false);
		btnWordSetting.setBounds(445, 220, 370, 100);
		
		ImageIcon rankingIcon = new ImageIcon("images/��ŷ����.png");
		btnRanking = new JButton(rankingIcon);
		btnRanking.setBorderPainted(false);
		btnRanking.setFocusPainted(false);
		btnRanking.setContentAreaFilled(false);
		btnRanking.setBounds(445, 340, 370, 100);

		
		ImageIcon logoutIcon = new ImageIcon("images/�α׾ƿ�.png");
		btnLogout = new JButton(logoutIcon);
		btnLogout.setBorderPainted(false);
		btnLogout.setFocusPainted(false);
		btnLogout.setContentAreaFilled(false);
		btnLogout.setBounds(445, 460, 370, 100);

		add(btnGameStart);
		add(btnWordSetting);
		add(btnRanking);
		add(btnLogout);

		btnGameStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				main.setContentPane(gamePanel);
			}
		});
		btnGameStart.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg) {
				btnGameStart.setIcon(new ImageIcon("images/�����ϱ�2.png"));
			}
			public void mouseExited(MouseEvent arg) {
				btnGameStart.setIcon(new ImageIcon("images/�����ϱ�.png"));
			}
		});
		
		btnWordSetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				/* �ܾ� ���� �г� */
			}
		});
		btnWordSetting.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg) {
				btnWordSetting.setIcon(new ImageIcon("images/�ܾ��Է�2.png"));
			}
			public void mouseExited(MouseEvent arg) {
				btnWordSetting.setIcon(new ImageIcon("images/�ܾ��Է�.png"));
			}
		});
		
		btnRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				/* ��ŷ �г� */
			}
		});
		btnRanking.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg) {
				btnRanking.setIcon(new ImageIcon("images/��ŷ����2.png"));
			}
			public void mouseExited(MouseEvent arg) {
				btnRanking.setIcon(new ImageIcon("images/��ŷ����.png"));
			}
		});
		
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				main.setContentPane(main.getMainPanel());
			}
		});
		btnLogout.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg) {
				btnLogout.setIcon(new ImageIcon("images/�α׾ƿ�2.png"));
			}
			public void mouseExited(MouseEvent arg) {
				btnLogout.setIcon(new ImageIcon("images/�α׾ƿ�.png"));
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

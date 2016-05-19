import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPanel extends BasePanel {
	private MainAppication main; // 메인패널로 돌아가기 위한 패널 레퍼런스
	// 패널
	private GameFrame gamePanel = new GameFrame();
	// 버튼
	private JButton btnGameStart;
	private JButton btnWordSetting;
	private JButton btnRanking;
	private JButton btnLogout = new JButton("로그아웃");

	public MenuPanel(MainAppication mp) {
		super("images/menuBG.png");
		setSize(MainAppication.WIDTH, MainAppication.HEIGHT);
		main = mp; // 이전 패널 정보 저장
		
		ImageIcon gameIcon = new ImageIcon("images/게임하기.png");
		btnGameStart = new JButton(gameIcon);
		btnGameStart.setBorderPainted(false);
		btnGameStart.setFocusPainted(false);
		btnGameStart.setContentAreaFilled(false);
		btnGameStart.setBounds(445, 100, 370, 100);

		ImageIcon wordIcon = new ImageIcon("images/단어입력.png");
		btnWordSetting = new JButton(wordIcon);
		btnWordSetting.setBorderPainted(false);
		btnWordSetting.setFocusPainted(false);
		btnWordSetting.setContentAreaFilled(false);
		btnWordSetting.setBounds(445, 220, 370, 100);
		
		ImageIcon rankingIcon = new ImageIcon("images/랭킹보기.png");
		btnRanking = new JButton(rankingIcon);
		btnRanking.setBorderPainted(false);
		btnRanking.setFocusPainted(false);
		btnRanking.setContentAreaFilled(false);
		btnRanking.setBounds(445, 340, 370, 100);

		
		ImageIcon logoutIcon = new ImageIcon("images/로그아웃.png");
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
				btnGameStart.setIcon(new ImageIcon("images/게임하기2.png"));
			}
			public void mouseExited(MouseEvent arg) {
				btnGameStart.setIcon(new ImageIcon("images/게임하기.png"));
			}
		});
		
		btnWordSetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				/* 단어 설정 패널 */
			}
		});
		btnWordSetting.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg) {
				btnWordSetting.setIcon(new ImageIcon("images/단어입력2.png"));
			}
			public void mouseExited(MouseEvent arg) {
				btnWordSetting.setIcon(new ImageIcon("images/단어입력.png"));
			}
		});
		
		btnRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				/* 랭킹 패널 */
			}
		});
		btnRanking.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg) {
				btnRanking.setIcon(new ImageIcon("images/랭킹보기2.png"));
			}
			public void mouseExited(MouseEvent arg) {
				btnRanking.setIcon(new ImageIcon("images/랭킹보기.png"));
			}
		});
		
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				main.setContentPane(main.getMainPanel());
			}
		});
		btnLogout.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg) {
				btnLogout.setIcon(new ImageIcon("images/로그아웃2.png"));
			}
			public void mouseExited(MouseEvent arg) {
				btnLogout.setIcon(new ImageIcon("images/로그아웃.png"));
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

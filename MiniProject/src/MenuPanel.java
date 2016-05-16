import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPanel extends BasePanel {
	private MainApp main; // 메인패널로 돌아가기 위한 패널 레퍼런스
	// 패널
	private GameFrame gamePanel = new GameFrame();
	// 버튼
	private JButton btnGameStart = new JButton("게임하기");
	private JButton btnWordSetting = new JButton("단어입력");
	private JButton btnRanking = new JButton("랭킹보기");
	private JButton btnLogout = new JButton("로그아웃");

	public MenuPanel(MainApp mp) {
		super(/*이미지 경로*/);
		main = mp; // 이전 패널 정보 저장
		setBackground(Color.CYAN); // 삭제 예정 라인

		btnGameStart.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btnGameStart.setBounds(400, 200, 200, 70);

		btnWordSetting.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btnWordSetting.setBounds(400, 300, 200, 70);

		btnRanking.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btnRanking.setBounds(400, 400, 200, 70);

		btnLogout.setFont(new Font("맑은 고딕", Font.BOLD, 30));
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
				/* 단어 설정 패널 */
			}
		});
		btnRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				/* 랭킹 패널 */
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

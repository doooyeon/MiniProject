import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainApp extends JFrame {
	private MainPanel mainPanel = new MainPanel(/*이미지 경로*/); // 메인 패널 베이스
	private LoginPanel loginBox; // 로그인 소패널
	private SignUpPanel signupBox; // 회원가입 소패널

	public MenuPanel menuPanel = new MenuPanel(this); // 메뉴

	public MainApp() {
		// 창 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Pass Me a Tube!");
		setSize(1024, 768);
		setContentPane(mainPanel);
		setResizable(false); // 창 크기 조절불가 설정
		this.setLayout(null);

		setLoginPanel(); // 로그인 패널 세팅
		setSignUpPanel(); // 회원가입 패널 세팅
		
		setVisible(true);
	}

	public void setLoginPanel() {
		// 로그인 패널 생성
		loginBox = new LoginPanel(/*좌표 설정*/);

		// '로그인 버튼' 이벤트 설정
		loginBox.getLoginButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				setContentPane(menuPanel);
				revalidate();
				//menuPanel.repaint();
			}
		});

		// '회원가입 버튼' 이벤트 설정
		loginBox.getSignUpButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				//loginBox.setVisible(false);
				signupBox.setVisible(true);
				mainPanel.setComponentZOrder(loginBox, 0);
				//loginBox.setFocusable(false);
			}
		});

		// 패널 부착
		mainPanel.add(loginBox);
	}

	public void setSignUpPanel() {
		// 회원가입 패널 생성
		signupBox = new SignUpPanel(/*좌표 설정*/);

		// '확인 버튼' 이벤트 설정
		signupBox.getOkButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				signupBox.setVisible(false);
				loginBox.setVisible(true);
			}
		});

		// '취소 버튼' 이벤트 설정
		signupBox.getCancelButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				//signupBox.setVisible(false);
				setLoginPanel();
				
			}
		});

		// 패널 부착
		mainPanel.add(signupBox);
		signupBox. setVisible(false); // 안보이게 설정
	}

	public BasePanel getMainPanel() {
		return mainPanel;
	}

	public static void main(String[] arg) {
		new MainApp();
	}
}
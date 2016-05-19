import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainAppication extends JFrame {
	private MainPanel mainPanel = new MainPanel(/*이미지 경로*/); // 메인 패널 베이스
	private LoginPanel loginBox; // 로그인 소패널
	private SignUpPanel signupBox; // 회원가입 소패널
	public MenuPanel menuPanel = new MenuPanel(this); // 메뉴 패널
	
	public static int WIDTH = 1024;
	public static int HEIGHT = 768;

	public MainAppication() {
		// 창 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Pass Me a Tube!");
		setSize(MainAppication.WIDTH, MainAppication.HEIGHT);
		setContentPane(mainPanel);
		//setResizable(false); // 창 크기 조절불가 설정
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
				String id = loginBox.getID().getText().trim(); // 공백 제거 trim() 사용
				String pw = loginBox.getPassword().getText().trim();
				
//				if(!loginBox.checkID(id)) {
//					JOptionPane.showMessageDialog(mainPanel, "존재하지 않는 아이디입니다.", "Message", JOptionPane.ERROR_MESSAGE);
//					return;
//				}
//				else if(!loginBox.checkIdPw(id, pw)) {
//					JOptionPane.showMessageDialog(mainPanel, "아이디와 비밀번호가 일치하지 않습니다.", "Message", JOptionPane.ERROR_MESSAGE);
//					return;
//				}
//				else if(id.length()==0) {
//					JOptionPane.showMessageDialog(mainPanel, "아이디를 입력하세요.", "Message", JOptionPane.ERROR_MESSAGE);
//					return;
//				}
//				else if(pw.length()==0) {
//					JOptionPane.showMessageDialog(mainPanel, "비밀번호를 입력하세요.", "Message", JOptionPane.ERROR_MESSAGE);
//					return;
//				}
//				else {
//					setContentPane(menuPanel);
//					revalidate();
//					repaint();
//				}
				setContentPane(menuPanel);
				revalidate();
				repaint();
			}
		});

		// '회원가입 버튼' 이벤트 설정
		loginBox.getSignUpButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
					loginBox.setVisible(false);
					signupBox.setVisible(true);
					setSignUpPanel();
					//mainPanel.setComponentZOrder(loginBox, 0);
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
				String id = signupBox.getID().getText().trim(); // 공백 제거 trim() 사용
				String pw = signupBox.getPassword().getText().trim();
				String pwc = signupBox.getCheckPassword().getText().trim();
				
				// 길이제한?
				if(!signupBox.checkID(id)) {
					JOptionPane.showMessageDialog(mainPanel, "이미 존재하는 아이디입니다.", "Message", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else if(id.length()==0) {
					JOptionPane.showMessageDialog(mainPanel, "아이디를 입력하세요.", "Message", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else if(pw.length()==0 || pwc.length()==0) {
					JOptionPane.showMessageDialog(mainPanel, "비밀번호를 입력하세요.", "Message", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else if(!pw.equals(pwc)) {
					JOptionPane.showMessageDialog(mainPanel, "비밀번호가 일치하지 않습니다.", "Message", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else {
					signupBox.writeUserInfo();
					signupBox.setVisible(false);
					loginBox.setVisible(true);
				}
			}
		});

		// '취소 버튼' 이벤트 설정
		signupBox.getCancelButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				signupBox.setVisible(false);
				setLoginPanel();

			}
		});

		// 패널 부착
		mainPanel.add(signupBox);
		signupBox.setVisible(false); // 안보이게 설정
	}

	public BasePanel getMainPanel() {
		return mainPanel;
	}

	public static void main(String[] arg) {
		new MainAppication();
	}
}
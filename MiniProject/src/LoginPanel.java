import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends BasePanel {
	private Login UserManager; /* 이렇게 따로 클래스를 만들지 이 안에다 구현할지 고민 */
	// 문자열
	private JLabel stringBoxID = new JLabel("ID");
	private JLabel stringBoxPassWord = new JLabel("PW");
	// 텍스트 필드
	private JTextField IDFeild = new JTextField();
	private JPasswordField passWordField = new JPasswordField();
	// 버튼
	private JButton loginButton = new JButton("로그인");
	private JButton signUpButton = new JButton("회원가입");
	// 파일 읽기
	private FileReader fin = null; 

	public LoginPanel() {
		super(/*이미지 경로*/);
		setBounds(262, 350, 500, 300);
		setBackground(Color.CYAN); // 삭제 예정 라인

		stringBoxID.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		stringBoxID.setBounds(60, 40, 100, 100);

		IDFeild.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		IDFeild.setBounds(130, 75, 270, 40);

		stringBoxPassWord.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		stringBoxPassWord.setBounds(50, 90, 100, 100);

		passWordField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		passWordField.setBounds(130, 125, 270, 40);

		loginButton.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		loginButton.setBounds(130, 190, 130, 40);

		signUpButton.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		signUpButton.setBounds(270, 190, 130, 40);

		add(stringBoxID);
		add(IDFeild);
		add(stringBoxPassWord);
		add(passWordField);
		add(loginButton);
		add(signUpButton);

		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(IDFeild.getText());
				System.out.println(passWordField.getText());
			}
		});

		//System.out.println(IDFeild.getText());
	}
	
	public boolean checkID(String inputID) {
		try {
			fin = new FileReader("C:\\Users\\TEST\\Desktop\\JP_ing\\UserInfo.txt"); // 경로 수정!
			BufferedReader reader = new BufferedReader(fin);
			
			String userInfo = null;
			
			while((userInfo = reader.readLine()) != null) { // 한 줄 단위로 읽어옴
				StringTokenizer ID = new StringTokenizer(userInfo, " "); // " " 기준으로 짜름
				if(ID.nextToken().equals(inputID))
					return true;
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
			System.exit(1);
		}
		return false;
	}
	
	public boolean checkIdPw(String inputID, String inputPW) {
		try {
			fin = new FileReader("C:\\Users\\TEST\\Desktop\\JP_ing\\UserInfo.txt"); // 경로 수정!
			BufferedReader reader = new BufferedReader(fin);
			
			String userInfo = null;
			
			while((userInfo = reader.readLine()) != null) { // 한 줄 단위로 읽어옴
				StringTokenizer token = new StringTokenizer(userInfo, " "); // " " 기준으로 짜름
				String userID = token.nextToken();
				String userPW = token.nextToken();
				if(userID.equals(inputID) && userPW.equals(inputPW))
					return true;
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
			System.exit(1);
		}
		return false;
	}
	
	public void initPanel() {
		IDFeild = new JTextField();
		passWordField = new JPasswordField();
	}
	
	public JTextField getID() {
		return IDFeild;
	}
	
	public JTextField getPassword() {
		return passWordField;
	}

	public JButton getLoginButton() {
		return loginButton;
	}

	public JButton getSignUpButton() {
		return signUpButton;
	}

}

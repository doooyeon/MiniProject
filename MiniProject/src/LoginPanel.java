import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends BasePanel {
	private Login UserManager; /* �̷��� ���� Ŭ������ ������ �� �ȿ��� �������� ��� */
	// ���ڿ�
	private JLabel stringBoxID = new JLabel("ID");
	private JLabel stringBoxPassWord = new JLabel("PW");
	// �ؽ�Ʈ �ʵ�
	private JTextField IDFeild = new JTextField();
	private JPasswordField passWordField = new JPasswordField();
	// ��ư
	private JButton loginButton = new JButton("�α���");
	private JButton signUpButton = new JButton("ȸ������");

	public LoginPanel() {
		super(/*�̹��� ���*/);
		setBounds(262, 350, 500, 300);
		setBackground(Color.CYAN); // ���� ���� ����

		stringBoxID.setFont(new Font("���� ���", Font.BOLD, 30));
		stringBoxID.setBounds(60, 40, 100, 100);

		IDFeild.setFont(new Font("���� ���", Font.BOLD, 20));
		IDFeild.setBounds(130, 75, 270, 40);

		stringBoxPassWord.setFont(new Font("���� ���", Font.BOLD, 30));
		stringBoxPassWord.setBounds(50, 90, 100, 100);

		passWordField.setFont(new Font("���� ���", Font.BOLD, 20));
		passWordField.setBounds(130, 125, 270, 40);

		loginButton.setFont(new Font("���� ���", Font.BOLD, 20));
		loginButton.setBounds(130, 190, 130, 40);

		signUpButton.setFont(new Font("���� ���", Font.BOLD, 20));
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

	public void initPanel() {

	}

	public JButton getLoginButton() {
		return loginButton;
	}

	public JButton getSignUpButton() {
		return signUpButton;
	}

}

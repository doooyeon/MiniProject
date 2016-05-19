import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUpPanel extends BasePanel {
	// ���ڿ�
	JLabel stringBoxID = new JLabel("ID");
	JLabel stringBoxPassword = new JLabel("PW");
	JLabel stringBoxCheckPassword = new JLabel("PWȮ��");
	// �ؽ�Ʈ �ʵ�
	JTextField ID = new JTextField();
	JPasswordField password = new JPasswordField();
	JPasswordField checkPassword = new JPasswordField();
	// ��ư
	JButton btnOK = new JButton("Ȯ��");
	JButton btnCancel = new JButton("���");
	// ���� ����
	private FileWriter fout = null; 
	// ���� �б�
	private FileReader fin = null; 

	public SignUpPanel() {
		super(/*�̹��� ���*/);

		setBounds(262, 350, 500, 300); // ��ǥ, ũ��
		setBackground(Color.LIGHT_GRAY); // ���� ���� ����

		stringBoxID.setFont(new Font("���� ���", Font.BOLD, 30));
		stringBoxID.setBounds(80, 20, 100, 100);

		ID.setFont(new Font("���� ���", Font.BOLD, 20));
		ID.setBounds(160, 55, 270, 40);

		stringBoxPassword.setFont(new Font("���� ���", Font.BOLD, 30));
		stringBoxPassword.setBounds(70, 70, 100, 100);

		password.setFont(new Font("���� ���", Font.BOLD, 20));
		password.setBounds(160, 105, 270, 40);

		stringBoxCheckPassword.setFont(new Font("���� ���", Font.BOLD, 30));
		stringBoxCheckPassword.setBounds(40, 120, 150, 100);

		checkPassword.setFont(new Font("���� ���", Font.BOLD, 20));
		checkPassword.setBounds(160, 155, 270, 40);

		btnOK.setFont(new Font("���� ���", Font.BOLD, 20));
		btnOK.setBounds(160, 220, 130, 40);
		
		btnCancel.setFont(new Font("���� ���", Font.BOLD, 20));
		btnCancel.setBounds(300, 220, 130, 40);

		add(stringBoxID);
		add(ID);
		add(stringBoxPassword);
		add(password);
		add(stringBoxCheckPassword);
		add(checkPassword);
		add(btnOK);
		add(btnCancel);
	}
	
	@SuppressWarnings("deprecation")
	public void writeUserInfo() {
		try {
			fout = new FileWriter("C:\\Users\\TEST\\Desktop\\JP_ing\\UserInfo.txt", true); // ��� ����!
			fout.write(ID.getText() + " " + password.getText() + " " + 0 + " " + 1 + "\n"); // ID PW score stage
			fout.close();
		} catch (IOException e) {
			System.out.println("����� ����");
			System.exit(1);
		}
	}

	public boolean checkID(String inputID) {
		try {
			fin = new FileReader("C:\\Users\\TEST\\Desktop\\JP_ing\\UserInfo.txt"); // ��� ����!
			BufferedReader reader = new BufferedReader(fin);
			
			String userInfo = null;
			
			while((userInfo = reader.readLine()) != null) { // �� �� ������ �о��
				StringTokenizer ID = new StringTokenizer(userInfo, " "); // " " �������� ¥��
				if(ID.nextToken().equals(inputID))
					return false;
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("����� ����");
			System.exit(1);
		}
		return true;
	}

	public JTextField getID() {
		return ID;
	}
	
	public JTextField getPassword() {
		return password;
	}
	
	public JTextField getCheckPassword() {
		return checkPassword;
	}

	public JButton getOkButton() {
		return btnOK;
	}

	public JButton getCancelButton() {
		return btnCancel;
	}

	@Override
	public void initPanel() {

	}
}

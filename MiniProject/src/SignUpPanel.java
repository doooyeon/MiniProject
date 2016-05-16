import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
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
	JButton btnCancel = new JButton("���"); // �̱���

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
		btnOK.setBounds(220, 220, 130, 40);

		add(stringBoxID);
		add(ID);
		add(stringBoxPassword);
		add(password);
		add(stringBoxCheckPassword);
		add(checkPassword);
		add(btnOK);
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

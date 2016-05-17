import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainApp extends JFrame {
	private MainPanel mainPanel = new MainPanel(/*�̹��� ���*/); // ���� �г� ���̽�
	private LoginPanel loginBox; // �α��� ���г�
	private SignUpPanel signupBox; // ȸ������ ���г�
	public MenuPanel menuPanel = new MenuPanel(this); // �޴� �г�
	
	public static int WIDTH = 1024;
	public static int HEIGHT = 768;

	public MainApp() {
		// â ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Pass Me a Tube!");
		setSize(MainApp.WIDTH, MainApp.HEIGHT);
		setContentPane(mainPanel);
		//setResizable(false); // â ũ�� �����Ұ� ����
		this.setLayout(null);

		setLoginPanel(); // �α��� �г� ����
		setSignUpPanel(); // ȸ������ �г� ����

		setVisible(true);
	}

	public void setLoginPanel() {
		// �α��� �г� ����
		loginBox = new LoginPanel(/*��ǥ ����*/);

		// '�α��� ��ư' �̺�Ʈ ����
		loginBox.getLoginButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				String id = loginBox.getID().getText().trim(); // ���� ���� trim() ���
				String pw = loginBox.getPassword().getText().trim();
				
				if(id.equals("")) {
					JOptionPane.showMessageDialog(mainPanel, "���̵� �Է��ϼ���.", "Message", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else if(pw.equals("")) {
					JOptionPane.showMessageDialog(mainPanel, "��й�ȣ�� �Է��ϼ���.", "Message", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else {
					setContentPane(menuPanel);
					// menuPanel.invalidate();
					repaint();
				}
			}
		});

		// 'ȸ������ ��ư' �̺�Ʈ ����
		loginBox.getSignUpButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
					loginBox.setVisible(false);
					signupBox.setVisible(true);
					mainPanel.setComponentZOrder(loginBox, 0);
					//loginBox.setFocusable(false);
			}
		});

		// �г� ����
		mainPanel.add(loginBox);
	}

	public void setSignUpPanel() {
		// ȸ������ �г� ����
		signupBox = new SignUpPanel(/*��ǥ ����*/);

		// 'Ȯ�� ��ư' �̺�Ʈ ����
		signupBox.getOkButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				String id = signupBox.getID().getText().trim(); // ���� ���� trim() ���
				String pw = signupBox.getPassword().getText().trim();
				String pwc = signupBox.getCheckPassword().getText().trim();
				
				// ��������?
				if(id.equals("")) {
					JOptionPane.showMessageDialog(mainPanel, "���̵� �Է��ϼ���.", "Message", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else if(pw.equals("") || pwc.equals("")) {
					JOptionPane.showMessageDialog(mainPanel, "��й�ȣ�� �Է��ϼ���.", "Message", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else if(!pw.equals(pwc)) {
					JOptionPane.showMessageDialog(mainPanel, "��й�ȣ�� ��ġ���� �ʽ��ϴ�.", "Message", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else {
					signupBox.writeUserInfo();
					signupBox.setVisible(false);
					loginBox.setVisible(true);
				}
			}
		});

		// '��� ��ư' �̺�Ʈ ����
		signupBox.getCancelButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				signupBox.setVisible(false);
				setLoginPanel();

			}
		});

		// �г� ����
		mainPanel.add(signupBox);
		signupBox.setVisible(false); // �Ⱥ��̰� ����
	}

	public BasePanel getMainPanel() {
		return mainPanel;
	}

	public static void main(String[] arg) {
		new MainApp();
	}
}
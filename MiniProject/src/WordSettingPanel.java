import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class WordSettingPanel extends BasePanel {
	// �ؽ�Ʈ �ʵ�
	private JTextField textInputBox; // �ܾ� �Է�â
	// ��ư
	private JButton btnWordAdd;
	// �����б�
	private FileWriter fout = null; 
	
	public WordSettingPanel() {
		// â ����
		setSize(MainAppication.WIDTH, MainAppication.HEIGHT);
		setBackground(Color.CYAN); // ���� ���� ����

		textInputBox = new JTextField();
		textInputBox.setBounds(400, 660, 200, 55);
		
		btnWordAdd = new JButton("�ܾ� �߰�");
		btnWordAdd.setBounds(600, 660, 100, 55);

		add(textInputBox);
		add(btnWordAdd);
		
		btnWordAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				try {
					fout = new FileWriter("C:\\Users\\TEST\\Desktop\\JP_ing\\word.txt", true); // ��� ����!
					fout.write(textInputBox.getText() + "\n"); // ID PW score stage
					fout.close();
				} catch (IOException e) {
					System.out.println("����� ����");
					System.exit(1);
				}
			}
		});
	}

	@Override
	public void initPanel() {
		// TODO Auto-generated method stub
		
	}
}
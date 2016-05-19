import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class WordSettingPanel extends BasePanel {
	// 텍스트 필드
	private JTextField textInputBox; // 단어 입력창
	// 버튼
	private JButton btnWordAdd;
	// 파일읽기
	private FileWriter fout = null; 
	
	public WordSettingPanel() {
		// 창 설정
		setSize(MainAppication.WIDTH, MainAppication.HEIGHT);
		setBackground(Color.CYAN); // 삭제 예정 라인

		textInputBox = new JTextField();
		textInputBox.setBounds(400, 660, 200, 55);
		
		btnWordAdd = new JButton("단어 추가");
		btnWordAdd.setBounds(600, 660, 100, 55);

		add(textInputBox);
		add(btnWordAdd);
		
		btnWordAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				try {
					fout = new FileWriter("C:\\Users\\TEST\\Desktop\\JP_ing\\word.txt", true); // 경로 수정!
					fout.write(textInputBox.getText() + "\n"); // ID PW score stage
					fout.close();
				} catch (IOException e) {
					System.out.println("입출력 오류");
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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputPanel extends JPanel {
	JTextField inputField = new JTextField();
	JLabel label = new JLabel("입력");

	public InputPanel(int x, int y, int width, int height) {
		// 해당 패널의 위치, 크기, 배치관리자 설정
		setBounds(x, y, width, height);
		setLayout(null);

		// 입력창 생성 및 위치, 크기 설정
		inputField.setBounds(45, 10, 140, 30); // 크기, 위치 설정
		add(inputField); // 부착

		// 레이블 생성 및 위치, 크기 설정
		label.setBounds(10, 10, 130, 30); // 크기, 위치 설정
		add(label); // 부착
		
		//revalidate();
		//repaint();
	}

	public String typeWord() {
		/* 입력한 단어를 리스트에 전달*/
		return null;
	}

}

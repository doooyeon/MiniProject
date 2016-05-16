import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

abstract public class BasePanel extends JPanel {
	ImageIcon background;
	Image img;

	public BasePanel() {
		setLayout(null);
	}

	// ��� �̹��� ����
	public BasePanel(String file) {
		setLayout(null);
		background = new ImageIcon(file);
		img = background.getImage();
	}

	// �̹��� ���
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, this);
	}
	
	abstract public void initPanel();
}
import java.awt.Color;
import java.awt.Point;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameFrame extends BasePanel {
	private InfoPanel gameInfoBox; // ���ӿ� ���� ������ ���(����, ������, ������, ���� ��)
	private LifeBarPanel lifeBar;
	private InputPanel textInputBox; // �ܾ� �Է�â
	private ScorePanel scoreBox;

	private Player player; // �÷��̾� ��ü (������ ����)
	private Vector<Word> list = new Vector<Word>(); // �ӽ�
	/* ����Ʈ ���� ���� �ִ� �� ���� */

	public GameFrame(/*Player player*/) { // ���� �ʿ�
		super("images/gameBG.png"); // ��� ����
		this.player = new Player(new User()); // ���� �ʿ�

		setSize(MainAppication.WIDTH, MainAppication.HEIGHT); // ũ�� ����

		// �Է�â ����, ��ġ
		textInputBox = new InputPanel(780, 660, 200, 50);
		add(textInputBox);

		// �������� ����, ��ġ
		lifeBar = new LifeBarPanel();
		add(lifeBar);

		// ���� ����, ��ġ
		scoreBox = new ScorePanel();
		add(scoreBox);

		// ����� �̸� ���
		add(player);

		// ������ �̹��� ����
		showInfoPanelImage();

		createWord(); // �ܾ� ����

		//setContentPane(gameBasePanel);
		setVisible(true);
	}

	public void showInfoPanelImage() {
		ImageIcon scoreBoard = new ImageIcon("images/score_board.png");
		JLabel board = new JLabel(scoreBoard);
		board.setBounds(0, 0, 356, 274);
		add(board);

	}

	public void createWord() { // ����ϰ� createWord()?
		/* ��ȹ
		 * 1. �ܾ� ��ü ����,
		 * 2. ������ ��ǥ ����
		 * 3. �ܾ� ��ü contentPane�� add
		 */

		//list.add(new Word("�ܾ�", 0, slope, appearanceX, appearanceY));
	}

	public void setTextInputBox() {

	}

	// �ܾ� �̵��ϰ� ��
	public void flowAnimal(/*(�ܾ� �ڷᱸ��)*/) {
		// �ܾ� ��ü�� ��ǥ �̵�
		while (true) {
			/* ����Ʈ ���� ��� �ܾ� ��ü ��ǥ ���� */
		}
	}

	// �ܾ��� ���� ��ǥ�� ����
	public Point setCoordinate() {
		Point startPosition = new Point();
		// ��ǥ����
		/* ����� �ƿ� ������ ��ġ�� �ܾ���� ������Ű����
		 * ���߿��� ���ٱ� �ȿ��� �ܾ ������ų ���� */
		startPosition.x = (int) (Math.random() * 1000);
		startPosition.y = (int) (Math.random() * 700);
		return startPosition;
	}

	@Override
	public void initPanel() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new GameFrame(/*new Player()*/);
	}

}

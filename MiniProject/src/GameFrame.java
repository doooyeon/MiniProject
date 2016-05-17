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

	private static final int BOUND_X = 1017;
	private static final int BOUND_Y = 740;
	private static final int APPEARANCE_X1 = 643;
	private static final int APPEARANCE_X2 = 1017;
	private static final int LIMIT_X1 = 26;
	private static final int LIMIT_X2 = 515;
	private static final int START_Y = 517;
	private static final int END_Y = 358;
	private static final double BOUND_SLOPE = 182.0 / 418.0;
	

	public GameFrame(/*Player player*/) { // ���� �ʿ�
		super(/*"images/gameBG.png"*/); // ��� ����
		this.player = new Player(new User()); // ���� �ʿ�

		setSize(MainApp.WIDTH, MainApp.HEIGHT); // ũ�� ����

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

		for (int i = 0; i < 50; i++) {
			// ������ x��ǥ�� ���� y��ǥ ����. (x, y)�� �ܾ��� ó�� ���� ��ġ
			int appearanceX = (int) (Math.random() * (APPEARANCE_X2 - APPEARANCE_X1) + APPEARANCE_X1);
			int appearanceY = getAppearanceY(appearanceX);
			System.out.println("(" + appearanceX + ", " + appearanceY + ")");
			Word word = new Word("�ܾ�");
			word.setLocation(appearanceX, appearanceY);
			add(word);
		}

		//list.add(new Word("�ܾ�", 0, slope, appearanceX, appearanceY));
	}

	// �� �ܾ��� ���������� ���� ����
	public double getSlope(int x) {
		int limitX = (x - APPEARANCE_X1) * (LIMIT_X2 - LIMIT_X1) / (APPEARANCE_X2 - APPEARANCE_X1) + LIMIT_X1;
		int slope = (START_Y - END_Y) / (x - limitX);
		return slope;
	}

	// �ܾ ������ x��ǥ�� ���� y��ǥ ��ȯ
	private int getAppearanceY(int x) {
		int appearanceY = (int) (BOUND_SLOPE * (x - BOUND_X));
		return appearanceY;
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

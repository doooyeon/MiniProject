import java.awt.Color;
import java.awt.Point;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameFrame extends BasePanel {
	private InfoPanel gameInfoBox; // 게임에 대한 정보를 출력(점수, 라이프, 아이템, 레벨 등)
	private LifeBarPanel lifeBar;
	private InputPanel textInputBox; // 단어 입력창
	private ScorePanel scoreBox;

	private Player player; // 플래이어 객체 (프레임 포함)
	private Vector<Word> list = new Vector<Word>(); // 임시
	/* 리스트 내의 동물 최대 수 결정 */

	public GameFrame(/*Player player*/) { // 수정 필요
		super("images/gameBG.png"); // 배경 삽입
		this.player = new Player(new User()); // 수정 필요

		setSize(MainAppication.WIDTH, MainAppication.HEIGHT); // 크기 설정

		// 입력창 생성, 배치
		textInputBox = new InputPanel(780, 660, 200, 50);
		add(textInputBox);

		// 라이프바 생성, 배치
		lifeBar = new LifeBarPanel();
		add(lifeBar);

		// 점수 생성, 배치
		scoreBox = new ScorePanel();
		add(scoreBox);

		// 사용자 이름 출력
		add(player);

		// 나무판 이미지 생성
		showInfoPanelImage();

		createWord(); // 단어 생성

		//setContentPane(gameBasePanel);
		setVisible(true);
	}

	public void showInfoPanelImage() {
		ImageIcon scoreBoard = new ImageIcon("images/score_board.png");
		JLabel board = new JLabel(scoreBoard);
		board.setBounds(0, 0, 356, 274);
		add(board);

	}

	public void createWord() { // 평범하게 createWord()?
		/* 계획
		 * 1. 단어 객체 생성,
		 * 2. 랜덤한 좌표 설정
		 * 3. 단어 객체 contentPane에 add
		 */

		//list.add(new Word("단어", 0, slope, appearanceX, appearanceY));
	}

	public void setTextInputBox() {

	}

	// 단어 이동하게 함
	public void flowAnimal(/*(단어 자료구조)*/) {
		// 단어 객체의 좌표 이동
		while (true) {
			/* 리스트 내에 모든 단어 객체 좌표 변경 */
		}
	}

	// 단어의 출현 좌표를 설정
	public Point setCoordinate() {
		Point startPosition = new Point();
		// 좌표설정
		/* 현재는 아예 랜덤한 위치에 단어들을 출현시키지만
		 * 나중에는 강줄기 안에만 단어를 출현시킬 예정 */
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

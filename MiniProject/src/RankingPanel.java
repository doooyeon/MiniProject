import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

public class RankingPanel extends JPanel {
	//MainApp pane;


	public RankingPanel(MainApp mf) {
		//pane = mf;
		setBackground(Color.lightGray);
		this.setLayout(null);
		// 역전 앞 
		String[] header = { "순위", "ID", "점수" };
		String[][] contents = { { "1", "gods", "1000" }, { "2", "godh", "999" }, { "3", "god", "998" }, { "4", "godsh", "997" },
				{ "5", "godssh", "996" }, { "6", "godsssh", "995" }, { "7", "godsssh", "995" }, { "8", "godsssh", "995" }, { "9", "godsssh", "995" },
				{ "10", "godsssh", "995" } };

		JTable score = new JTable(contents, header);

		score.getColumn("순위").setPreferredWidth(10);
		score.getColumn("ID").setPreferredWidth(90);
		score.getColumn("점수").setPreferredWidth(90);

		score.setRowHeight(40);
		score.setFont(new Font("맑은 고딕", Font.BOLD, 30));

		JScrollPane sc = new JScrollPane(score);
		sc.setBounds(250, 100, 500, 425);

		add(sc);

		// DefaultTableCellHeaderRenderer 생성 (가운데 정렬을 위한)
		DefaultTableCellRenderer tScheduleCellRenderer = new DefaultTableCellRenderer();
		// DefaultTableCellHeaderRenderer의 정렬을 가운데 정렬로 지정
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		// 정렬할 테이블의 ColumnModel을 가져옴
		TableColumnModel tcmSchedule = score.getColumnModel();
		// 반복문을 이용하여 테이블을 가운데 정렬로 지정
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
			tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
		}

		score.getTableHeader().setReorderingAllowed(false);

		JComboBox searchCombo = new JComboBox();
		searchCombo.addItem("ID");
		searchCombo.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		searchCombo.setBounds(250, 550, 115, 40);

		JTextField search = new JTextField();
		search.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		search.setBounds(365, 550, 285, 40);

		JButton btn = new JButton("검색");
		btn.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btn.setBounds(650, 550, 100, 40);

		JButton btn2 = new JButton("뒤로");
		btn2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btn2.setBounds(900, 670, 100, 40);

		add(searchCombo);
		add(search);
		add(btn);
		add(btn2);

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//pane.setContentPane(pane.MenuPanel);
				//pane.revalidate();
				//pane.repaint();
			}
		});

	}

	public static void main(String[] args) {
		new RankingPanel(new MainApp());
	}
}

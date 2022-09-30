package appliarray;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TwoDemensionalTable {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 200);

		String[] header = { "a", "b", "c" };
		String[][] contents = { { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" }, { "1", "2", "3" },
				{ "1", "2", "3" } };

		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);

		f.setVisible(true);

		for (int i = 0; i < contents.length; i++) {
			System.out.print("contents[" + i + "] = { ");
			for (int j = 0; j < contents[i].length; j++) {
				System.out.print(contents[i][j]);
				if (j == contents[i].length - 1) {
					System.out.print(" ");
				} else {
					System.out.print(", ");
				}
			}
			System.out.println("}");
		}
	}

}

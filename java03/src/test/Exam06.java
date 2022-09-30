package test;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Exam06 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);

		String[] header = { "컴퓨터", "영어", "수학", "체육" };
		String[][] contents = { { "100", "88", "99", "77" }, { "60", "87", "79", "78" }, { "90", "83", "89", "79" },
				{ "100", "88", "99", "77" }, { "60", "87", "79", "78" }, { "90", "83", "89", "79" },
				{ "100", "88", "99", "77" }, { "60", "87", "79", "78" }, { "90", "83", "89", "79" } };

		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);

		f.setVisible(true);
	}

}

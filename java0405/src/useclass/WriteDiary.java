package useclass;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class WriteDiary {
	private static JTextField date;
	private static JTextField header;

	public void open() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 128));
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 날짜");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(50, 61, 115, 50);
		f.getContentPane().add(lblNewLabel_1);
		
		date = new JTextField();
		date.setFont(new Font("굴림", Font.BOLD, 20));
		date.setColumns(10);
		date.setBounds(177, 61, 245, 50);
		f.getContentPane().add(date);
		
		JLabel lblNewLabel_1_1 = new JLabel("오늘의 제목");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(50, 121, 115, 50);
		f.getContentPane().add(lblNewLabel_1_1);
		
		header = new JTextField();
		header.setFont(new Font("굴림", Font.BOLD, 20));
		header.setColumns(10);
		header.setBounds(177, 121, 245, 50);
		f.getContentPane().add(header);
		
		JLabel lblNewLabel_1_2 = new JLabel("오늘의 내용");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(50, 265, 115, 50);
		f.getContentPane().add(lblNewLabel_1_2);
		
		JTextArea content = new JTextArea();
		content.setFont(new Font("굴림", Font.BOLD, 20));
		content.setBounds(177, 192, 245, 224);
		f.getContentPane().add(content);
		
		JButton saveBtn = new JButton("파일에 일기 저장");
		saveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 자바 프로그램 밖에 있는 자원들(네트워크, DB프로그램, 파일, etc)을 연결할 때
				try {
					// 자바 프로그램과 파일 간에 스트림(강물, 연결통로) 생성
					FileWriter fw = new FileWriter("file/" + header.getText() + ".txt");
					
					// 스트림을 통해 데이터 전송
					fw.write("오늘의 날짜 : " + date.getText() + "\n");
					fw.write("오늘의 제목: " + header.getText() + "\n");
					fw.write("오늘의 내용: " + content.getText() + "\n");
					
					// 스트림 닫힐 때 데이터 전송 완료 인식 (생성, 저장)
					fw.close();
					
					File file = new File("file/" + header.getText() + ".txt");
					if (file.exists()) {
						JOptionPane.showMessageDialog(f, "파일이 저장되었습니다!");						
					} else {
						JOptionPane.showMessageDialog(f, "파일 저장에 실패했습니다!");
					}
				} catch (Exception ex) {
					System.out.println("파일 저장 중 에러 발생!");
					ex.printStackTrace();
				}
			}
		});
		saveBtn.setFont(new Font("굴림", Font.BOLD, 20));
		saveBtn.setBounds(50, 445, 372, 66);
		f.getContentPane().add(saveBtn);
		
		f.setVisible(true);
	}
}

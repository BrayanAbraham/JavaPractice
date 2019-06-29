package msit;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class MyFrame3 extends Frame implements ActionListener{

	Label l1,l2;
	TextField t1,t2;
	Button b1;
	String s1,s2,s3;
	public MyFrame3() {
		this.setVisible(true);
		this.setSize(300,300);
		this.setTitle("Login");
		Font f= new Font("Arial", Font.BOLD, 20);
		this.setFont(f);
		this.setResizable(true);
		l1=new Label("Name");
		l2=new Label("Class");
		this.setLayout(new FlowLayout());
		l1.setBounds(10, 10, 50, 15);
		l2.setBounds(40, 10, 50, 15);
		t1 = new TextField();
		t2 = new TextField();
		b1 = new Button("Submit");
		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(b1);
		b1.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		s3=e.getActionCommand();
		if(s3.equals("Submit")){
			s1="Name: "+t1.getText();
			s2="Class: "+t2.getText();
			this.setBackground(Color.RED);
		}
	}
	
	public void paint(Graphics g) {
        g.drawString(s1, 10, 150);
        g.drawString(s2, 10, 175);
	}
}

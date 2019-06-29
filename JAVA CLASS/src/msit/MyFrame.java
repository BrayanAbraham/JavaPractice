package msit;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class MyFrame extends Frame implements ActionListener{

	Button b1,b2,b3;
	String s2=" ";
	public MyFrame(){
		this.setVisible(true);
		this.setSize(300, 300);
		this.setTitle("Color Changer");
		Font f = new Font("Arial",Font.BOLD,20);
		this.setFont(f);
		this.setResizable(true);
		b1 = new Button("SUBMIT");
		b2 = new Button("BLUE");
		b3 = new Button("GREEN");
		this.setLayout(new FlowLayout());
		this.add(b1);
		this.add(b2);
		this.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	 public void paint(Graphics g) {
	        g.drawString(s2, 75, 100);
	 }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = e.getActionCommand();
		/*s2=s1;*/
		if(s1.equals("SUBMIT")){
			this.setBackground(Color.YELLOW);
			s2="NEW";
		}
		if(s1.equals("RED")){
			this.setBackground(Color.RED);
			s2="THIS IS RED COLOR";
		}
		if(s1.equals("BLUE")){
			this.setBackground(Color.BLUE);
			s2="THIS IS BLUE COLOR";
		}
		if(s1.equals("GREEN")){
			this.setBackground(Color.GREEN);
			s2="THIS IS GREEN COLOR";
		}
	}

}
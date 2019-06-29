//package test;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyApplet extends Applet implements ActionListener{

	Button b;
	public void init(){
		System.out.println("Applet Initialized");
		b=new Button("Change Color");
		b.setBounds(50, 100, 50, 50);
		b.addActionListener(this);
		this.add(b);
		this.setBackground(Color.RED);
	}
	
	public void start(){
		System.out.println("Applet Started");
	}
	
	public void paint(Graphics g){
		System.out.println("Applet painting");
		g.drawString("Welcome to My Applet", 100, 50);
	}
	
	public void stop(){
		System.out.println("Applet Stopped");
	}
	
	public void destroy(){
		System.out.println("Applet Destroyed");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s=e.getActionCommand();
		if(s.equals("Change Color")){
			this.setBackground(Color.CYAN);
		}
	}
}

/*<applet code="MyApplet.class" height=300 width=300>
</applet>*/
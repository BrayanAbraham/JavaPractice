package msit;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class MyFrame2 extends Frame implements KeyListener,MouseListener {

	Label l;
	TextField t;
	public MyFrame2(){
		this.setVisible(true);
		this.setSize(500, 500);
		this.setTitle("Lets Play With Mouse And Keys");
		this.setResizable(true);
		Font f = new Font("Arial", Font.BOLD,20);
		this.setFont(f);
		l=new Label("Name:");
		l.setSize(200, 200);
		t=new TextField();
		//t.setBounds(20,80,100,100);
		t.addKeyListener(this);
		this.add(l);
		this.add(t);
		//this.setLayout(new FlowLayout());
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

	@Override
	public void keyTyped(KeyEvent e) {
		l.setText("Key Typed");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		l.setText("Key Pressed");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		l.setText("Key Released");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

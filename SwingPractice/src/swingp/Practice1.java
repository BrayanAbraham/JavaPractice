package swingp;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Practice1 {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	
	public Practice1(){
		prepareGUI();
	}
	private void prepareGUI() {
		mainFrame=new JFrame("Swing Practice");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));
		
		headerLabel=new JLabel("",JLabel.CENTER);
		statusLabel=new JLabel("",JLabel.CENTER);
		statusLabel.setSize(350, 100);
		
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
			System.exit(0);
			}
		});
		
		controlPanel=new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		Practice1 p=new Practice1();
		p.showEventDemo();
	}
	private void showEventDemo() {
		headerLabel.setText("Control action:Button");
		
		JButton okButton=new JButton("OK");
		JButton submitButton = new JButton("Submit");
		JButton cancelButton = new JButton("Cancel");
		
		okButton.setActionCommand("OK");
		submitButton.setActionCommand("Submit");
		cancelButton.setActionCommand("Cancel");
		
		okButton.addActionListener(new ButtonClickListener());
		submitButton.addActionListener(new ButtonClickListener());
		cancelButton.addActionListener(new ButtonClickListener());
		
		controlPanel.add(okButton);
		controlPanel.add(submitButton);
		controlPanel.add(cancelButton);
		
		mainFrame.setVisible(true); 
	}
	
	private class ButtonClickListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String command=e.getActionCommand();
			
			if(command.equals("OK")){
				statusLabel.setText("OK Button Selected");
			} else if(command.equals("Submit")){
				statusLabel.setText("Submit Button Selected");
			} else {
				statusLabel.setText("Cancel Button Selected");
			}

		}

	}

}

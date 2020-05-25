package screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import code.CLogic;

public class CScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JButton btn;
	private JLabel title;
	private JTextField txtF;
	private JTextField txtFR;
	private String msg ;
	

	CLogic s = new CLogic();
	
	public CScreen(){
		
		setTitle("Code");
		setSize(800,400);
		setLayout(null);
		
		title = new JLabel("/C  O  D  E");
		title.setBounds(360, 50, 200, 20);
			
	
		btn = new JButton("Click to code!");
		btn.setBounds(285, 200, 200, 50);
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				msg = txtF.getText();
				Entry();
				txtFR.setText(s.getSaida());
			}

			
		});
		
		txtF = new JTextField();
		txtF.setEditable(true);
		txtF.setBounds(200, 130, 380, 35);
		
		txtF.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
					msg = txtF.getText();
					Entry();
					txtFR.setText(s.getSaida());
				}
			}
		});
		
		txtFR = new JTextField();
		txtFR.setEditable(false);
		txtFR.setBounds(200,300,380,35);
		
		add(title);
		add(txtF);
		add(btn);
		add(txtFR);
		
		
	}
	
	void Entry() {
		s.setMsg(msg);
		s.codificar();
	}
	
}

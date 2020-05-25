package screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainScreen extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JButton code;
	private JButton decode;
	private JLabel title;
	
	
	CScreen cs = new CScreen();
	DScreen ds = new DScreen();
	
	public MainScreen() {
		
		
		setTitle("ENCRYPT");
		setSize(800,400);
		setLayout(null);
		
		title = new JLabel("E N C R Y P T");
		title.setBounds(360, 50, 200, 20);
		
		code = new JButton("To code");
		code.setBounds(300, 250, 200, 20);
		code.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				toScreen(0);
			}
		});
		
		
		decode = new JButton("To decode");
		decode.setBounds(300, 280, 200, 20);
		decode.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				toScreen(1);
			}
		});
		
		add(title);
		add(code);
		add(decode);
	}
	
	private void toScreen(int src) {
		if(src == 0) {
			cs.setVisible(true);
		}else
			ds.setVisible(true);
	}

}

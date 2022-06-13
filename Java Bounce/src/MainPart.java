import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainPart {
	/* Here we will have JFrame created in main section
	 * then we will create another class which will extend the JPanel
	 * Use extended class as mainpane of the JFrame
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame w=new JFrame();
		
		w.setBounds(100,100,800,630);
		w.setTitle("Hello Window");
		w.setResizable(false);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BgPanel bg=new BgPanel();
		bg.setBackground(Color.white);
		
		w.setContentPane(bg);
		w.setVisible(true);
		
	}

}

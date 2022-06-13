import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BgPanel extends JPanel{
	// arrays
	BufferedImage img;
	JPanel[] j=new JPanel[5];
	public BgPanel() {
		setLayout(null);
		int x1=100;
		for(int i=0;i<5;i++)
		{
			j[i]=new JPanel();
			j[i].setBounds(x1, 100, 50, 50);
			j[i].setBackground(Color.red);
			add(j[i]);
			x1=x1+52;
		}
		URL imgURL = getClass().getResource("/ball2.png");
		System.out.println(imgURL);
		try {
			img=ImageIO.read(imgURL);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void paintComponent(Graphics g)
	{
		g.drawLine(300, 400, 100, 100);
		g.drawImage(img, 400,400,this);
		g.drawImage(img, 500, 100, 550, 150, 0, 0, img.getWidth(), img.getHeight(), this);
	}
}

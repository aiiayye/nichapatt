import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	private BufferedImage bg;	
	Graphics2D bg2;

	public GamePanel() {
		bg = new BufferedImage(400, 610, BufferedImage.TYPE_INT_ARGB);
		bg2 = (Graphics2D) bg.getGraphics();
		bg2.setBackground(Color.BLACK);
		bg2.clearRect(0, 0, 400, 610);
	}


	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(bg, null, 0, 0);
	}

}
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	private BufferedImage bg;	
	Graphics2D bg2;
	ArrayList<Sprite> sprites = new ArrayList<Sprite>();

	public GamePanel() {
		bg = new BufferedImage(400, 610, BufferedImage.TYPE_INT_ARGB);
		bg2 = (Graphics2D) bg.getGraphics();
		bg2.setBackground(Color.BLACK);
		
	}
	
	public void updateGameUI(GameReporter reporter){
		bg2.clearRect(0, 0, 400, 610);
		bg2.setColor(Color.WHITE);		
		bg2.drawString(String.format("%08d", reporter.getScore()), 300, 20);
		for(Sprite s : sprites){
			s.draw(bg2);
		}
		
		repaint();
	}


	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(bg, null, 0, 0);
	}

}
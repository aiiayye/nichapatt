import java.awt.Color;
import java.awt.Graphics2D;

import java.io.File;
import java.io.IOException;
import java.awt.Image;
import javax.imageio.ImageIO;

public class SpaceShip extends Sprite{

    private Image shipC;
	int step = 8;
	
	public SpaceShip(int x, int y, int width, int height) {
		super(x, y, width, height);
		
		try{
			File file = new File ("spaceShip.png");
			shipC = ImageIO.read(file);
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.drawImage(shipC, x, y, width, height, null);
		
	}

	public void move(int directionLR, int directionUpDw){
		x += (step * directionLR);
		y += (step * directionUpDw);
		if(x < 0 && y < 0){
			x = 0;
			y = 0;
		}
			
		if(x > 400 - width && y > 400 - height){
			x = 400 - width;
			y = 400 - height;
		}
			
	}

}
package island;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;
import java.util.ArrayList;

public class Checklist {
	
	protected ArrayList<Task> tasklist;
	private Image img;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Checklist(Graphics g) {
		/*tasklist = new ArrayList<>();
		Task catchFish = new Task();
		Task buildBridge = new Task();
		Task save = new Task();
		Task collectFlowers = new Task();
		//WalkToTown getToTown = new WalkToTown(g);
		tasklist.add(catchFish);
		tasklist.add(buildBridge);
		tasklist.add(save);
		tasklist.add(collectFlowers);
		//tasklist.add(getToTown);
		*/
		Font stringFont = new Font( "SansSerif", Font.PLAIN, 15 );
		img = getImage("output-onlinepngtools.png");
		g.drawImage(img, 0, 500, null);
		g.setFont(stringFont);
		g.drawString("Arrive at Village", 70, 580);
		g.drawString("Build Bridge", 70, 600);
		g.drawString("Collect Flowers", 70, 620);
		g.drawString("Catch Fish", 70, 640);
	}
	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Sprite.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}

}

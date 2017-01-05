package show;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainActivity extends JFrame implements Runnable {
	private int frameWidth = 1000, frameHeight = 600;
	private JFrame frame;
	private Button startPauseButton;
	private Image s1;
	private Image s2;
	private ImageIcon img1;

	private JLabel imgLabel1;
	Thread animator;
	/**
	 * coordinates of shnappi
	 * */
	private int shnappiS1X, shnappiS2X, shnappiS1Y, shnappiS2Y;

	private Thread thread;
	private Thread soundThread;

	public MainActivity() {
		createAndShowGUI();

		thread = new Thread(this);
		thread.start();
	}

	private void createAndShowGUI() {
		setBounds(100, 100, frameWidth, frameHeight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		initView();
		// playMusic();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, frameWidth, frameHeight);
		g.drawImage(s1, shnappiS1X, shnappiS1Y, this);
//		g.drawImage(s2, shnappiS2X, shnappiS2Y, this);
	}

	private void initView() {
		// startPauseButton = new Button("start");
		// startPauseButton.setSize(50, 50);
		// startPauseButton.setLocation(200, 200);
		try {

			img1 = new ImageIcon(
					"/Users/Blair/Documents/workspace/demo/res/s2.jpg");
			s1 = img1.getImage();
			

			s2 = new ImageIcon(
					"/Users/Blair/Documents/workspace/demo/res/s2.jpg")
					.getImage();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void playMusic() {
		MusicPlayer player = new MusicPlayer();
		player.play("mp3");
	}

	@Override
	public void run() {

		// while (true) {

		// shnappiX++;
		// playMusic();

		Shnappi shnappi = new Shnappi(1);
		shnappi.goLeft(frameWidth, frameHeight - 300);
		// imgLabel1.setLocation(0, 500);
		// }

	}

	public static void main(String[] args) {

		new MainActivity();
	}

	class Shnappi {
		private int type;

		public Shnappi(int type) {
			this.type = type;
		}

		public void goLeft(int coordinateX, int shnappiPositionHeight) {
			switch (type) {
			case 1:
				while (coordinateX > 0) {
					shnappiS1X = --coordinateX;
					repaint();
					try {
						Thread.sleep(10); // we pause the movement for every 20
											// mill
					} catch (Exception e) {
					}
				}
				break;

			default:
				break;
			}

		}

//		public void goRight() {
//			if (shnappiX < frameWidth) {
//				shnappiX++;
//				repaint();
//				try {
//					Thread.sleep(10); // we pause the movement for every 20 mill
//				} catch (Exception e) {
//				}
//			}
//
//		}
	}

}

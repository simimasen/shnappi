package show;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Paint;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TestSWING extends JFrame implements Runnable {
	private int framewidth = 700, frameheight = 500;
	private Image cloud = new ImageIcon(
			"/Users/Blair/Documents/workspace/demo/images/s1.png").getImage();
	private Thread thread;
	private int cloudX = 100;

	public void TestSWING() {
		setBounds(100, 100, framewidth, frameheight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		thread = new Thread(thread);
		thread.start();

	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, framewidth, frameheight);
		g.drawImage(cloud, cloudX, 150, null);
	}

	@Override
	public void run() {
		while (true) {
			cloudX++;
			repaint();
			try {
				Thread.sleep(200);
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {
		new TestSWING();
	}

}

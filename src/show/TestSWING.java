package show;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

import references.JavaGraphics;

public class TestSWING extends JFrame implements Runnable {
	private int frameWidth = 700, frameHeight = 600;
	private Image cloud = new ImageIcon(
			"/Users/Blair/Documents/workspace/demo/images/s1.png").getImage();
	private Thread thread;
	private int cloudx = 100;

	public TestSWING() {
		setBounds(100,100,frameWidth,frameHeight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		thread = new Thread(this);
		thread.start();
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, frameWidth, frameHeight);
		g.setColor(Color.white);
		g.fillRect(30, 40, 100, 50);
		g.drawImage(cloud, cloudx, 150, null);
	}
	@Override
	public void run() {
		while(true){
			cloudx++;
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

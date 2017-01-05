package show;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
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
	private ImageIcon img1;
	private JLabel imgLabel1;
	Thread animator;

	private int shnappiX = 100;

	private Thread thread;

	public MainActivity() {
		// javax.swing.SwingUtilities.invokeLater(new Runnable() {
		// public void run() {
		// createAndShowGUI();
		// }
		// });
		createAndShowGUI();
		thread = new Thread(this);
		thread.start();
	}

	/**
	 * 创建并显示GUI。出于线程安全的考虑， 这个方法在事件调用线程中调用。
	 */
	private void createAndShowGUI() {
		setBounds(100, 100, frameWidth, frameHeight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 确保一个漂亮的外观风格
		JFrame.setDefaultLookAndFeelDecorated(true);

		// 创建及设置窗口
		frame = new JFrame("shnappi");
		// frame.setLayout(new FlowLayout());

		initView();

		// 显示窗口
		frame.pack();
		frame.setVisible(true);
		frame.setSize(frameWidth, frameHeight);
	}

	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.GREEN);
		g.fillRect(10, 60, frameWidth, frameHeight);
		g.drawImage(s1, shnappiX, 250, this);
	}



	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, frameWidth, frameHeight);
		g.drawImage(s1, shnappiX, 150, this);
	}

	// @Override
	// public void paint(Graphics g) {
	// super.paint(g);
	// g.setColor(Color.GREEN);
	// g.fillRect(0, 0, frameWidth, frameHeight);
	// g.drawImage(s1, shnappiX, 150, null);
	// }

	private void initView() {
//		startPauseButton = new Button("start");
//		startPauseButton.setSize(50, 50);
//		startPauseButton.setLocation(200, 200);
		try {

			img1 = new ImageIcon(
					"/Users/Blair/Documents/workspace/demo/images/s1.png");
			s1 = img1.getImage();
		} catch (Exception e) {
			e.printStackTrace();
		}

		imgLabel1 = new JLabel(img1);
		imgLabel1.setLocation(shnappiX, 0);
		imgLabel1.setVisible(true);
//		frame.add(startPauseButton);
		frame.add(imgLabel1);
	}

	public static void main(String[] args) {
		// 显示应用 GUI
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// createAndShowGUI();
				new MainActivity();
			}
		});
		// new MainActivity();
	}

	@Override
	public void run() {

		while (true) {

			shnappiX++;
			repaint();

			try {
				Thread.sleep(1000); // we pause the movement for every 2 mill
			} catch (Exception e) {
			}
			// Shnappi shnappi = new Shnappi();
			// shnappi.goLeft();
			// imgLabel1.setLocation(0, 500);
		}

	}

}

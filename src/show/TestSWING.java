package show;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;

import references.JavaGraphics;

public class TestSWING extends JApplet implements Runnable {
	private JFrame frame;
	private Button startPauseButton;
	private BufferedImage s1;

//	public TestSWING() {
//		createAndShowGUI();
//	}

	@Override
	public void start() {
		super.start();
		//createAndShowGUI();
	}

	/**
	 * 创建并显示GUI。出于线程安全的考虑， 这个方法在事件调用线程中调用。
	 */
	private void createAndShowGUI() {
		// 确保一个漂亮的外观风格
		JFrame.setDefaultLookAndFeelDecorated(true);

		// 创建及设置窗口
		frame = new JFrame("shnappi");

		frame.setLayout(new FlowLayout());
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 添加 "Hello World" 标签
		// JLabel label = new JLabel("Hello World");
		// frame.getContentPane().add(label);

		// 显示窗口
		frame.pack();
		frame.setVisible(true);
		frame.setSize(1000, 600);
		initView();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(s1, 0, 0, this);
	}

	private void initView() {
		startPauseButton = new Button("start");
		frame.add(startPauseButton);
		try {

			BufferedImage s1 = ImageIO.read(new File(
					"/Users/Blair/Documents/workspace/demo/images/s1.png"));
			s1.getHeight();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		// 显示应用 GUI
		// javax.swing.SwingUtilities.invokeLater(new Runnable() {
		// public void run() {
		// createAndShowGUI();
		// }
		// });
		JFrame f = new JFrame("shnappi");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JApplet applet = new TestSWING();
		f.getContentPane().add(applet);
		applet.init();
		f.pack();
		f.setSize(new Dimension(800, 600));
		f.setVisible(true);
		applet.start();
	}

	
}

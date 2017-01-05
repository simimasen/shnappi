package show;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainActivity extends JApplet implements Runnable {
	private JFrame frame;
	private Button startPauseButton;
	private BufferedImage s1;
	private ImageIcon img1;
	Thread animator;
	public MainActivity() {
		createAndShowGUI();
	}

	@Override
	public void start() {
		super.start();
		animator = new Thread(this);
		animator.start();
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
		initView();

		// 显示窗口
		frame.pack();
		frame.setVisible(true);
		frame.setSize(1000, 600);
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

			 s1 = ImageIO.read(new File(
					"/Users/Blair/Documents/workspace/demo/images/s1.png"));
			img1 = new ImageIcon("/Users/Blair/Documents/workspace/demo/images/s1.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
		JLabel imgLabel1 = new JLabel(img1);
		imgLabel1.setVisible(true);
		frame.add(imgLabel1);
	}

	public static void main(String[] args) {
		// 显示应用 GUI
		// javax.swing.SwingUtilities.invokeLater(new Runnable() {
		// public void run() {
		// createAndShowGUI();
		// }
		// });
		new MainActivity();
	}

	@Override
	public void run() {
		while(Thread.currentThread() == animator){
			
		}
	}
	@Override
	public void stop() {
		super.stop();
		animator = null;
	}
}

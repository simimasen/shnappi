//package show;
//
//import java.awt.BorderLayout;
//import java.awt.Container;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.SwingConstants;
//
//public class TestSWING {
//	public TestSWING(){  
//        super("An Application using Swing");  
//  
//        Container contentPane=getContentPane();  
//  
//        Icon icon=new ImageIcon("swing.gif","An advanced GIF of Duke on a swing");  
//  
//        JLabel label=new JLabel("Swing!",icon,SwingConstants.CENTER);  
//  
//        contentPane.add(label,BorderLayout.CENTER);  
//    }  
//  
//    public static void main(String args[]){  
//        final JFrame f=new TestSWING();  
//  
//        f.setBounds(100,100,300,250);  
//        f.setVisible(true);  
//        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
//  
//        f.addWindowListener(new WindowAdapter(){  
//            public void windowClosed(WindowEvent e){  
//                System.exit(0);  
//            }  
//        }  
//        );  
//    }  
//}

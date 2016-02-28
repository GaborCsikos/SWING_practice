/**
 * 
 */
package com.weebly.gaborcsikos.java.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.WindowConstants;

/**
 * @author Gabor Csikos
 * 
 */
public class LayoutExamples extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LayoutExamples() {
		super("Layouts");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JDesktopPane desktop = new JDesktopPane();
		getContentPane().add(desktop);

		flowLayout(desktop);
		borderlayout(desktop);
		gridlayout(desktop);
		boxlayoutX(desktop);
		boxlayoutY(desktop);
	}

	private void flowLayout(JDesktopPane desktop) {
		JInternalFrame frame = new JInternalFrame("flowlayout");
		frame.setBounds(10, 10, 150, 150);

		Container c = frame.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));

		desktop.add(frame);
		frame.setResizable(true);
		frame.show();

	}

	private void borderlayout(JDesktopPane desktop) {
		JInternalFrame frame = new JInternalFrame("borderlayout");
		frame.setBounds(170, 10, 150, 150);

		Container c = frame.getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new JButton("1"), BorderLayout.NORTH);
		c.add(new JButton("2"), BorderLayout.WEST);
		c.add(new JButton("3"), BorderLayout.CENTER);
		c.add(new JButton("4"), BorderLayout.EAST);
		c.add(new JButton("5"), BorderLayout.SOUTH);

		desktop.add(frame);
		frame.setResizable(true);
		frame.show();
	}

	private void gridlayout(JDesktopPane desktop) {
		JInternalFrame frame = new JInternalFrame("gridlayout");
		frame.setBounds(10, 360, 250, 170);

		Container c = frame.getContentPane();
		c.setLayout(new GridLayout(3, 2));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));

		desktop.add(frame);
		frame.setResizable(true);
		frame.show();

	}

	private void boxlayoutX(JDesktopPane desktop) {
		JInternalFrame frame = new JInternalFrame("boxlayout x axis");
		frame.setBounds(330, 10, 220, 150);

		Container c = frame.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));

		desktop.add(frame);
		frame.setResizable(true);
		frame.show();

	}

	private void boxlayoutY(JDesktopPane desktop) {
		JInternalFrame frame = new JInternalFrame("boxlayout y axis");
		frame.setBounds(10, 170, 250, 200);

		Container c = frame.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));

		desktop.add(frame);
		frame.setResizable(true);
		frame.show();

	}

	public void showWindow() {
		this.setVisible(true);
	}
}

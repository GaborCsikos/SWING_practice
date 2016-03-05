/**
 * 
 */
package com.weebly.gaborcsikos.java.swing.about;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

/**
 * @author Gabor Csikos
 * 
 */
public class AboutDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AboutDialog(JFrame frame) {
		super(frame, "About", true);
		this.setSize(400, 200);
		// JLabel lbl = new JLabel(new ImageIcon("icon.gif"));
		JPanel p = new JPanel();
		// Border b1 = new BevelBorder(BevelBorder.LOWERED);
		// Border b2 = new EmptyBorder(5, 5, 5, 5);
		// lbl.setBorder(new CompoundBorder(b1, b2));
		// p.add(lbl);
		getContentPane().add(p, BorderLayout.WEST);
		String message = "Tutorial for Swing\n" + "Created by Gabor Csikos";
		JTextArea txt = new JTextArea(message);
		txt.setBorder(new EmptyBorder(5, 10, 5, 10));
		txt.setFont(new Font("Helvetica", Font.BOLD, 12)); // Some fonts
		txt.setEditable(false);
		txt.setBackground(getBackground());
		p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.add(txt);
		message = "JVM version " + System.getProperty("java.version") + "\n"
				+ " by " + System.getProperty("java.vendor");
		txt = new JTextArea(message);
		txt.setBorder(new EmptyBorder(5, 10, 5, 10));
		txt.setFont(new Font("Arial", Font.PLAIN, 12));
		txt.setEditable(false);
		txt.setLineWrap(true);
		txt.setWrapStyleWord(true);
		txt.setBackground(getBackground());
		p.add(txt);
		getContentPane().add(p, BorderLayout.CENTER);
		final JButton btOK = new JButton("OK");
		ActionListener lst = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		};
		btOK.addActionListener(lst);
		p = new JPanel();
		p.add(btOK);
		getRootPane().setDefaultButton(btOK);
		getRootPane().registerKeyboardAction(lst,
				KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);
		getContentPane().add(p, BorderLayout.SOUTH);
		WindowListener wl = new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				btOK.requestFocus();
			}
		};
		addWindowListener(wl);
		pack();
		setResizable(false);
		setLocationRelativeTo(frame);
	}

	public void showDialog() {
		setVisible(true);

	}
}

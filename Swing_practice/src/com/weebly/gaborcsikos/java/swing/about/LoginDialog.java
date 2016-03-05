/**
 * 
 */
package com.weebly.gaborcsikos.java.swing.about;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

/**
 * @author Gabor Csikos
 * 
 */
public class LoginDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JTextField login;
	private final JPasswordField password;

	public LoginDialog(JFrame frame) {
		super(frame, "Login screen");
		setSize(400, 200);
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(
				new EtchedBorder(EtchedBorder.RAISED), new EmptyBorder(5, 5, 5,
						5)));
		panel.add(new JLabel("User name:"));
		login = new JTextField(16);
		panel.add(login);
		panel.add(new JLabel("Password:"));
		password = new JPasswordField(16);
		panel.add(password);
		JPanel p = new JPanel();
		p.setBorder(new EmptyBorder(10, 10, 10, 10));
		p.add(panel);
		ActionListener lst = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				// LOGIN SHOULD BE PERFORMED HERE
				dispose();
			}
		};
		JButton saveButton = new JButton("Login");
		saveButton.addActionListener(lst);
		getRootPane().setDefaultButton(saveButton);
		getRootPane().registerKeyboardAction(lst,
				KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);
		p.add(saveButton);
		JButton cancelButton = new JButton("Cancel");
		lst = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		};
		cancelButton.addActionListener(lst);
		getRootPane().registerKeyboardAction(lst,
				KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);
		p.add(cancelButton);
		getContentPane().add(p, BorderLayout.CENTER);
		pack();
		setResizable(false);
		setLocationRelativeTo(frame);
	}

	public void showDialog() {
		this.setVisible(true);

	}
}

package com.weebly.gaborcsikos.java.swing.mainform;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final JLabel usernameLabel;
	private final JLabel passwordLabel;
	private final JTextField usernameField;
	private final JPasswordField passwordField;
	private final JButton loginButton;

	public FormPanel() {
		usernameLabel = new JLabel("login:");
		passwordLabel = new JLabel("password:");
		usernameField = new JTextField(10);
		passwordField = new JPasswordField(10);
		loginButton = new JButton("Login");

		Border insideBorder = BorderFactory.createTitledBorder("login here");
		Border outsideBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outsideBorder,
				insideBorder));

		setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();
		addUserNameLabel(gc);
		addUserNameField(gc);
		addPasswordLabel(gc);
		addPasswordField(gc);
		addOkButton(gc);

		setVisible(true);
	}

	private void addUserNameLabel(GridBagConstraints gc) {
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		add(usernameLabel, gc);
	}

	private void addUserNameField(GridBagConstraints gc) {
		gc.gridx = 1;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_START;
		add(usernameField, gc);
	}

	private void addPasswordLabel(GridBagConstraints gc) {
		gc.gridx = 0;
		gc.gridy = 1;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		add(passwordLabel, gc);
	}

	private void addPasswordField(GridBagConstraints gc) {
		gc.gridx = 1;
		gc.gridy = 1;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_START;
		add(passwordField, gc);
	}

	private void addOkButton(GridBagConstraints gc) {
		gc.gridx = 1;
		gc.gridy = 2;
		// button row takes all the space
		gc.weightx = 50;
		gc.weighty = 50;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(loginButton, gc);

	}

}

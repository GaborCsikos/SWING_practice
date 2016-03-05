/**
 * 
 */
package com.weebly.gaborcsikos.java.swing.mainform;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

import com.weebly.gaborcsikos.java.swing.LayoutExamples;
import com.weebly.gaborcsikos.java.swing.about.AboutDialog;
import com.weebly.gaborcsikos.java.swing.about.LoginDialog;
import com.weebly.gaborcsikos.java.swing.tabbed.TabbedPaneExample;

/**
 * @author Gabor Csikos
 * 
 */
public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea textArea;

	public void init() {
		// JFame settings
		this.setSize(800, 600);
		this.setTitle("Example");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// Add menu
		addMenu();

		// addFormPanel
		JPanel formPanel = new FormPanel();
		this.add(formPanel, BorderLayout.WEST);

		// add textArea
		textArea = new JTextArea();
		this.add(textArea, BorderLayout.CENTER);
		((FormPanel) formPanel).setTextArea(textArea);

		this.setVisible(true);
	}

	private void addMenu() {
		// MenuBar has Menus, each Menu has a MenuItem
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu aboutMenu = new JMenu("About");
		JMenuItem exit = new JMenuItem("Exit");
		JMenuItem about = new JMenuItem("About");
		JMenuItem login = new JMenuItem("One line login screen");
		// Examples
		JMenuItem showLayouts = new JMenuItem("Layout examples");
		JMenuItem tabbedPane = new JMenuItem("tabbed pane examples");

		tabbedPane.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TabbedPaneExample pane = new TabbedPaneExample(getFrame());
				pane.showDialog();
			}
		});
		showLayouts.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				LayoutExamples examples = new LayoutExamples();
				examples.showWindow();
			}
		});

		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showExitDialog();
			}

		});
		about.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				showAboutDialog();
			}
		});
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				showLoginDialog();
			}
		});
		fileMenu.add(showLayouts);
		fileMenu.add(tabbedPane);
		fileMenu.add(exit);
		aboutMenu.add(about);
		aboutMenu.add(login);
		menuBar.add(fileMenu);
		menuBar.add(aboutMenu);
		this.setJMenuBar(menuBar);
	}

	protected void showLoginDialog() {
		LoginDialog dialog = new LoginDialog(this);
		dialog.showDialog();

	}

	protected void showAboutDialog() {
		AboutDialog dialog = new AboutDialog(this);
		dialog.showDialog();

	}

	protected JFrame getFrame() {
		return this;
	}

	void showExitDialog() {
		int result = JOptionPane.showOptionDialog(this, "Really exit?", "Exit",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				null, null);
		if (result == 0) {
			System.exit(0);
		}

	}
}

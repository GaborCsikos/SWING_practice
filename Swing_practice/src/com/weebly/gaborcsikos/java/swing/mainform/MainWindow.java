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
import javax.swing.WindowConstants;

import com.weebly.gaborcsikos.java.swing.LayoutExamples;

/**
 * @author Gabor Csikos
 * 
 */
public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		JPanel textPanel = new TextAreaPanel();
		this.add(textPanel, BorderLayout.CENTER);

		this.setVisible(true);
	}

	private void addMenu() {
		// MenuBar has Menus, each Menu has a MenuItem
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem exit = new JMenuItem("Exit");
		// Examples
		JMenuItem showLayouts = new JMenuItem("Layout examples");
		showLayouts.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				LayoutExamples examples = new LayoutExamples();
				examples.showWindow();
			}
		});

		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showExitDialog();
			}

		});
		fileMenu.add(showLayouts);
		fileMenu.add(exit);
		menuBar.add(fileMenu);
		this.setJMenuBar(menuBar);
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

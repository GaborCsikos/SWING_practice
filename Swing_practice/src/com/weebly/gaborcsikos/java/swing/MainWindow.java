/**
 * 
 */
package com.weebly.gaborcsikos.java.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 * @author Gabor Csikos
 *
 */
public class MainWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
		//JFame settings
		this.setSize(800, 600);
		this.setTitle("Example");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//Add menu
		addMenu();
		
		this.setVisible(true);
	}

	private void addMenu() {
	//MenuBar has Menus, each Menu has a MenuItem
		JMenuBar menuBar= new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem exit= new JMenuItem("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showExitDialog();
			}
			
		});
		
		fileMenu.add(exit);
		menuBar.add(fileMenu);
		this.setJMenuBar(menuBar);
	}
	 void showExitDialog() {
		int result = JOptionPane.showOptionDialog(this, "Really exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		if(result == 0){
			System.exit(0);
		}
		
	}
}

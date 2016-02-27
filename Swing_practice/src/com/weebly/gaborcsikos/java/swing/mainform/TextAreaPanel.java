/**
 * 
 */
package com.weebly.gaborcsikos.java.swing.mainform;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author Gabor Csikos
 * 
 */
public class TextAreaPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextArea textArea;

	public TextAreaPanel() {
		setTextArea(new JTextArea());
		setVisible(true);
	}

	public void appendText(String text) {
		textArea.append(text);
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}
}

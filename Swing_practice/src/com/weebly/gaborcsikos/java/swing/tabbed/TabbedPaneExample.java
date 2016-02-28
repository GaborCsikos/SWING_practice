package com.weebly.gaborcsikos.java.swing.tabbed;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedPaneExample extends JDialog {

	/**
	 * 
	 */
	public static final int LIST_TAB = 0;
	public static final int DATA_TAB = 1;
	private static final long serialVersionUID = 1L;

	private final JTextField firstNameText;
	private final JTextField lastNameText;
	private final JTextField phoneText;
	private final JTabbedPane tab;

	private final JList<Person> personList = new JList<Person>(
			TabPaneMockedDataHelper.getPersonList());

	public TabbedPaneExample(JFrame frame) {
		super(frame);
		this.setTitle("Tabbed pane");
		JPanel p1 = new JPanel(new BorderLayout());
		personList.setVisibleRowCount(4);
		JScrollPane sp = new JScrollPane(personList);
		p1.add(sp, BorderLayout.CENTER);
		MouseListener mlst = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				if (evt.getClickCount() == 2)
					tab.setSelectedIndex(DATA_TAB);
			}
		};
		personList.addMouseListener(mlst);
		JPanel p2 = new JPanel(new GridBagLayout());
		p2.setBorder(new EmptyBorder(10, 10, 10, 10));
		p2.add(new JLabel("First name:"));
		firstNameText = new JTextField(20);
		p2.add(firstNameText);
		p2.add(new JLabel("Last name:"));
		lastNameText = new JTextField(20);
		p2.add(lastNameText);
		p2.add(new JLabel("Contact phone:"));
		phoneText = new JTextField(20);
		p2.add(phoneText);
		tab = new JTabbedPane();
		tab.addTab("Employees", p1);
		tab.addTab("Personal Data", p2);
		tab.addChangeListener(new TabChangeListener());
		JPanel p = new JPanel();
		p.add(tab);
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(p);
		pack();
	}

	public Person getSelectedPerson() {
		return personList.getSelectedValue();
	}

	class TabChangeListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			Person person = getSelectedPerson();
			switch (tab.getSelectedIndex()) {
			case DATA_TAB:
				if (person == null) {
					tab.setSelectedIndex(LIST_TAB);
					return;
				}
				firstNameText.setText(person.getFirstName());
				lastNameText.setText(person.getLastName());
				phoneText.setText(person.getContact());
				break;
			case LIST_TAB:
				if (person != null) {
					person.setFirstName(firstNameText.getText());
					person.setLastName(lastNameText.getText());
					person.setContact(phoneText.getText());
					personList.repaint();
				}
				break;
			}
		}
	}

	public void showDialog() {
		this.setVisible(true);
	}
}

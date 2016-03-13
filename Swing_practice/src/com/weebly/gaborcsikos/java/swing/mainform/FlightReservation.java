/**
 * 
 */
package com.weebly.gaborcsikos.java.swing.mainform;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.ListModel;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 * @author Gabor Csikos
 * 
 */
public class FlightReservation extends JDialog {

	private final JComboBox<String> fromCb;
	private final JComboBox<String> toCb;

	private final JRadioButton firstClass;
	private final JRadioButton business;
	private final JRadioButton tourist;

	private final JButton searchButton;
	private final JButton purchaseButton;
	private final JButton exitButton;

	private final JSpinner date;
	private final JList<String> table;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FlightReservation() {
		this.setModal(true);
		this.setTitle("Flight reservation");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
		JPanel flightPanel = new JPanel();
		flightPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		flightPanel.setLayout(new GridLayout(3, 2, 5, 5));
		SpinnerModel dateModel = new SpinnerDateModel(FlightFactory.createDate(
				11, 30),
		// initial value
				FlightFactory.createDate(11, 30),
				// Minimum value - not set
				null,
				// Maximum value - not set
				Calendar.MINUTE
		// Step
		);
		date = new JSpinner(dateModel);
		flightPanel.add(new JLabel("Date:"));
		flightPanel.add(date);
		flightPanel.add(new JLabel("From:"));

		fromCb = new JComboBox<String>();

		addAllOptions(fromCb);
		flightPanel.add(fromCb);
		flightPanel.add(new JLabel("To:"));
		toCb = new JComboBox<String>();
		addAllOptions(toCb);
		flightPanel.add(toCb);
		mainPanel.add(flightPanel);
		JPanel optionPanel = new JPanel();
		optionPanel.setLayout(new BoxLayout(optionPanel, BoxLayout.Y_AXIS));
		optionPanel.setBorder(new TitledBorder(new EtchedBorder(), "Options"));
		ButtonGroup group = new ButtonGroup();
		firstClass = new JRadioButton("First class");
		group.add(firstClass);
		optionPanel.add(firstClass);
		business = new JRadioButton("Business");
		group.add(business);
		optionPanel.add(business);
		optionPanel.add(firstClass);
		tourist = new JRadioButton("Tourist");
		group.add(tourist);
		optionPanel.add(tourist);
		tourist.setSelected(true);
		mainPanel.add(optionPanel);
		getContentPane().add(mainPanel, BorderLayout.NORTH);
		JPanel infoPanel = new JPanel(new BorderLayout());
		infoPanel.setBorder(new TitledBorder(new EtchedBorder(),
				"Available Flights"));
		table = new JList<String>();
		ListModel<String> model = new FlightModel();
		table.setModel(model);
		JScrollPane ps = new JScrollPane(table);
		infoPanel.add(ps, BorderLayout.CENTER);
		getContentPane().add(infoPanel, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1, 3, 5, 5));
		searchButton = new JButton("Search");
		buttonPanel.add(searchButton);
		purchaseButton = new JButton("Purchase");
		buttonPanel.add(purchaseButton);
		exitButton = new JButton("Exit");
		buttonPanel.add(exitButton);
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);

		addActionListeners();

	}

	private void addActionListeners() {
		exitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		searchButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (((String) toCb.getSelectedItem()).equals(fromCb
						.getSelectedItem())) {
					showInformation("From and to flights are the same");
				} else {
					showInformation("Not implemented, this tutorial is about Swing");
				}
			}
		});
		purchaseButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				purchase();

			}
		});
	}

	protected void purchase() {
		if (table.getSelectedValue() != null) {
			JOptionPane.showMessageDialog(this, table.getSelectedValue()
					.toString() + " purchased");
		}

	}

	protected void showInformation(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}

	private void addAllOptions(JComboBox<String> cb) {
		for (String flight : FlightFactory.FLIGHTS) {
			cb.addItem(flight);
		}

	}

	public void showFlightReservation() {
		this.setVisible(true);
	}

}

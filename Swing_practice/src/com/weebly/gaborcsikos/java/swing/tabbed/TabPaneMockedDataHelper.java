/**
 * 
 */
package com.weebly.gaborcsikos.java.swing.tabbed;

/**
 * @author Gabor Csikos
 * 
 */
public final class TabPaneMockedDataHelper {

	public static Person[] getPersonList() {
		Person[] employee = { new Person("John", "Smith", "111-1111"),
				new Person("Silvia", "Glenn", "222-2222"),
				new Person("Captain", "Kirk", "333-3333"),
				new Person("Duke", "Nukem", "444-4444"),
				new Person("James", "Bond", "000-7777") };
		return employee;
	}
}

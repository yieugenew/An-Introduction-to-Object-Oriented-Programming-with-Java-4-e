//Eugene Yi
import javax.swing.*;


class Fifth {

	public static void main( String[] args ) {

		int year;

		String yearStr;

		yearStr = JOptionPane.showInputDialog(null, "Enter year:");

		year    = Integer.parseInt(yearStr);

		if (year % 4 == 0 && year % 100 != 0) {

			JOptionPane.showMessageDialog(null, "Leap Year");

		} else if (year % 400 == 0) {

			JOptionPane.showMessageDialog(null, "Leap Year");

		} else {

			JOptionPane.showMessageDialog(null, "Not a Leap Year");

		}
	}
}

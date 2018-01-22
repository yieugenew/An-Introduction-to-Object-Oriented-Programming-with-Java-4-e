//Eugene Yi
import javax.swing.*;

class Third {

	public static void main( String[] args ) {

		double yearA, popyearA, yearB, popyearB, yearC, yearsafter, constant, yearCpop;

		String yearAStr, popyearAStr, yearBStr, popyearBStr, yearCStr;

		yearAStr    = JOptionPane.showInputDialog(null, "Input year A:");

		yearA       = Double.parseDouble(yearAStr);

		popyearAStr = JOptionPane.showInputDialog(null, "Input year A population:");

		popyearA    = Double.parseDouble(popyearAStr);

		yearBStr    = JOptionPane.showInputDialog(null, "Input year B:");

		yearB       = Double.parseDouble(yearBStr);

		popyearBStr = JOptionPane.showInputDialog(null, "Input year B population:");

		popyearB    = Double.parseDouble(popyearBStr);

		yearCStr    = JOptionPane.showInputDialog(null, "Input year C");

		yearC       = Double.parseDouble(yearCStr);

        yearsafter  = (yearB - yearA);

		constant    = Math.pow(yearsafter, -1) * Math.log(popyearB / popyearA);

		yearCpop    = popyearA * Math.exp(constant * (yearC - yearA));

		JOptionPane.showMessageDialog(null, (int)yearA + "'s population: " + popyearA +
						                      "\n" + (int)yearB + "'s population: " + popyearB +
							                    "\n" + "Prediction of population for " + (int)yearC + ": " + yearCpop);

	}
}

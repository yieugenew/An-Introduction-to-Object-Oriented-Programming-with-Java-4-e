//Eugene Yi
import javax.swing.*;

class Sixth {

	public static void main( String[] args ) {

	int bag, largeboxes, mediumboxes;

	double costofbags, smallboxes, largeboxescost, mediumboxescost, smallboxescost, totalcost;

	String bagStr;

	bagStr = JOptionPane.showInputDialog(null, "How many 2-lb bags of Irian Jaya coffee beans would you like to buy?");

	bag    = Integer.parseInt(bagStr);

	costofbags  = (double) bag * 5.5;

	largeboxes  = bag / 20;

	mediumboxes = (bag - largeboxes * 20) / 10;

	smallboxes  = (bag - (largeboxes * 20) - (mediumboxes * 10) + 4.9) / 5;

	largeboxescost  = largeboxes * 1.8;

	mediumboxescost = mediumboxes * 1;

	smallboxescost  = Math.floor(smallboxes) * .6;

	totalcost       = costofbags + largeboxescost + mediumboxescost + smallboxescost;

	System.out.print("Number of Bags Ordered: " + bag + " - $ " + costofbags +
												"\n\n" + "Boxes Used:" +
												 "\n" + "\t\t\t" + largeboxes + " Large - $" + largeboxescost +
												  "\n" + "\t\t\t" + mediumboxes + " Medium - $" + mediumboxescost +
												   "\n"	+ "\t\t\t" + (int)smallboxes + " Small - $" + smallboxescost);
   System.out.print("\n\n" + "Your total cost is: $ " + totalcost);
	}
}



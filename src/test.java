//Eugene Yi
import javax.swing.*;
import java.util.*;

class Person {

	public String name;

	public char letter;

	public int age, idNumber, firstSpace, lastSpace;

	public Person(String name, int age, int idNumber) {

	this.name = name;

	this.age = age;

	this.idNumber = idNumber;

	}

	public String getName() {

		return this.name;

	}

	public String getLastName() {

		firstSpace = name.indexOf(" ");

        lastSpace = name.lastIndexOf(" ");

        String lastName = name.substring(firstSpace,lastSpace);

        return lastName;

	}

	public int getAge() {

		return this.age;

	}

	public int getIdNumber() {

		return this.idNumber;
	}

	public String toString() {

		return "Person[Name=" + this.name + ", Age=" + this.age +

				", ID#=" + this.idNumber + "]";

	}

}

class Sort {

	private String itemNumberStr, name, ageStr, idNumberStr, choiceStr;

	private int itemNumber, age, idNumber, choice;

	boolean end;

	ArrayList<Person> personList = new ArrayList<Person>();

	public Sort() {

	itemNumberStr  = JOptionPane.showInputDialog(null, "Enter number of person objects you would like to store. (May add on more later on)");

	itemNumber = Integer.parseInt(itemNumberStr);

	}

	private void storePeople() {

		for (int i = 1; i <= itemNumber; i++) {

			name  = JOptionPane.showInputDialog(null, "Enter full name: (First Name, Last Name)") + " ";

			ageStr  = JOptionPane.showInputDialog(null, "Enter age:");

			age = Integer.parseInt(ageStr);

			idNumberStr  = JOptionPane.showInputDialog(null, "Enter ID:");

			idNumber = Integer.parseInt(idNumberStr);

			personList.add(new Person(name, age, idNumber));

		}

	}

	private void sortById() {

		for (int pass = 1; pass <= itemNumber; pass++) {

			for (int current = 0; current < itemNumber - pass; current++) {

			Person personCurrent = personList.get(current);

			Person personNext = personList.get(current + 1);

				if (personCurrent.getIdNumber() > personNext.getIdNumber()) {

					Person temp = personList.get(current);

   					personList.set(current, personList.get(current + 1));

    				personList.set(current + 1, temp);

				}

			}

		}

		for(Person e:personList) {

			System.out.println(e);

		}
		
		System.out.println("---");

	}

	private void sortByName() {

		for (int pass = 1; pass <= itemNumber; pass++) {

			for (int current = 0; current < itemNumber - pass; current++) {

			Person personCurrent = personList.get(current);

			Person personNext = personList.get(current + 1);

				if (personCurrent.getLastName().compareTo(personNext.getLastName()) > 0) {

					Person temp = personList.get(current);

   					personList.set(current, personList.get(current + 1));

    				personList.set(current + 1, temp);

				} 

			}

		}

		for(Person e:personList) {

			System.out.println(e);

		}
		
		System.out.println("---");

	}

	private void searchAge(int choice) {

		for (int pass = 1; pass <= itemNumber; pass++) {

			for (int current = 0; current < itemNumber - pass; current++) {

			Person personCurrent = personList.get(current);

			Person personNext = personList.get(current + 1);

				if (Integer.compare(personCurrent.getAge(), personNext.getAge()) > 0) {

					Person temp = personList.get(current);

   					personList.set(current, personList.get(current + 1));

    				personList.set(current + 1, temp);

				}

			}

		}

		for(Person e:personList) {
			
			if (choice == 4) {
				
				String searchStr = JOptionPane.showInputDialog(null, "Search for all people over what age?");

				int search = Integer.parseInt(searchStr);
				
				if (e.getAge() > search) {
			
					System.out.println(e);
				
				}
				
			} else {
				
				System.out.println(e);
				
			}
			
		}
		
		System.out.println("---");

	}


	public void doProgram() {

		storePeople();

		do {

			choiceStr  = JOptionPane.showInputDialog(null, "1. Sort by Id" + "\n" + "2. Sort by Last Name" + "\n" + "3. Sort by Age" + "\n" + "4. Search by Age" + "\n" + "5. Finish");

			choice = Integer.parseInt(choiceStr);

			switch (choice) {

            	case 1:  sortById();

                	     break;

            	case 2:  sortByName();

                	     break;
                	     
            	case 3:  searchAge(choice);
            	
            			 break;
                	     
            	case 4:  searchAge(choice);
            	
            	         break;

                case 5:  break;

			}

		} while (choice != 5);

	}

}

class SortAndSearch {

public static void main(String [] args) {

	Sort development = new Sort();

	development.doProgram();

	}

}


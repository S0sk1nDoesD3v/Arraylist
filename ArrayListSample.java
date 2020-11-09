import java.util.ArrayList;
public class ArrayListSample {

        public static void main(String[] args){


            ArrayList<String> stringList = new ArrayList<String>(20);// instantiates the ArrayList class

            // The add class will add employees to the Arraylist.
            stringList.add(0,"Lord Vader");
            stringList.add(1,"Hans Solo");
            stringList.add(2,"Obi One Kenobi");
            stringList.add(3,"C-3PO");
            stringList.add(4,"Luke Skywlaker");
            stringList.add(5,"The Mandolorian");
            stringList.add(6,"Yoda");
            stringList.add(7,"Greddo");
            stringList.add(8,"R2-D2");
            stringList.add(9,"Darth Maul");

            // Display the employees with an enhanced for loop.
            for (String s : args) System.out.printf(" %s", s + ",");
            System.out.println("\n");

            // Add more items to further replace items in the index.
            stringList.add("Boba Fett");
            stringList.add("Greef Karga");
            System.out.printf(" %s","New Employee List: "+ stringList);
            System.out.println("\n");

            // Remove Employee from Arraylist.
            stringList.remove(7);
            stringList.remove(2);
            System.out.printf(" %s","After Removing two employees: " + stringList);
            System.out.println("\n");

            // Search for employee using boolean method
            boolean DoesHave = stringList.contains("Master Windu");
            if(!DoesHave) {
                System.out.println("Employee does not exist in list." + "\n");
            }
            else{
                System.out.println("The Employee Exists");
            }

            //Search the position of the Array list.
            System.out.println("The employee is in position: "+ stringList.indexOf("Lord Vader")+ "\n");


            // Display if the list is empty
            System.out.println("Is the list empty :" + stringList.isEmpty()+ "\n");

            // Display the size of the Array list
            System.out.println("The size of the list is :" + stringList.size());

            // Clear the Arraylist

        }
    }
    

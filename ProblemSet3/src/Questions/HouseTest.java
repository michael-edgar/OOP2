package Questions;

import javax.swing.JOptionPane;

public class HouseTest {
    public static void main(String[] args) {
        String address, type, name, phoneNumber, priceString, ageAsString;
        double price;
        int age;

        House h = new House();

        JOptionPane.showMessageDialog(null, h);

        House h1 = new House();

        h1.setAddress(JOptionPane.showInputDialog("Please enter the address of house 1"));
        h1.setType(JOptionPane.showInputDialog("Please enter the type of house for house 1"));
        h1.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of house 1")));
        h1.setOwner(JOptionPane.showInputDialog("Please enter the name of the owner"),
                Integer.parseInt(JOptionPane.showInputDialog("Please enter the age of the owner")),
                JOptionPane.showInputDialog("Please enter the phone number of the owner"));

        JOptionPane.showMessageDialog(null, h1);

        address = JOptionPane.showInputDialog("Please enter the address of house 2");
        type = JOptionPane.showInputDialog("Please enter the type of house for house 2");
        priceString = JOptionPane.showInputDialog("Please enter the price of house 2");
        price = House.validPrice(priceString);
        name = JOptionPane.showInputDialog("Please enter the name of the owner");
        ageAsString = JOptionPane.showInputDialog("Please enter the age of the owner");
        age = Person.validAge(ageAsString);
        phoneNumber = JOptionPane.showInputDialog("Please enter the phone number of the owner");
        phoneNumber = Person.validPhoneNo(phoneNumber);

        House h2 = new House(address,type, price, name, age, phoneNumber);

        JOptionPane.showMessageDialog(null, h2);

        System.exit(0);
    }
}//End of HouseTest Class

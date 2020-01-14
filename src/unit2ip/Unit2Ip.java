/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2ip;
import javax.swing.JOptionPane; 
import java.util.Vector;
import java.util.List;
class Order{
    String beverage;
    String bread;
    String type;
    String size;
    int quantity;
    
    //constructor
    public Order(String bev, String bred, String t, String s, Integer q){
        beverage = bev;
        bread = bred;
        type = t;
        size = s;
        
        //wrapper class
        quantity = q;
    }
//Method to retrieve order info
public String getOrderInfo(){
return "" + beverage + "" + bread + "" + type +"" + size;
}
}
class Customer{
    String name;
    Order order;
    //constructor
    public Customer(String nam, Order or){
        name = nam;
        order = or;
    }
    public String getName(){
        
    return name;
}
    public String getOrder(){
        return order.getOrderInfo();
    }
}
/**
 *
 * @author Jumbo Moose
 */
public class Unit2Ip {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  String name; //initialize first name
  
  String beverage = "";
  String bread = "";
  String type = "";
  String size = "";
  String addMore = "";
  String quantity =""; 
  
  Customer customer;
  Order order;
  
  
  
  
    
    
    List<Customer> vectorList = new Vector<Customer>(); //Initialize vector list
do{
    name = JOptionPane.showInputDialog("Enter your name"); //display window and ask for name
    
    
    String message = String.format("Hello " + name + ", thank you for signing up for Fred's Favorite Subs"); //format a message to display in window

         JOptionPane.showMessageDialog(null, message); //display welcome message with name

         String[] choices = {"Meatball Sub ", "Veggie Sub ", "Turkey Sub "}; //initialize sub choices
         String input = (String) JOptionPane.showInputDialog( null, "What would you like?",
         "Please choose a sandwich type", JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]); //Display window with dropdown menu of choices  
         type = choices[1];  
       
         String[] choices2 = {" White ", " Parmesean"};
         String input2 = (String) JOptionPane.showInputDialog( null, "What kind of bread would you like?",
         "What kind of bread?", JOptionPane.QUESTION_MESSAGE, null, choices2, choices2[1]); //Display window with dropdown menu of bread choices
         bread = choices2[1];
         
         String[] choices3 = {" 6 inch", " 12 inch"};
         String input3 = (String) JOptionPane.showInputDialog( null, "What kind of bread would you like?",
         "What size?", JOptionPane.QUESTION_MESSAGE, null, choices3, choices3[1]); //Display window with dropdown menu of bread choices
         String message3 = String.format("You ordered: " + input + " With " + input2 + input3);
         JOptionPane.showMessageDialog(null, message3 );   //display sandwich ordered
         size = choices3[1];
         
         String[] choices4 = {"Soda ", "Water ", "Tea ", "Coffee "}; //initialize drink options
         String input4 = (String) JOptionPane.showInputDialog( null, "What would you like?",
         "Please choose a drink", JOptionPane.QUESTION_MESSAGE, null, choices4, choices4[1]); //Display window with dropdown menu of choices  
         String message4 = String.format("You ordered a " + input + input3 + " on " + input2 + " with a " + input4); //Initialize message to display 
         JOptionPane.showMessageDialog(null, message4 );   //display full order
        beverage = choices4[1]; 
         
    quantity = JOptionPane.showInputDialog("Enter quantity in a number format please");
    
    //type conversion 
    int q = Integer.parseInt(quantity);
    
    addMore = JOptionPane.showInputDialog("Place another order? Yes or no?"); 

    //create order object
    order = new Order(beverage, bread, type, size, q); 
    
//create customer object
    customer = new Customer(name, order);
 
//add customer order to vector
    vectorList.add(customer);

} while (addMore.equalsIgnoreCase("Yes"));
//iterate over orders and display
for(Customer cust : vectorList){
   //display message to user
    String message5 = "Welcome " + cust.getName() + " to Fred's Favorite Subs! " + " You ordered: " + quantity + " " + cust.getOrder() +" Thank you for your patronage!"; 

    JOptionPane.showMessageDialog(null, message5, "Message", JOptionPane.INFORMATION_MESSAGE);
} 
    }
}

 
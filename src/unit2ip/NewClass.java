/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2ip;

/**
 *
 * @author Jumbo Moose
 */
public class NewClass {
    class Order{
    String beverage;
    String bread;
    String type;
    String size;
    int quantity;
    
    public Order(String bev, String bred, String t, String s, Integer q){
        beverage = bev;
        bread = bred;
        type = t;
        size = s;
        quantity = q;
    }

public String getOrderInfo(){
return "" + beverage + "" + bread + "" + type +"" + size;
}
}
class Customer{
    String name;
    Order order;
    
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
}}

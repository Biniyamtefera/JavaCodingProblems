package OOPIQ.FiveConcepts;



/**
 * Inheritance is a relationship ,parent child class and use extends class, we only extend only one class
 * Encapsulation:hiding the data, singleton design pattern example , how? using a private key word
 * Ploymorhsim : example Arrayslist with its super type
 * Abstraction :
 * Interface: has releationship, adding more or feature to the class. (dependency injection ), Allow Add addtional functionality
 */

/**
 * IQ : What is Singlton design
 * Example: Create only one driver//create one instance from that class
 */

/**
 * What is the diffrence between abstraction and Interface
 * We don't want anybody create any instance from abstract class >> only purpose
 * Interface:
 */
public class childOOP extends OOP{



    public static void main(String[] args) {
        //private childOOP obj = new childOOP();

        childOOP obj = new childOOP();
        System.out.println(obj.getStr());
        obj.setStr("Edmonton");
        System.out.println("obj.getStr() = " + obj.getStr());
    }





}

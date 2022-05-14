package OOPIQ.FiveConcepts;

public class Singleton {
    //The purpose is to create one instance from the class
    //how do we achieve that
    //use encapsulation
    // you are using getter but not setter instance

    private final Singleton obj = new Singleton();

    //We don't create private constructor then we are allow to create instance
    private Singleton() {

    }
    public Singleton getInstance(){
        return  obj;
    }
}

package AnimalRescue;

public abstract class Cat extends Animal{

    public void purr(){
        System.out.println("Hrr");
    }

    public abstract void speak ();


    public void sleep (){
        System.out.println("Cats sleep all the time");
    }



}

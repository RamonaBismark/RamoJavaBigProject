package AnimalRescue;

public abstract class Animal {


    private String breed ;
    private int age ;
    private float weight ;
    private int heightInCm ;
    private String name ;
    private String color ;
    private byte healthLevel;
    private byte hungryLevel;
    private byte stateOfMind;
    private String favFood;
    private String favRelaxMode;


    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }


    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public float getWeight(){
        return weight;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }


    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }






    public void eat() {
        System.out.println("Eating...");

    }

    public abstract void sleep ();

    public abstract void bark();

    public abstract void play();

    public abstract void speak ();



















}

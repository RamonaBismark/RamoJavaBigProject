package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.name = "Rex";
        rex.breed = "Labrador";
        rex.age = 1;
        System.out.println(rex.name);
        System.out.println(rex.age);

        rex.name = "Blackie";
        System.out.println(rex.name);

        Dog freddie = new Dog ();
        System.out.println(freddie.name);
        freddie.name = "Freddie";

        Dog max = new Dog ();
        max breed = "Doberman";



        PersonWhoAdopts person = new PersonWhoAdopts();
        person.name = "John";
        person.budget = 500;



        DogFood foooood = new DogFood();
        foooood.name1 = "Purina";
        foooood.price1 = 40;
        foooood.quantity1 = 10000;
        foooood.availability1 = 9000;


        Activities act = new Activities();
        act.name2 = "Sleeeeep";


        Veterinary vet = new Veterinary();
        vet.name3 = "Dr OZ";

    }


    }


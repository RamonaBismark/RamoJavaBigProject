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

        Dog freddie = new Dog();
        freddie.name = "Freddie";
        System.out.println(freddie.name);


        PersonWhoAdopts person = new PersonWhoAdopts();
        person.name = "John";
        person.budget = 500;
        System.out.println(person.name);
        person.name = "Steve";
        System.out.println(person.name);


        DogFood foooood = new DogFood();
        foooood.name1 = "Purina";
        foooood.price1 = 40.5;
        foooood.quantity1 = 10000;
        foooood.availability1 = 9000;
        System.out.println(foooood.price1);
        foooood.price1 = 80;
        System.out.println(foooood.price1);



        Activities act = new Activities();
        act.name2 = "Sleeeeep";
        System.out.println(act.name2);
        act.name2 = "Just smileying";
        System.out.println(act.name2);


        Veterinary vet = new Veterinary();
        vet.name3 = "Dr OZ";
        System.out.println(vet.name3);
        vet.name3 = "Mr Jojo";
        System.out.println(vet.name3);

    }


    }


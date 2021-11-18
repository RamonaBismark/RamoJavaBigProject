package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.setName("Rex");
        rex.setBreed("Labrador");
        rex.setAge (1);
        System.out.println(rex.getName());
        System.out.println(rex.getAge());

        rex.setName ("Blackie");
        System.out.println(rex.getName());

        Dog freddie = new Dog();
        freddie.setName ("Freddie");
        System.out.println(freddie.getName());



        PersonWhoAdopts person = new PersonWhoAdopts();
        person.setName("John");
        person.setBudget (500);
        System.out.println(person.getName());
        person.setName("Steve");
        System.out.println(person.getName());


        DogFood foooood = new DogFood();
        foooood.setName1 ("Purina");
        foooood.setPrice1(40.5);
        foooood.setAvailability1(10000);
        foooood.setQuantity1(9000);
        System.out.println(foooood.getPrice1());
        foooood.setPrice1(80);
        System.out.println(foooood.getPrice1());



        Activities act = new Activities();
        act.setName2("Sleeeeep");
        System.out.println(act.getName2());
        act.setName2 ("Just smileying");
        System.out.println(act.getName2());


        Veterinary vet = new Veterinary();
        vet.setName3 ("Dr OZ");
        System.out.println(vet.getName3());
        vet.setName3 ("Mr Jojo");
        System.out.println(vet.getName3());

    }


    }


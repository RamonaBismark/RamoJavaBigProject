package AnimalRescue;

public class Veterinary {
    private String name3;
    private String specialization;

    public String getName3(){
        return name3;
    }

    public void setName3 (String name3) {
        this.name3 = name3;
    }


    public void help(){
        System.out.println("Vet helps everyone");
    }

    public void cure(){
        System.out.println("Vet cures every animal in need");
    }


}

package AnimalRescue;

public class DogFood {
    private String name1 ;
    private double price1 ;
    private double quantity1 ;
    private double availability1 ;

    public String getName1(){
        return name1;
    }
    public void setName1( String name1){
        this.name1 = name1;
    }

    public double getPrice1 (){
        return price1;
    }
    public void setPrice1 (double price1){
        this.price1 = price1;
    }

    public double getQuantity1(){
        return quantity1;
    }
    public void setQuantity1 (double quantity1){
        this.quantity1 = quantity1;
    }

    public double getAvailability1 (){
        return availability1;
    }
    public void setAvailability1 (double availability1){
        this.availability1 = availability1;
    }




    public void healthy() {
        System.out.println("Amazing for the health");
    }

    public void nourishing() {
        System.out.println("Amazing taste and keeps satiated many hours");
    }
}

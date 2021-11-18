package AnimalRescue;

    public class PersonWhoAdopts extends Humans{

        private int budget;


        public int getBudget (){
            return budget;
        }

        public void setBudget (int budget){
            this.budget = budget;
        }



    public void visit(){
        System.out.println("Visiting dogs shelter on: ");
    }

    public void payment(){
        System.out.println("Paying the monthly ammount...");
    }


}

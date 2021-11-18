package AnimalRescue;

    public class PersonWhoAdopts {
        private String name ;
        private int budget;


        public String getName (){
            return name;
        }

        public void setName (String name){
            this.name = name;
        }


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

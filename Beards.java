public class Beards {

    public Beards (){
        System.out.println("I am default constructor");
    }

    public Beards (String  typesOfBeards, int lengthOfBeard){
        System.out.println("My beard is " + typesOfBeards + lengthOfBeard + " inches ");


    }


    public static void main(String[] args) {

         Beards allBeards = new Beards();
                allBeards.grow();
                allBeards.needaTrim();


         Beards myBeard = new Beards(" long it is nearly ", 4);
                myBeard.natural();
                myBeard.stylish();




    }

       public void grow(){
           System.out.println("All beards grow");
       }

       public void needaTrim(){
           System.out.println("All beards eventually need a trim");

       }

       public void natural() {
           System.out.println("growing a beard is natural for a man");

       }

       public void stylish() {
           System.out.println("some of us have stylish beards more so than others");

       }




}

public class House {

    public House(){

        System.out.println("I am default house");

    }

    public House(String typeOfHouse){

        System.out.println("This is a " + typeOfHouse + "house" );
    }


    public House(int numberOfStories){

        System.out.println("It's a " + numberOfStories + " story house ");
    }

    public static void main(String[] args) {

        House allHouses = new House();
              allHouses.different();
              allHouses.dream();


        House myHouse = new House("Brick");
              myHouse.solid();

        House hisHouse = new House(2);
              hisHouse.bigger();


    }

    public void different(){
        System.out.println("All houses are different");
    }

    public void dream(){
        System.out.println("All houses are a dream for some");
    }

    public void solid(){
        System.out.println("Brick houses are very solid");
    }

    public void bigger(){
        System.out.println("His house is bigger");

    }
}

public class Laptop {

    public Laptop(){
        System.out.println("I am default constructor");


    }

    public Laptop(String nameOfColor, int ramSize){
        System.out.println("Build a laptop of "  + nameOfColor  +   ramSize +  "GB"  );


    }


    public static void main(String[] args) {

        Laptop myLaptop = new Laptop();
        myLaptop.study("History");


        Laptop myBlueColorLaptop = new Laptop("Blue",  8);
               myBlueColorLaptop.study("Poetry");


    }

    public void study(String name){
        System.out.println("studying...." + name);

    }

}



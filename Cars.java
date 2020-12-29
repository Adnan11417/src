public class Cars {

    public Cars() {
        System.out.println("I am the car dealer");

    }

    public Cars(String BrandsOfCars) {
        System.out.println("Car Brands " + BrandsOfCars);

    }

    public static void main(String[] args) {

        Cars CarDealer = new Cars();
        CarDealer.sell();
        CarDealer.buy();


        Cars CarBrands = new Cars("Nissan");
        CarBrands.Nissan();
        CarBrands.Honda();

    }

    public void sell(){
        System.out.println("Dealer are selling cars");
    }

    public void buy(){
        System.out.println("Dealers can buy back cars");

    }

    public void Nissan() {
        System.out.println("Maybe I will buy a Nissan");

    }
    public void Honda(){
        System.out.println("I currently have a Honda");

        }
    }



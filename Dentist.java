public class Dentist {

public static void main(String args[]){

    Dentist DentistVisit = new Dentist();
            DentistVisit.cleaning();
            DentistVisit.filling();
            DentistVisit.rootcanal();

}
public void cleaning() {

    System.out.println("cleanings prevent dental issues");
}

public void filling() {

    System.out.println("when you have cavities you need fillings");
}

public void rootcanal(){

    System.out.println("Root canals prevent further tooth decay");
}

}



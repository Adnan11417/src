    public class Phone{

    public Phone(){
        System.out.println("I am default constructor");

    }

    public Phone (String nameOfPhoneColor){
        System.out.println("Build a phone of"  +  nameOfPhoneColor  +  "color");

    }


    public static void main(String[] args) {


        Phone myPhone = new Phone();
              myPhone.call ("John");
              myPhone.takePhoto();

        Phone myBlueColorPhone = new Phone("Red");
              myBlueColorPhone.call("Alan");



        String message = myPhone.sendText();
          System.out.println(message);


    }

    public void call(String name){
        System.out.println("Calling..." + name);

    }

    public String sendText() {
         String TextMessage = "Hello,how are you?";
                return TextMessage;

    }

    public void takePhoto(){
        System.out.println("Taking photo using built in camera");

    }


}




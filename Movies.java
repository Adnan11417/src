public class Movies {

    public Movies(){
        System.out.println("All Hollywood Movies");

    }

    public Movies(String typeOfMovie){
        System.out.println("Genre is " + typeOfMovie);

    }

    public Movies (Boolean TrueOrFalse){
        System.out.println("It is " + TrueOrFalse);

    }

    public static void main(String[] args) {

       Movies AllMovies = new Movies();
              AllMovies.copy();

       Movies ComedyMovies = new Movies("Comedy");
              ComedyMovies.funny();

       Movies MovieReviews = new Movies(false);
              MovieReviews.misleading();

    }

    public void copy(){
        System.out.println("Movies copy from each other");
    }

    public void funny(){
        System.out.println("Comedy movies are funny");
    }

    public void misleading(){
        System.out.println("Some reviews are misleading and not true");

    }
}

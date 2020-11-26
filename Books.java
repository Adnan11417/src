public class Books {


    public static void main(String[] args) {

        Books AllBooks = new Books();
        AllBooks.Read();
        AllBooks.Learn();


    }

    public void Read() {

        System.out.println("Some books have stories to read");

    }

    public void Learn() {

        System.out.println("Some books are for learning");

    }
}
public class ArrayDemo {
    public static void main(String[] args) {
        //How to declare and initialize an array

        int[] studentID = new int[5];
        // How to insert value in an array in a specific index


        try {
            studentID[0] = 101;
            studentID[1] = 102;
            studentID[2] = 103;
            studentID[3] = 104;
            studentID[4] = 105;
            //studentID[5] = 106;
        } catch (Exception problem) {
            //show me the problem
            problem.printStackTrace();
            // Provide a nice meaningful message to the user
            System.out.println("You are trying to insert more than 5 element");

        }
        //System.out.println("Get the element in the index 0: " + studentID[0]);
        //System.out.println("Get the element in the index 1: " + studentID[1]);
        //System.out.println("Get the element in the index 2: " + studentID[2]);
        //System.out.println("Get the element in the index 3: " + studentID[3]);
        //System.out.println("Get the element in the index 4: " + studentID[4]);


        for (int x = 0; x <= 4; x++) {

            System.out.println(studentID[x]); // studentID[0]
        }
    }
}




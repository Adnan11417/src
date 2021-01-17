public class ArrayWeight {

    public static void main(String[] args) {

        int[] wrestlerID = new int[5];


        try {

            wrestlerID[0] = 201;
            wrestlerID[1] = 202;
            wrestlerID[2] = 203;
            wrestlerID[3] = 204;
            wrestlerID[4] = 205;

        } catch (Exception problem) {
            problem.printStackTrace();

            System.out.println("You are trying to insert more element");
        }

        //System.out.println("Get the element in index 0:" + wrestlerID[0]);
        //System.out.println("Get the element in index 1:" + wrestlerID[1]);
        //System.out.println("Get the element in index 2:" + wrestlerID[2]);
        //System.out.println("Get the element in index 3:" + wrestlerID[3]);
        //System.out.println("Get the element in index 4:" + wrestlerID[4]);


        for (int x = 0; x <= 4; x++) {

            System.out.println(wrestlerID[x]);
        }

    }
}
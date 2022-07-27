public class CountingForLoops {
    public static void main(String[] args) {
        // Counting loop goes from 0 to 30
        for (int cnt = 0; cnt <= 30; cnt++) {
            System.out.println(cnt);
        }

        // Counting loop goes from 30 to 0
        for (int cnt = 30; cnt >= 0; cnt--) {
            System.out.println(cnt);
        }

        // Counts up by three so 0,3,6,9,12,15,18
        for (int cnt = 0; cnt <= 18; cnt = cnt + 3) {
            System.out.println(cnt);
        }

        // Counting loop goes down by two from 10 to 0 so 10,8,6,4,2,0
        for (int cnt = 10; cnt >= 0; cnt = cnt - 2) {
            System.out.println(cnt);
        }


        //NESTED FOR LOOPS
        final int ROW = 5;
        final int COL = 5;

        //Nested for loop #1
        for (int row = 0; row < ROW; row++) {
            // Inner loop goes across the row through the columns
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //Nested for loop #2
        for (int row = 0; row < 5; row++) {
            for (int col = 4; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //Nested for loop #3
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //Extra Credit
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 20; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 20; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 20; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
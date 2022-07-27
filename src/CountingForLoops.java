public class CountingForLoops {
    public static void main(String[] args)
    {
        // Counting loop goes from 0 to 30
        for (int cnt = 0; cnt <= 30; cnt++)
        {
            System.out.println(cnt);
        }

        // Counting loop goes from 30 to 0
        for (int cnt = 30; cnt >= 0; cnt--)
        {
            System.out.println(cnt);
        }

        // Counts up by three so 0,3,6,9,12,15,18
        for (int cnt = 0; cnt <= 18; cnt = cnt + 3)
        {
            System.out.println(cnt);
        }

        // Counting loop goes down by two from 10 to 0 so 10,8,6,4,2,0
        for (int cnt = 10; cnt >= 0; cnt = cnt - 2)
        {
            System.out.println(cnt);
        }

    }
}
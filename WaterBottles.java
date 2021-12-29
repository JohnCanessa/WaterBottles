import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * LeetCode 1518. Water Bottles
 * https://leetcode.com/problems/water-bottles/
 */
public class WaterBottles {


    /**
     * Given the two integers numBottles and numExchange,
     * return the maximum number of water bottles you can drink.
     * 
     * Simulation.
     * 
     * Execution: O(n / m) - Space: O(1)
     * 
     * Runtime: 0 ms, faster than 100.00% of Java online submissions.
     * Memory Usage: 37.7 MB, less than 9.28% of Java online submissions.
     * 
     * 64 / 64 test cases passed.
     * Status: Accepted
     * Runtime: 0 ms
     * Memory Usage: 37.7 MB
     */
    static public int numWaterBottles(int numBottles, int numExchange) {

        // **** sanity checks ****
        if (numBottles < numExchange) return numBottles;

        // **** initialization ****
        int drank = numBottles;

        // **** loop until we are not able to exchange bottles ****
        while (numBottles >= numExchange) {

            // **** compute number of bottles exchanged ****
            int exchanged = numBottles / numExchange;

            // ???? ????
            System.out.println("<<<  exchanged: " + exchanged);

            // **** compute number of empty bottles ****
            int empty = numBottles % numExchange;

            // ???? ????
            System.out.println("<<<      empty: " + empty);

            // **** update number of bottles drank ****
            drank += exchanged;

            // ???? ????
            System.out.println("<<<      drank: " + drank);

            // **** update numBottles ****
            numBottles = empty + exchanged;

            // ???? ????
            System.out.println("<<< numBottles: " + numBottles);
        }

        // **** return number of bottles drank ****
        return drank;
    }


    /**
     * Given the two integers numBottles and numExchange,
     * return the maximum number of water bottles you can drink.
     * 
     * Simulation.
     * 
     * Execution: O(n / m) - Space: O(1)
     * 
     * Runtime: 0 ms, faster than 100.00% of Java online submissions.
     * Memory Usage: 37.9 MB, less than 5.77% of Java online submissions.
     * 
     * 64 / 64 test cases passed.
     * Status: Accepted
     * Runtime: 0 ms
     * Memory Usage: 37.9 MB
     */
    static public int numWaterBottles0(int numBottles, int numExchange) {

        // **** sanity checks ****
        if (numBottles < numExchange) return numBottles;

        // **** initialization ****
        int drank = numBottles;

        // **** loop until we are not able to exchange bottles ****
        while (numBottles >= numExchange) {

            // **** update number of bottles drunk ****
            drank += numBottles / numExchange;

            // **** update number of bottles ****
            numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }
        // **** return number of bottles drank ****
        return drank;
    }


     /**
      * Test scaffold.
      * !!! NOT PART OF SOLUTION !!!
     * @throws IOException
      */
      public static void main(String[] args) throws IOException {

        // **** open buffered reader ****
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // **** read numBottles ****
        int numBottles = Integer.parseInt(br.readLine().trim());

        // **** read numExchange ****
        int numExchange = Integer.parseInt(br.readLine().trim());

        // **** close buffered reader ****
        br.close();

        // ???? ????
        System.out.println("main <<<  numBottles: " + numBottles);
        System.out.println("main <<< numExchange: " + numExchange);

        // ***** call function of interest and display result ****
        System.out.println("main <<< numWaterBottles0: " + numWaterBottles0(numBottles, numExchange));

        // ***** call function of interest and display result ****
        System.out.println("main <<<  numWaterBottles: " + numWaterBottles(numBottles, numExchange));
          
      }
}
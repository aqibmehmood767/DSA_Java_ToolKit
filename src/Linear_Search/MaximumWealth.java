package Linear_Search;

import java.util.Arrays;

public class MaximumWealth {
    static void main() {
        int[][] accounts = {{1,2,3},{20},{4,5},{9,10}};
        System.out.println(Arrays.toString(checkAccounts(accounts)));

    }

    static int[] checkAccounts(int[][] accounts){
        int[] accountDetails = new int[2];
        int hold = 0;
        for (int rows = 0; rows<accounts.length;rows++){
            int iterateWealth = 0;

            for (int columns = 0; columns < accounts[rows].length; columns++){
                iterateWealth += accounts[rows][columns];
            }
            if (hold<iterateWealth){
                hold = iterateWealth;
                accountDetails[0] = hold;
                accountDetails[1] = rows;
            }
        }

        return accountDetails;
    }

}

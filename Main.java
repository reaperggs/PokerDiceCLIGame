import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Press 0 to exit");
            System.out.println("Press anything else to play");
            System.out.println();
            if (sc.nextLine().equals("0")) break;
            GameLogic();
        }
        sc.close();
    }

    public static void GameLogic() {
    ArrayList<Integer> player1 = Dices();
    ArrayList<Integer> player2 = Dices();
    int x = DiceGenerator(player1);
    int y = DiceGenerator(player2);

    HashMap<Integer, String> rankings = new HashMap<>();
    rankings.put(0, "Five of a Kind");
    rankings.put(1, "Four of a Kind");
    rankings.put(2, "Full House");
    rankings.put(3, "Three of a Kind");
    rankings.put(4, "Two Pairs");
    rankings.put(5, "One Pair");
    rankings.put(6, "Unique Hand");

    System.out.print("Player 1's Hand: " + player1);
    System.out.println(" → " + rankings.get(x));

    System.out.print("Player 2's Hand: " + player2);
    System.out.println(" → " + rankings.get(y));

    System.out.println("Player 1 Rank: " + x);
    System.out.println("Player 2 Rank: " + y);

    if (x < y) {
        System.out.println("Player 1 Wins!");
    } else if (y < x) {
        System.out.println("Player 2 Wins!");
    } else {
        int sum1 = sum(player1);
        int sum2 = sum(player2);
        if (sum1 > sum2) {
            System.out.println("Total: " + sum1 + " vs " + sum2);
            System.out.println("Player 1 Wins!");
        } else if (sum2 > sum1) {
            System.out.println("Total: " + sum1 + " vs " + sum2);
            System.out.println("Player 2 Wins!");
        } else {
            System.out.println("It's a TIE!");
        }
    }
}


    public static ArrayList<Integer> Dices() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add((int) (Math.random() * 6) + 1);
        }
        return arr;
    }

    public static int DiceGenerator(ArrayList<Integer> arr) {
        int[] rank = new int[7]; // 1 to 6

        for (int num : arr) {
            rank[num]++;
        }

        int pairs = 0;
        boolean threeOfKind = false, twoOfKind = false;

        for (int i = 1; i <= 6; i++) {
            if (rank[i] == 5) return 0; // Five of a Kind
            if (rank[i] == 4) return 1; // Four of a Kind
            if (rank[i] == 3) threeOfKind = true;
            if (rank[i] == 2) {
                twoOfKind = true;
                pairs++;
            }
        }

        if (threeOfKind && twoOfKind) return 2; // Full House
        if (threeOfKind) return 3;              // Three of a Kind
        if (pairs == 2) return 4;               // Two Pairs
        if (pairs == 1) return 5;               // One Pair

        return 6; // Unique Hand (no matches)
    }

    public static int sum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}

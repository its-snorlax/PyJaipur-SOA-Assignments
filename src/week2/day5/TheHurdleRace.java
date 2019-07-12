package week2.day5;

public class TheHurdleRace {
    public static void main(String[] args) {
        int[] input1 = {1, 6, 3, 5, 2};
        System.out.println(hurdleRace(input1, 4));
        System.out.println("--------------------------");
        int[] input2 = {2, 5, 4, 5, 2};
        System.out.println(        hurdleRace(input2, 7));
        System.out.println("--------------------------");

    }

    private static int hurdleRace(int[] height, int k) {
        int maximumHeight = 0;
        for (int max : height) {
            if (maximumHeight < max) {
                maximumHeight = max;
            }
        }
        int numberOfPotion = 0;

        if ((maximumHeight - k) > 0) {
            numberOfPotion = maximumHeight - k;
        }
        return numberOfPotion;
    }
}

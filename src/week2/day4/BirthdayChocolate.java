package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {

    public static void main(String[] args) {
        ArrayList<Integer> input1 = new ArrayList<>();
        input1.add(1);
        input1.add(2);
        input1.add(1);
        input1.add(3);
        input1.add(2);
        System.out.println(birthday(input1,3,2));
        System.out.println("-------------------");
        ArrayList<Integer> input2 = new ArrayList<>();
        input2.add(1);
        input2.add(1);
        input2.add(1);
        input2.add(1);
        input2.add(1);
        System.out.println(birthday(input2,3,2));

    }

    private static int birthday(List<Integer> squares, int d, int m) {

        int ways = 0;
        int sum = 0;
        if (m <= squares.size())
            for (int i = 0; i < m; i++)
                sum += squares.get(i);
        if (sum == d) ways++;
        for (int i = 0; i < squares.size() - m; i++) {
            sum = sum - squares.get(i) + squares.get(i + m);
            if (sum == d) ways++;
        }
        return ways;

    }
}

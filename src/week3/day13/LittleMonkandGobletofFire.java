package week3.day13;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LittleMonkandGobletofFire {

    private static Queue<Integer> schools = new LinkedList<>();
    private static HashMap<Integer, Queue<Integer>> schoolAndStudent = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfOperation = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfOperation; i++) {
            String[] input = scanner.nextLine().split(" ");

            String operationType = input[0];
            switch (operationType) {
                case "E":
                    int clazz = Integer.parseInt(input[1]);
                    int rollNo = Integer.parseInt(input[2]);

                    if (!schools.contains(clazz)) {
                        schools.add(clazz);
                        Queue<Integer> students = new LinkedList<>();
                        students.offer(rollNo);
                        schoolAndStudent.put(clazz, students);
                    } else {
                        Queue<Integer> students = schoolAndStudent.get(clazz);
                        students.add(rollNo);
                        schoolAndStudent.put(clazz, students);
                    }
                    break;

                case "D":
                    Integer schoolToDequeue = schools.peek();
                    Queue<Integer> students = schoolAndStudent.get(schoolToDequeue);
                    Integer dequeuedStudent = students.poll();

                    if (students.isEmpty()) {
                        schoolAndStudent.remove(schoolToDequeue);
                        schools.remove();
                    }
                    System.out.println(schoolToDequeue + " " + dequeuedStudent);

                    break;
            }
        }
    }
}


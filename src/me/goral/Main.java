package me.goral;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<String> questions = new ArrayList<>();
        questions.add("How much is 2 + 2?");
        questions.add("How much is 10 * 23?");
        questions.add("How much is 3 - 5?");
        questions.add("How much is 10 / 2?");
        questions.add("How much is 54 * 2?");

        List<Integer> answers = new ArrayList<>();
        answers.add(2+2);
        answers.add(10 * 23);
        answers.add(3 - 5);
        answers.add(10 / 2);
        answers.add(54 * 2);

        int points = 0;
        boolean flag = true;

        while(flag) {
            for (int i = 0; i < questions.size(); i++){
                points = askQuestion(questions, answers, points, i, scanner);
            }
            outputResults(points, questions.size());

            System.out.println("Want to play again?");
            if (!scanner.next().equals("yes")) flag = false;
        }
    }

    private static void outputResults(int points, int size) {
        float percentage = (float)points / (float)size;
        System.out.println("You answered correctly for " +points+ " questions out of "+size);
        System.out.println("That gives you: "+percentage*100+"%");
        int grade = 0;


        if (percentage >= 0.95) grade = 6;
        else if (percentage < 0.95 && percentage >= 0.86) grade = 5;
        else if (percentage < 0.86 && percentage >= 0.76) grade = 4;
        else if (percentage < 0.76 && percentage >= 0.65) grade = 3;
        else if (percentage < 0.65 && percentage >= 0.50) grade = 2;
        else grade = 1;

        switch (grade) {
            case 1 -> System.out.println("You did not pass. Grade: 1");
            case 2 -> System.out.println("You passed the test. Grade: 2");
            case 3 -> System.out.println("You did quite good. Grade: 3");
            case 4 -> System.out.println("Good job. Grade: 4");
            case 5 -> System.out.println("I am proud of you. Grade: 5");
            case 6 -> System.out.println("Nerd. Grade: 6");
            default -> System.out.println("default");
        }
    }

    private static int askQuestion(List<String> q, List<Integer> a, int points, int i, Scanner sc) {
        System.out.println(q.get(i));
        if (sc.nextInt() == a.get(i)) points++;
        return points;
    }
}

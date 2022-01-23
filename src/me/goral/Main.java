package me.goral;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
            outputResults(points);

            System.out.println("Want to play again?");
            if (!scanner.next().equals("yes")) flag = false;
        }
    }

    private static void outputResults(int points) {
        switch (points) {
            case 5 -> System.out.println("You're math master! 5 points to Gryffindor!");
            case 4 -> System.out.println("Almost there! 4 points!");
            case 3 -> System.out.println("Congrats! You earned 3 points!");
            case 2 -> System.out.println("Whoops! Only 2 points!");
            case 1 -> System.out.println("Hmm. 1 point. You can do better than that.");
            case 0 -> System.out.println("I won't comment that");
            default -> System.out.println("Default switch pass");
        }
    }

    private static int askQuestion(List<String> q, List<Integer> a, int points, int i, Scanner sc) {
        System.out.println(q.get(i));
        if (sc.nextInt() == a.get(i)) points++;
        return points;
    }
}

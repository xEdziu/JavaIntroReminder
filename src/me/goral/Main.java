package me.goral;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] questions = new String[5];
        questions[0] = "How much is 2 + 2?";
        questions[1] = "How much is 10 * 23?";
        questions[2] = "How much is 3 - 5?";
        questions[3] = "How much is 10 / 2?";
        questions[4] = "How much is 54 * 2?";

        int[] answers = new int[5];
        answers[0] = 2+2;
        answers[1] = 10 * 23;
        answers[2] = 3 - 5;
        answers[3] = 10 / 2;
        answers[4] = 54 * 2;

        int points = 0;
        boolean flag = true;

        while(flag) {
            for (int i = 0; i < questions.length; i++){
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

    private static int askQuestion(String[] q, int[] a, int points, int i, Scanner sc) {
        System.out.println(q[i]);
        if (sc.nextInt() == a[i]) points++;
        return points;
    }
}

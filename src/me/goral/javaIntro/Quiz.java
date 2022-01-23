package me.goral.javaIntro;

import java.util.Map;
import java.util.Scanner;

public class Quiz {

    private final Map<String, Integer> quizBase;
    private int points = 0;
    private final int size;
    private final Scanner scanner = new Scanner(System.in);

    public Quiz(Map<String, Integer> quizBase, int size) {
        this.quizBase = quizBase;
        this.size = size;
    }

    public void beginQuiz() {
        boolean flag = true;
        while (flag) {
            askQuestion();
            outPutResults();
            flag = playAgain();
        }

    }

    private void outPutResults(){
        float percentage = (float)points / (float)size;
        System.out.println("You answered correctly for " +points+ " questions out of "+size);
        System.out.println("That gives you: "+percentage*100+"%");
        int grade;


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

    private void askQuestion() {
        for (String key : quizBase.keySet()) {
            System.out.println(key);
            if (scanner.nextInt() == quizBase.get(key)) points++;
        }
    }

    public boolean playAgain(){
        return scanner.next().equals("yes");
    }
}


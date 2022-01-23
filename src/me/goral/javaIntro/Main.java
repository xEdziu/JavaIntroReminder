package me.goral.javaIntro;

import me.goral.javaIntro.Quiz;

import java.util.*;

public class Main {
    public static void main(String[] args){

        Map<String, Integer> quizBase = new HashMap<>();
        quizBase.put("How much is 2 + 2?", 2+2);
        quizBase.put("How much is 10 * 23?", 10 * 23);
        quizBase.put("How much is 3 - 5?", 3 - 5);
        quizBase.put("How much is 10 / 2?", 10 / 2);
        quizBase.put("How much is 54 * 2?", 54 * 2);

       Quiz q = new Quiz(quizBase, quizBase.size());
       q.beginQuiz();

    }
}

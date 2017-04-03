package com.example.rkesavan.quizapp;

/**
 * Created by rkesavan on 4/2/2017.
 */

public class SampleMathQuestions {
    public QuizCategory quizCategory;

    public SampleMathQuestions() { this.initMathQs(); }

    private  void initMathQs() {
        this.quizCategory = new QuizCategory();
        this.quizCategory.categoryName = "Math";
        this.quizCategory.categoryID = 2;

        //Category QAndA
        CategoryQAndA categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "What 5 to the power of 4 ?";
        categoryQAndA.answers.add("625");
        categoryQAndA.answers.add("125");
        categoryQAndA.answers.add("25");
        categoryQAndA.answers.add("5");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(0);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);

        categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "What does 5 + 4 - 6 + 3 equal to ?";
        categoryQAndA.answers.add("10");
        categoryQAndA.answers.add("5");
        categoryQAndA.answers.add("6");
        categoryQAndA.answers.add("8");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(2);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);

        categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "What is 6 times 7 time 10 equal to ?";
        categoryQAndA.answers.add("480");
        categoryQAndA.answers.add("420");
        categoryQAndA.answers.add("20");
        categoryQAndA.answers.add("100");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(1);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);

        categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "How many composite numbers are there between 1 and 10 ?";
        categoryQAndA.answers.add("4");
        categoryQAndA.answers.add("3");
        categoryQAndA.answers.add("1");
        categoryQAndA.answers.add("6");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(0);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);

        categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "Which number is both even and composite ?";
        categoryQAndA.answers.add("3");
        categoryQAndA.answers.add("8");
        categoryQAndA.answers.add("2");
        categoryQAndA.answers.add("11");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(2);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);
    }
}

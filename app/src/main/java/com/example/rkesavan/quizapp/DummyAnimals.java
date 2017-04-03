package com.example.rkesavan.quizapp;

/**
 * Created by rkesavan on 3/31/2017.
 */

public class DummyAnimals {
    public QuizCategory quizCategory;

    DummyAnimals() {
        this.initAnimals();
    }

    private void initAnimals() {
        this.quizCategory = new QuizCategory();
        this.quizCategory.categoryName = "Animals";
        this.quizCategory.categoryID = 0;

        //Category QAndA
        CategoryQAndA categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "Which animal runs the fastest ?";
        categoryQAndA.answers.add("Dog");
        categoryQAndA.answers.add("Zebra");
        categoryQAndA.answers.add("Lion");
        categoryQAndA.answers.add("Cheetah");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(3);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);

        categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "How many miles / hr can a cheetah run ?";
        categoryQAndA.answers.add("30 miles / hour");
        categoryQAndA.answers.add("70 miles / hour");
        categoryQAndA.answers.add("110 miles / hour");
        categoryQAndA.answers.add("90 miles / hour");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(1);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);

        categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "How many horns oryx have ?";
        categoryQAndA.answers.add("3");
        categoryQAndA.answers.add("2");
        categoryQAndA.answers.add("4");
        categoryQAndA.answers.add("5");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(1);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);

        categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "How many little sticks does a moose have on it's head ?";
        categoryQAndA.answers.add("11");
        categoryQAndA.answers.add("4");
        categoryQAndA.answers.add("14");
        categoryQAndA.answers.add("8");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(2);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);

        categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "How many miles / hr can a zebra run ?";
        categoryQAndA.answers.add("10 miles / hour");
        categoryQAndA.answers.add("70 miles / hour");
        categoryQAndA.answers.add("25 miles / hour");
        categoryQAndA.answers.add("90 miles / hour");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(2);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);
    }
}

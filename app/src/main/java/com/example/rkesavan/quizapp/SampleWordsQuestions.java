package com.example.rkesavan.quizapp;

/**
 * Created by rkesavan on 4/2/2017.
 */

public class SampleWordsQuestions {
    public QuizCategory quizCategory;

    public SampleWordsQuestions() { this.initWordQs() ; }

    private  void initWordQs() {
        this.quizCategory = new QuizCategory();
        this.quizCategory.categoryName = "Words";
        this.quizCategory.categoryID = 1;

        //Category QAndA
        CategoryQAndA categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "What is a tomato ?";
        categoryQAndA.answers.add("Fruit");
        categoryQAndA.answers.add("Vegetable");
        categoryQAndA.answers.add("Fruit and Vegetable");
        categoryQAndA.answers.add("None of the above");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(1);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);

        categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "How many vowels do we have in English ?";
        categoryQAndA.answers.add("10");
        categoryQAndA.answers.add("5");
        categoryQAndA.answers.add("1");
        categoryQAndA.answers.add("8");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(1);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);

        categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "What is the meaning of the word 'punctual' ?";
        categoryQAndA.answers.add("To be very specific about something.");
        categoryQAndA.answers.add("To be very late.");
        categoryQAndA.answers.add("To be on time.");
        categoryQAndA.answers.add("To puncture a hole.");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(2);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);

        categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "What is the meaning of the word 'fortnight' ?";
        categoryQAndA.answers.add("A knight living in a fort.");
        categoryQAndA.answers.add("A fort that sees no night.");
        categoryQAndA.answers.add("Something that occurs every 14 nights.");
        categoryQAndA.answers.add("A month that has four nights.");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(2);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);

        categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "What is the meaning of the word 'costly' ?";
        categoryQAndA.answers.add("Something that is very cheap.");
        categoryQAndA.answers.add("Something that costs very less.");
        categoryQAndA.answers.add("Something that has to be done at any cost.");
        categoryQAndA.answers.add("Something that is very expensive.");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(3);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);
    }
}

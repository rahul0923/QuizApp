package com.example.rkesavan.quizapp;

/**
 * Created by rkesavan on 4/2/2017.
 */

public class SampleScienceQuestions {
    public QuizCategory quizCategory;

    public SampleScienceQuestions() {
        this.initScienceQs();
    }
    private  void initScienceQs() {
        this.quizCategory = new QuizCategory();
        this.quizCategory.categoryName = "Science";
        this.quizCategory.categoryID = 3;

        //Category QAndA
        CategoryQAndA categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "Name the 3rd planet in our solar system ?";
        categoryQAndA.answers.add("Mars");
        categoryQAndA.answers.add("Venus");
        categoryQAndA.answers.add("Earth");
        categoryQAndA.answers.add("Pluto");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(2);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);

        categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "How many states of matter are there ?";
        categoryQAndA.answers.add("3");
        categoryQAndA.answers.add("1");
        categoryQAndA.answers.add("4");
        categoryQAndA.answers.add("2");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(0);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);

        categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "How many oceans do we have ?";
        categoryQAndA.answers.add("3");
        categoryQAndA.answers.add("5");
        categoryQAndA.answers.add("1");
        categoryQAndA.answers.add("6");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(1);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);

        categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "What is the process of making food by plants called ?";
        categoryQAndA.answers.add("Cholorophom.");
        categoryQAndA.answers.add("Photosynthesis.");
        categoryQAndA.answers.add("Mitochondria.");
        categoryQAndA.answers.add("Luminience.");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(1);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);

        categoryQAndA = new CategoryQAndA();
        categoryQAndA.question = "What is the name of Earth's natural satellite ?";
        categoryQAndA.answers.add("Hubble.");
        categoryQAndA.answers.add("Mars.");
        categoryQAndA.answers.add("Sun.");
        categoryQAndA.answers.add("Moon.");
        categoryQAndA.correctAnswer = categoryQAndA.answers.get(3);
        this.quizCategory.categoryQAndAs.add(categoryQAndA);
    }
}

package com.example.rkesavan.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public int currentPg = 0;
    public Button quizButton;
    public TextView questTitleText;
    public TextView quizInfoText;
    public TextView goodLuckText;
    public RadioButton choice1;
    public RadioButton choice2;
    public RadioButton choice3;
    public RadioButton choice4;

    public ArrayList<QuizCategory> categoryList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.populateData();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.questTitleText = (TextView) findViewById(R.id.questTitle);
        this.quizInfoText = (TextView) findViewById(R.id.textViewQuizInfo);
        this.choice1 = (RadioButton) findViewById(R.id.radioChoice1);
        this.choice2 = (RadioButton) findViewById(R.id.radioChoice2);
        this.choice3 = (RadioButton) findViewById(R.id.radioChoice3);
        this.choice4 = (RadioButton) findViewById(R.id.radioChoice4);
        this.goodLuckText = (TextView) findViewById(R.id.textGoodLuck);
        this.quizButton = (Button) findViewById(R.id.button);
    }

    public void populateData(){
        DummyAnimals dummyAnimals = new DummyAnimals();
        this.categoryList.add(dummyAnimals.quizCategory);
    }

    public void buttonClicked(View view) {
        Log.d(MainActivity.class.getName(), "Button clicked " + this.currentPg);
        this.hideShowView();
    }

    private void setQuestionAndChoices(CategoryQAndA question) {

        this.questTitleText.setText(question.question);
        // Change choices
        this.choice1.setText(question.answers.get(0));
        this.choice2.setText(question.answers.get(1));
        this.choice3.setText(question.answers.get(2));
        this.choice4.setText(question.answers.get(3));
    }

    public void hideShowView() {
        final QuizCategory quizCategory = this.categoryList.get(0);
        CategoryQAndA question;
        switch (this.currentPg) {
            case 0:
                // In Intro pg, hide, welcome screens and show first question
                this.quizInfoText.setVisibility(View.INVISIBLE);
                this.goodLuckText.setVisibility(View.INVISIBLE);

                question = quizCategory.categoryQAndAs.get(0);
                this.setQuestionAndChoices(question);
                // increment pg
                this.currentPg++;
                // change button title
                this.quizButton.setText(R.string.next_button);
                break;
            case 1:
                question = quizCategory.categoryQAndAs.get(1);
                this.setQuestionAndChoices(question);
                // increment pg
                this.currentPg++;
                break;
            case 2:
                question = quizCategory.categoryQAndAs.get(2);
                this.setQuestionAndChoices(question);
                // increment pg
                this.currentPg++;
                break;
            case 3:
                question = quizCategory.categoryQAndAs.get(3);
                this.setQuestionAndChoices(question);
                // increment pg
                this.currentPg++;
                break;
            case 4:
                question = quizCategory.categoryQAndAs.get(4);
                this.setQuestionAndChoices(question);
                this.currentPg++;
                break;
            case 5:
                // In Q5 pg, show Finish / Score Pg
                // Change question title
                this.questTitleText.setText("Congratulations!!");
                // Hide choices
                this.choice1.setVisibility(View.INVISIBLE);
                this.choice2.setVisibility(View.INVISIBLE);
                this.choice3.setVisibility(View.INVISIBLE);
                this.choice4.setVisibility(View.INVISIBLE);
                // increment pg
                this.currentPg++;
                break;
            case 6:
                // In pg 6 , show First Pg
                // Change question title
                this.questTitleText.setText(R.string.main_info);
                // Hide choices
                this.choice1.setVisibility(View.VISIBLE);
                this.choice2.setVisibility(View.VISIBLE);
                this.choice3.setVisibility(View.VISIBLE);
                this.choice4.setVisibility(View.VISIBLE);

                this.choice1.setText(R.string.choice_animals);
                this.choice2.setText(R.string.choice_words);
                this.choice3.setText(R.string.choice_math);
                this.choice4.setText(R.string.choice_science);

                this.quizInfoText.setVisibility(View.VISIBLE);
                this.goodLuckText.setVisibility(View.VISIBLE);

                // reset pg
                this.currentPg = 0;
                // change button title
                this.quizButton.setText(R.string.begin_button);
                break;
        }
    }
}

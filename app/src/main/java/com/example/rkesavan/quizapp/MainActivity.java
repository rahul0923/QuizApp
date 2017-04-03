package com.example.rkesavan.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

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
    public RadioGroup radioGroup;
    public int score;
    public QuizCategory quizCategory;

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
        this.radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        this.goodLuckText = (TextView) findViewById(R.id.textGoodLuck);
        this.quizButton = (Button) findViewById(R.id.button);
    }

    public void populateData(){
        DummyAnimals dummyAnimals = new DummyAnimals();
        this.categoryList.add(dummyAnimals.quizCategory);

        SampleWordsQuestions sampleWordsQuestions = new SampleWordsQuestions();
        this.categoryList.add(sampleWordsQuestions.quizCategory);

        SampleMathQuestions sampleMathQuestions = new SampleMathQuestions();
        this.categoryList.add(sampleMathQuestions.quizCategory);

        SampleScienceQuestions sampleScienceQuestions = new SampleScienceQuestions();
        this.categoryList.add(sampleScienceQuestions.quizCategory);
    }

    public void buttonClicked(View view) {
        Log.d(MainActivity.class.getName(), "Button clicked " + this.currentPg);
        this.hideShowView();
    }

    private void setQuestionAndChoices(int qNum, CategoryQAndA question) {
        this.questTitleText.setText("Q" + qNum + ": " + question.question);
        this.choice1.setChecked(true);
        // Change choices
        this.choice1.setText(question.answers.get(0));
        this.choice2.setText(question.answers.get(1));
        this.choice3.setText(question.answers.get(2));
        this.choice4.setText(question.answers.get(3));
    }

    private String selectedChoice(String correctAns) {
        View radioButton = this.radioGroup.findViewById(this.radioGroup.getCheckedRadioButtonId());
        int idx = this.radioGroup.indexOfChild(radioButton);
        RadioButton r = (RadioButton) radioGroup.getChildAt(idx);
        String pickedOption = r.getText().toString();
        if (pickedOption.equals(correctAns)) {
            Toast.makeText(getApplicationContext(),
                    "You are right! ",
                    Toast.LENGTH_SHORT).show();
            this.score++;
        } else {
            Toast.makeText(getApplicationContext(),
                    "Sorry that's not correct! ",
                    Toast.LENGTH_SHORT).show();
        }
        return pickedOption;
    }

    private void setQuizCategory() {
        View radioButton = this.radioGroup.findViewById(this.radioGroup.getCheckedRadioButtonId());
        int idx = this.radioGroup.indexOfChild(radioButton);
        RadioButton r = (RadioButton) radioGroup.getChildAt(idx);
        String pickedOption = r.getText().toString();
        if (pickedOption.equals("Animals")) {
            quizCategory = this.categoryList.get(0);
        } else if (pickedOption.equals("Words")) {
            quizCategory = this.categoryList.get(1);
        } else if (pickedOption.equals("Math")) {
            quizCategory = this.categoryList.get(2);
        } else if (pickedOption.equals("Science")) {
            quizCategory = this.categoryList.get(3);
        }
    }

    public void hideShowView() {
        CategoryQAndA question;
        switch (this.currentPg) {
            case 0:
                // In Intro pg, hide, welcome screens and show first question
                this.quizInfoText.setVisibility(View.INVISIBLE);
                this.goodLuckText.setVisibility(View.INVISIBLE);
                this.setQuizCategory();
                question = this.quizCategory.categoryQAndAs.get(0);
                this.setQuestionAndChoices(1, question);
                // increment pg
                this.currentPg++;
                this.quizButton.setText(R.string.next_button);
                break;
            case 1:
                question = quizCategory.categoryQAndAs.get(0);
                this.selectedChoice(question.correctAnswer);
                question = this.quizCategory.categoryQAndAs.get(1);
                this.setQuestionAndChoices(2, question);
                // increment pg
                this.currentPg++;
                break;
            case 2:
                question = quizCategory.categoryQAndAs.get(1);
                this.selectedChoice(question.correctAnswer);
                question = this.quizCategory.categoryQAndAs.get(2);
                this.setQuestionAndChoices(3, question);
                // increment pg
                this.currentPg++;
                break;
            case 3:
                question = quizCategory.categoryQAndAs.get(2);
                this.selectedChoice(question.correctAnswer);
                question = this.quizCategory.categoryQAndAs.get(3);
                this.setQuestionAndChoices(4, question);
                // increment pg
                this.currentPg++;
                break;
            case 4:
                question = quizCategory.categoryQAndAs.get(3);
                this.selectedChoice(question.correctAnswer);
                question = this.quizCategory.categoryQAndAs.get(4);
                this.setQuestionAndChoices(5, question);
                this.currentPg++;
                break;
            case 5:
                question = quizCategory.categoryQAndAs.get(4);
                this.selectedChoice(question.correctAnswer);
                this.choice1.setChecked(true);
                // In Q5 pg, show Finish / Score Pg
                // Change question title
                this.setFinishTitle();
                // Hide choices
                this.choice1.setVisibility(View.INVISIBLE);
                this.choice2.setVisibility(View.INVISIBLE);
                this.choice3.setVisibility(View.INVISIBLE);
                this.choice4.setVisibility(View.INVISIBLE);
                // increment pg
                this.currentPg++;
                this.quizButton.setText(R.string.done_button);
                break;
            case 6:
                // In pg 6 , show First Pg
                // Change question title
                this.questTitleText.setText(R.string.main_info);
                // Hide choices
                this.choice1.setVisibility(View.VISIBLE);
                this.choice1.setChecked(true);
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

    public void setFinishTitle() {
        switch (this.score) {
            case 5:
                this.questTitleText.setText("Congratulations!! You got everything correct (" + this.score + " of  " + this.quizCategory.categoryQAndAs.size() + ".)" );
                break;
            case 4:
                this.questTitleText.setText("Good job!! You got " + this.score +  " of  " + this.quizCategory.categoryQAndAs.size() + " correct.");
                break;
            case 3:
                this.questTitleText.setText("Not bad!! You got " + this.score  + " of  " + this.quizCategory.categoryQAndAs.size() + " correct." );
                break;
            case 2:
                this.questTitleText.setText("Try harder next time!! You got " + this.score + " of  " + this.quizCategory.categoryQAndAs.size() + " correct." );
                break;
            case 1:
                this.questTitleText.setText("Sorry!! You got " + this.score  + " of  " + this.quizCategory.categoryQAndAs.size() + " correct, better luck next time." );
                break;
            case 0:
                this.questTitleText.setText("Sorry!! You got everything wrong. Try again." );
                break;
        }
    }
}

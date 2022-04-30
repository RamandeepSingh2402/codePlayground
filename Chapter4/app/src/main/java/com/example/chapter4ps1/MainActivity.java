package com.example.chapter4ps1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView question;

    private String[] questions = {"Was Java introduced in 1995?","Is Java a person?", "Does Java support abstract classes?",
            "Does Java support interfaces?", "Was Java made using Python?"};
    private boolean[] answers ={true, false, true, true, false};
    private int score = 0;
    Button yes;
    Button no;

    private int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question = findViewById(R.id.question);
        question.setText(questions[index]);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=questions.length-1){
                    //If you have given correct answer
                    if(answers[index]==true){
                        score++;
                    }
                    //To go to the next question
                    index++;
                    if(index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this,"Your score is: "+ score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play the game again", Toast.LENGTH_SHORT).show();;
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If the array is not going out of bounds
                if(index<=questions.length-1){
                    //If you have given correct answer
                    if(answers[index]==false){
                        score++;
                    }
                    //To go to the next question
                    index++;
                    if(index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this,"Your score is: "+ score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play the game again", Toast.LENGTH_SHORT).show();;
                }
            }
        });
    }
}
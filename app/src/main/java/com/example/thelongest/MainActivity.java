package com.example.thelongest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText text;
    TextView answer_word, answer_number;
    String s;
    String words[] = s.split(" ");
    String maxWorld = "";
    int maxLength = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        answer_number = findViewById(R.id.result_number);
        answer_word = findViewById(R.id.result_word);
    }

    public void click(View v){
        s = text.getText().toString();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength){
                maxLength = words[i].length();
                maxWorld = words[i];
            }
        }
        answer_word.setText(maxWorld);
        answer_number.setText(maxLength);
    }
}
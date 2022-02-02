package com.example.buttonclickapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private Button button;
    private TextView textView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("");
        textView.setMovementMethod(new ScrollingMovementMethod());

        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable e = userInput.getText();
                String result = e.toString();
                result = result + "\n";
                textView.append(result);
                
            }
        };
        button.setOnClickListener(ourOnClickListener);

    }
}
package com.example.authelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //adding components on screen
        final EditText addTextBox = (EditText)findViewById(R.id.ADD_TEXT);
        final TextView showText = (TextView)findViewById(R.id.SHOW_TEXTVIEW);
        //add listener for button here
        Button addTextBut = (Button)findViewById(R.id.SHOW_BUTTON);

        addTextBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showText.setText(addTextBox.getText());
                Toast.makeText(getApplicationContext(), "Button has been clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

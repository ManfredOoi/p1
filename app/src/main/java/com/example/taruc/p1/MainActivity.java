package com.example.taruc.p1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private EditText editTextfield, editTextAge;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextfield = (EditText)findViewById(R.id.editTextName);
        editTextAge = (EditText)findViewById(R.id.editTextAge);
        textView = (TextView)findViewById(R.id.textViewMsg);

    }

    public void showMessage(View v){
        String name;
        int age = Integer.getInteger(editTextAge.getText().toString()); // Integer parse
        name = editTextfield.getText().toString();
        textView.setText("Hi " + name + " Age: " + editTextAge.getText().toString() + ". ");

    }
}

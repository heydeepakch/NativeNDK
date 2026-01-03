package com.example.nativendkdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }

    public native String getGreetingFromNative();
    public native int addNumbers(int a, int b);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView greeting = findViewById(R.id.greetingText);
        EditText inputA = findViewById(R.id.inputA);
        EditText inputB = findViewById(R.id.inputB);
        Button addButton = findViewById(R.id.addButton);
        TextView result = findViewById(R.id.resultText);

        greeting.setText(getGreetingFromNative());

        addButton.setOnClickListener(v -> {
            int a = Integer.parseInt(inputA.getText().toString());
            int b = Integer.parseInt(inputB.getText().toString());
            int sum = addNumbers(a, b);
            result.setText("Result: " + sum);
        });
    }
}

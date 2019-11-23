package ua.knu.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button recordGestureButton;
    Button recognizeGestureButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recordGestureButton = findViewById(R.id.button1);
        recognizeGestureButton = findViewById(R.id.button2);

        recordGestureButton.setOnClickListener(this);
        recognizeGestureButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button1:
                Intent intent = new Intent(MainActivity.this, RecordActivity.class);
                startActivity(intent);
                break;

            case R.id.button2:
                Intent intent2 = new Intent(MainActivity.this, RecognizeActivity.class);
                startActivity(intent2);
                break;

        }

    }
}

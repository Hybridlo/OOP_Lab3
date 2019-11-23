package ua.knu.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecognizeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recognize);

        Button backButton = findViewById(R.id.button3);

        backButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.finish();
    }
}

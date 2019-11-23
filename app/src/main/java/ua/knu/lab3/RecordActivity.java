package ua.knu.lab3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RecordActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        Button backButton = findViewById(R.id.button);

        backButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.finish();
    }
}

package caro.val.accessibleapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NextScreen extends AppCompatActivity {

    TextView mName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_screen);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        mName = findViewById(R.id.name_text_view);
        String mGreetingPhrase = getString(R.string.greetings) + " " + name +"!";
        mName.setText(mGreetingPhrase);
        mName.setContentDescription(mGreetingPhrase);
    }

}

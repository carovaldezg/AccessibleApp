package caro.val.accessibleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.text.TextUtils.isEmpty;

public class MainActivity extends AppCompatActivity {

    EditText mName;
    LinearLayout mErrorMessage;
    Button mNextScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = findViewById(R.id.name_edit_text);
        mNextScreen = findViewById(R.id.next_screen_button);
        mErrorMessage = findViewById(R.id.error_message_text_layout);

        mNextScreen.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View v) {
                                               goToNextScreen();
                                           }
                                       }
        );
    }

   public void goToNextScreen() {
        if (!isEmpty(mName.getText())) {
            mErrorMessage.setVisibility(View.GONE);
            Intent intent = new Intent(this, NextScreen.class);
            intent.putExtra("name", mName.getText().toString());
            startActivity(intent);
        }
        else {
            mErrorMessage.setVisibility(View.VISIBLE);
        }
    }

}

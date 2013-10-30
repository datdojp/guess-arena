package jp.co.okayama.guessarena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class CreateGuess extends BaseActivity {
    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setTitle("Create Guess");
        setContentView(R.layout.activity_create_guess);
        findViewById(R.id.done).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CreateGuess.this, WaitActivity.class));
            }
        });
    }
}

package jp.co.okayama.guessarena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class AnswerGuessActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.activity_answer_guess);
        setTitle("Answer Guess");
        
        findViewById(R.id.done).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnswerGuessActivity.this, CreateGuess.class));
            }
        });
    }
}

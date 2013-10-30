package jp.co.okayama.guessarena;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WaitActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.activity_wait);
        setTitle("Wait for the opponent");
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(WaitActivity.this, AnswerGuessActivity.class));
            }
        }, 4000);
    }
}

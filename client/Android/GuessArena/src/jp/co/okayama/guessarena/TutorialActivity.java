package jp.co.okayama.guessarena;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TutorialActivity extends Activity {
    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.activity_tutorial);
        setTitle("Tutorial");

        findViewById(R.id.closeButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TutorialActivity.this, GameListActivity.class));
                finish();
            }
        });
    }
}

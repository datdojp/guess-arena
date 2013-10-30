package jp.co.okayama.guessarena;

import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity {
    @Override
    protected void onResume() {
        super.onResume();
        startActivity(new Intent(this, TutorialActivity.class));
    }
}

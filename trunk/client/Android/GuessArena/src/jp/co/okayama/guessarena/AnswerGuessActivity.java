package jp.co.okayama.guessarena;

import jp.co.okayama.guessarena.util.Utils;
import android.os.Bundle;

public class AnswerGuessActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.activity_answer_guess);
        
        Utils.focusNothing(this);
    }
}

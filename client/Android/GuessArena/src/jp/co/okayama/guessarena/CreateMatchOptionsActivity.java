package jp.co.okayama.guessarena;

import java.util.Random;

import jp.co.okayama.guessarena.model.MatchOptionSet;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class CreateMatchOptionsActivity extends BaseActivity {
    private Button[] mLevelButtons;
    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.activity_create_match_options);

        mLevelButtons = new Button[] {
                (Button) findViewById(R.id.bt_beginner),
                (Button) findViewById(R.id.bt_easy),
                (Button) findViewById(R.id.bt_normal),
                (Button) findViewById(R.id.bt_hard),
                (Button) findViewById(R.id.bt_very_hard),
                (Button) findViewById(R.id.bt_crazy),
                (Button) findViewById(R.id.bt_impossible)
        };
        mLevelButtons[0].setSelected(true);
        
        Random rand = new Random();
        for (int i = 0; i < mLevelButtons.length; i++) {
             int wordLengthMin = rand.nextInt(10);
             int wordLengthMax = wordLengthMin + rand.nextInt(4) + 1;
             int answerTimeInMinutes = rand.nextInt(10);
             int hintNumber = rand.nextInt(10);
             int guessNumber = rand.nextInt(5) * 2;
             int correctionPercentages = rand.nextInt(60) + 40;
             int retryNumber = rand.nextInt(5);
             final MatchOptionSet optionSet = new MatchOptionSet(
                     wordLengthMin,
                     wordLengthMax,
                     answerTimeInMinutes,
                     hintNumber,
                     guessNumber,
                     correctionPercentages,
                     retryNumber);
             mLevelButtons[i].setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    showOptionSet(optionSet);
                }
            });
        }
    }
    
    private void showOptionSet(MatchOptionSet optionSet) {
        ((TextView)findViewById(R.id.txt_word_length))
        .setText(getString(R.string.word_length, optionSet.getWordLengthMin(), optionSet.getWordLengthMax()));
        
        ((TextView)findViewById(R.id.txt_answer_time_in_minutes))
        .setText(getString(R.string.answer_time_in_minutes, optionSet.getAnswerTimeInMinutes()));
        
        ((TextView)findViewById(R.id.txt_hint_number))
        .setText(getString(R.string.hint_number, optionSet.getHintNumber()));
        
        ((TextView)findViewById(R.id.txt_guess_number))
        .setText(getString(R.string.guess_number, optionSet.getGuessNumber()));
        
        ((TextView)findViewById(R.id.txt_correction_percentages))
        .setText(getString(R.string.correction_percentages, optionSet.getCorrectionPercentages()));
        
        ((TextView)findViewById(R.id.txt_retry_number))
        .setText(getString(R.string.retry_number, optionSet.getRetryNumber()));
    }
}

package jp.co.okayama.guessarena;

import java.util.Random;

import jp.co.okayama.guessarena.model.MatchOptionSet;
import jp.co.okayama.guessarena.util.Utils;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class CreateMatchOptionsActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.activity_create_match_options);

        // option set
        final Button[] optionSetButtons = new Button[] {
                (Button) findViewById(R.id.bt_beginner),
                (Button) findViewById(R.id.bt_easy),
                (Button) findViewById(R.id.bt_normal),
                (Button) findViewById(R.id.bt_hard),
                (Button) findViewById(R.id.bt_very_hard),
                (Button) findViewById(R.id.bt_crazy),
                (Button) findViewById(R.id.bt_impossible)
        };
        optionSetButtons[0].setSelected(true);

        Random rand = new Random();
        for (int i = 0; i < optionSetButtons.length; i++) {
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
            optionSetButtons[i].setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (Button button : optionSetButtons) {
                        button.setSelected(button == v);
                    }

                    showOptionSet(optionSet);
                }
            });
        }

        optionSetButtons[0].performClick();


        // type (1-1, exp bet, buki bet)
        final View[] typeTabs = new View[] {
                findViewById(R.id.one_one_tab),
                findViewById(R.id.exp_bet_tab),
                findViewById(R.id.buki_bet_tab)
        };
        final View[] typeLayouts = new View[] {
                findViewById(R.id.one_one_layout),
                findViewById(R.id.exp_bet_layout),
                findViewById(R.id.buki_bet_layout)
        };
        for (int i = 0; i < typeTabs.length; i++) {
            final int finalI = i;
            typeTabs[i].setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (int j = 0; j < typeTabs.length; j++) {
                        boolean selected = finalI == j;
                        typeTabs[j].setSelected(selected);
                        typeLayouts[j].setVisibility(selected ? View.VISIBLE : View.GONE);
                    }
                }
            });
        }
        typeTabs[0].performClick();

        // do not focus
        Utils.focusNothing(this);
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

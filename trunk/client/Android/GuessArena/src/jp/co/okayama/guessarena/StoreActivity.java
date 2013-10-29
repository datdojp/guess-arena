package jp.co.okayama.guessarena;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class StoreActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.activity_store);

        final View[] tabs = new View[] {
                findViewById(R.id.tab_top),
                findViewById(R.id.tab_category),
                findViewById(R.id.tab_all)
        };
        for (int i = 0; i < tabs.length; i++) {
            tabs[i].setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (int j = 0; j < tabs.length; j++) {
                        tabs[j].setSelected(v == tabs[j]);
                    }
                }
            });
        }
        tabs[0].performClick();
    }
}

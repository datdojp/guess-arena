package jp.co.okayama.guessarena;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.GridView;

public class BukiSelectActivity extends BaseActivity {
    GridView mGridBuki;
    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setTitle("Select Buki");
        setContentView(R.layout.activity_buki_select);
        mGridBuki = (GridView) findViewById(R.id.gridView_buki);
        
        CheckBox ready = (CheckBox) findViewById(R.id.checkBox_ready);
        ready.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    startActivity(new Intent(BukiSelectActivity.this, CreateGuess.class));
                }
            }
        });
    }
}

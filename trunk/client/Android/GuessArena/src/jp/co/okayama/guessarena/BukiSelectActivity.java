package jp.co.okayama.guessarena;

import android.os.Bundle;
import android.widget.GridView;

public class BukiSelectActivity extends BaseActivity {
    GridView mGridBuki;
    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        
        setContentView(R.layout.activity_buki_select);
        mGridBuki = (GridView) findViewById(R.id.gridView_buki);
        
    }
}

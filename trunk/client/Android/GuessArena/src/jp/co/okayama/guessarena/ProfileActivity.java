package jp.co.okayama.guessarena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class ProfileActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.activity_profile);
        setTitle("My Profile");
        
        findViewById(R.id.button_go_to_buki).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, BukiListActivity.class));
            }
        });
    }
}

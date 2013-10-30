package jp.co.okayama.guessarena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class CreateMatchInviteFriendActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.activity_create_match_invite_friend);
        setTitle("Create Match - Invite Friends");
        findViewById(R.id.skipButton).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CreateMatchInviteFriendActivity.this, BukiSelectActivity.class));
            }
        });
    }
}

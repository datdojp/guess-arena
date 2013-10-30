package jp.co.okayama.guessarena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class GameListActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.activity_game_list);
        setTitle("Game List");
        
        findViewById(R.id.create_match).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GameListActivity.this, CreateMatchOptionsActivity.class));
            }
        });
    }
}

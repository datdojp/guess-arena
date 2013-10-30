package jp.co.okayama.guessarena;

import jp.co.okayama.guessarena.custom.PcSideMenuEnabledLayout;
import jp.co.okayama.guessarena.util.Utils;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;

public class BaseActivity extends FragmentActivity {
    protected PcSideMenuEnabledLayout mRoot;

    @Override
    public void setContentView(int layoutResID) {
        View midView = getLayoutInflater().inflate(layoutResID, null);
        createViews(midView);
    }

    @Override
    public void setContentView(View view) {
        createViews(view);
    }

    private void createViews(View midView) {
        View sideMenuView = getLayoutInflater().inflate(R.layout.side_menu, null);

        sideMenuView.findViewById(R.id.notification).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseActivity.this, NotificationListActivity.class));
            }
        });

        sideMenuView.findViewById(R.id.current_game).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseActivity.this, WaitActivity.class));
            }
        });

        sideMenuView.findViewById(R.id.game_list).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseActivity.this, GameListActivity.class));
            }
        });

        sideMenuView.findViewById(R.id.friend_game_list).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseActivity.this, GameListActivity.class));
            }
        });

        sideMenuView.findViewById(R.id.store).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseActivity.this, StoreActivity.class));
            }
        });

        sideMenuView.findViewById(R.id.buki).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseActivity.this, BukiListActivity.class));
            }
        });

        sideMenuView.findViewById(R.id.profile).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseActivity.this, ProfileActivity.class));
            }
        });

        FrameLayout midViewWrapper = new FrameLayout(this);
        midViewWrapper.addView(midView);
        midViewWrapper.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        mRoot = new PcSideMenuEnabledLayout(this);
        mRoot.init(this, sideMenuView, midViewWrapper, null, Utils.pxFromDp(this, 80), -1, -1, null);
        super.setContentView(mRoot);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        Utils.focusNothing(this);
    }
}

package jp.co.okayama.guessarena;

import android.os.Bundle;

public class NotificationListActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.activity_notification_list);
        setTitle("Notifications");
    }
}

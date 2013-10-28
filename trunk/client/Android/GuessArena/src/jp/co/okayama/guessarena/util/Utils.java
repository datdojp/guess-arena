package jp.co.okayama.guessarena.util;

import android.app.Activity;
import android.view.View;

public class Utils {
    public static View getRootView(Activity activity) {
        return activity.getWindow().getDecorView().findViewById(android.R.id.content);
    }

    public static void focusNothing(Activity activity) {
        focusNothing(getRootView(activity));
    }

    public static void focusNothing(View rootView) {
        rootView.setFocusableInTouchMode(true);
        rootView.requestFocus();
    }
}

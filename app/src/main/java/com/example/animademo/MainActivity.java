package com.example.animademo;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"BuildConfig.IS_APP_DEBUG:"+BuildConfig.IS_APP_DEBUG);
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = getApplication().getPackageManager().getApplicationInfo(getApplication().getPackageName(),
                    PackageManager.GET_META_DATA);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        if (applicationInfo != null) {
           String url = applicationInfo.metaData.getString("API_URL");
           Log.d(TAG,"API_URL:"+url);
        }

    }

}

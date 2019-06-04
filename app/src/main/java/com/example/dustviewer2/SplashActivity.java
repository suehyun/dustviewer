package com.example.dustviewer2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

/**
 * Created by SUEHYUN on 2019-05-08.
 */

public class SplashActivity extends Activity {
    RelativeLayout splash;
    ImageView splash_icon;
    TextView splash_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

         /*gif 삽입*/
        ImageView splashIcon = (ImageView) findViewById(R.id.splash_icon);
        GlideDrawableImageViewTarget mvCon = new GlideDrawableImageViewTarget(splashIcon);
        Glide.with(this).load(R.raw.mv_con_small).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(mvCon);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}

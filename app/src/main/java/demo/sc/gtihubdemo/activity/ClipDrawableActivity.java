package demo.sc.gtihubdemo.activity;

import android.app.ProgressDialog;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import demo.sc.gtihubdemo.R;

public class ClipDrawableActivity extends AppCompatActivity {

    private ClipDrawable drawable;
    private ImageView iv;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip_drawable);

        iv = (ImageView) findViewById(R.id.clip_iv);
        drawable = (ClipDrawable) iv.getBackground();

        updataProgrees();

    }

    Runnable run = new Runnable() {
        @Override
        public void run() {
            if (drawable.getLevel() < 10000 ){
                drawable.setLevel(drawable.getLevel() + 30);
                updataProgrees();
            }
        }
    };

    public void updataProgrees(){
        iv.postDelayed(run, 30);
    }

}

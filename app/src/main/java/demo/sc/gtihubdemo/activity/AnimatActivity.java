package demo.sc.gtihubdemo.activity;

import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import demo.sc.gtihubdemo.R;
import demo.sc.gtihubdemo.utils.Log;
import demo.sc.gtihubdemo.view.LoadingDialog;

public class AnimatActivity extends AppCompatActivity {

    private Dialog show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animat);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.showdialog:
                if (show == null){
                    show = LoadingDialog.show(this, null);
                    Log.d("====","dialog create");
                }
                else show.show();
                break;
            default:
                final View textview = findViewById(R.id.textView);
                final int height = textview.getHeight();
                ValueAnimator animator = ObjectAnimator.ofFloat(0f, 1f).setDuration(1000);
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        float value = (float) animation.getAnimatedValue();
                        textview.getLayoutParams().height = (int) (height - height / 2 * value);
                        textview.setLayoutParams(textview.getLayoutParams());
                        Log.d("===============", value + "");
                    }
                });
                animator.start();
                break;
        }
    }
}

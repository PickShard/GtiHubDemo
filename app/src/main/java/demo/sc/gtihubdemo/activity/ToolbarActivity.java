package demo.sc.gtihubdemo.activity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.app.ListActivity;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

import demo.sc.gtihubdemo.R;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class ToolbarActivity extends AppCompatActivity {

    private ViewGroup container;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        container = (ViewGroup) findViewById(R.id.container);
        text = (TextView) findViewById(R.id.text);
        LayoutTransition transition = container.getLayoutTransition();



        Animator animation =  ObjectAnimator.ofFloat(null, "translationY", -500 ,0);
        Animator animation2 =  ObjectAnimator.ofFloat(null, "translationY", 0 ,-500);

        transition.setAnimator(LayoutTransition.APPEARING,animation);
        transition.setAnimator(LayoutTransition.DISAPPEARING,animation2);

        transition.setStartDelay(LayoutTransition.APPEARING,0);
        transition.setStartDelay(LayoutTransition.CHANGE_DISAPPEARING,0);

        transition.setAnimateParentHierarchy(true);

        LayoutAnimationController layoutAnimation = container.getLayoutAnimation();
    }

    Random random = new Random();
    public void onClick(View view){
        int i = 0;
        if (container.getChildCount()> 0){
             i = random.nextInt(container.getChildCount());
        }


        switch (view.getId()){
            case R.id.add:
                TextView textview = new TextView(this);
                textview.setText("ITEM");
                textview.setBackgroundColor(0xfff);
                textview.setGravity(Gravity.CENTER);
                textview.setPadding(20,20,20,20);
                container.addView(textview,i);
                break;
            case R.id.remove:
                container.removeViewAt(i);
                break;
            case R.id.show:
                text.setVisibility(View.VISIBLE);
                //container.startLayoutAnimation();
                break;
            case R.id.hide:
                //text.setVisibility(View.GONE);
                Class<ListActivity> aClass = ListActivity.class;
                Intent intent = Intent.makeRestartActivityTask(new ComponentName(this, aClass));
                break;
        }
    }
}

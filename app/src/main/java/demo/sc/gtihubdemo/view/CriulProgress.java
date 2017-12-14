package demo.sc.gtihubdemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import static android.R.attr.path;

/**
 * Created by sc on 2017/6/30.
 */

public class CriulProgress extends View {

    private Paint paint;
    private int width;
    private int height;
    private Path path;
    private Canvas mCanvas;

    public CriulProgress(Context context) {
        super(context);
        init(context);
    }

    public CriulProgress(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CriulProgress(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public void init(Context context){
        width = context.getResources().getDisplayMetrics().widthPixels;
        height = context.getResources().getDisplayMetrics().heightPixels;
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(10);
        paint.setAntiAlias(true);//抗锯齿
        path = new Path();
    }

    public int toPercentW(float num){
        return (int)num/width;
    }

    public int toPercentH(float num){
        return (int)num/height;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(final Canvas canvas) {


        path.moveTo(0,400);
        path.quadTo(200, 150, 400, 400);
        path.quadTo(600, 650, 800, 400);
        path.lineTo(800,800);
        path.lineTo(0,800);
        path.close();

        canvas.drawPath(path,paint);
    }

    float x,y;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX();
        y = event.getY();
        return true;
    }

}

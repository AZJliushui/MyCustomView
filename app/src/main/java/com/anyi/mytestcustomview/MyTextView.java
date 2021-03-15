package com.anyi.mytestcustomview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class MyTextView extends View {

    private Paint mPaint;

    public MyTextView(Context context) {
        super(context);

    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 用于绘制
     *
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
        mPaint.setColor(Color.BLUE);
        canvas.drawText("安逸", 100F, 100F, mPaint);
    }

    /**
     * 处理用户交互，触摸事件
     *
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_UP:
                //手指按下
                break;
            case MotionEvent.ACTION_MOVE:
                //手指移动
                break;
            case MotionEvent.ACTION_DOWN:
                //手指抬起
                break;
        }
        return super.onTouchEvent(event);
    }
}

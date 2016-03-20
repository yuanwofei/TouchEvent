package com.yuanwofei.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * Created by fayuan on 2016/3/20.
 */
public class OneFrameLayout extends FrameLayout {

    public final static String TAG = "OneFrameLayout";

    public OneFrameLayout(Context context) {
        super(context);
    }

    public OneFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OneFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN :
                Log.d(TAG, "dispatchTouchEvent ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "dispatchTouchEvent ACTION_MOVE");
                break;

            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "dispatchTouchEvent ACTION_CANCEL");
                break;

            case MotionEvent.ACTION_UP:
                Log.d(TAG, "dispatchTouchEvent ACTION_UP");
                break;

            case MotionEvent.ACTION_OUTSIDE:
                Log.d(TAG, "dispatchTouchEvent ACTION_OUTSIDE");
                break;
            default:
                Log.d(TAG, "dispatchTouchEvent default " + (ev.getAction() & MotionEvent.ACTION_MASK));
                break;
        }

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN :
                Log.d(TAG, "onInterceptTouchEvent ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "onInterceptTouchEvent ACTION_MOVE");
                break;

            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "onInterceptTouchEvent ACTION_CANCEL");
                break;

            case MotionEvent.ACTION_UP:
                Log.d(TAG, "onInterceptTouchEvent ACTION_UP");
                break;

            case MotionEvent.ACTION_OUTSIDE:
                Log.d(TAG, "onInterceptTouchEvent ACTION_OUTSIDE");
                break;
            default:
                Log.d(TAG, "onInterceptTouchEvent default " + (ev.getAction() & MotionEvent.ACTION_MASK));
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN :
                Log.d(TAG, "onTouchEvent ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "onTouchEvent ACTION_MOVE");
                break;

            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "onTouchEvent ACTION_CANCEL");
                break;

            case MotionEvent.ACTION_UP:
                Log.d(TAG, "onTouchEvent ACTION_UP");
                break;

            case MotionEvent.ACTION_OUTSIDE:
                Log.d(TAG, "onTouchEvent ACTION_OUTSIDE");
                break;
            default:
                Log.d(TAG, "onTouchEvent default " + (event.getAction() & MotionEvent.ACTION_MASK));
                break;
        }
        return super.onTouchEvent(event);
    }
}

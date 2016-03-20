package com.yuanwofei.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * Created by fayuan on 2016/3/20.
 */
public class ThreeFrameLayout extends FrameLayout {

    public final static String TAG = "ThreeFrameLayout";

    public ThreeFrameLayout(Context context) {
        this(context, null);
    }

    public ThreeFrameLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThreeFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //click事件在super.OnTouchEvent的UP事件中调用,也就是说如果OnTouchEvent的UP事件中不调用super.OnTouchEvent,
        //click事件将不会调用
        /*setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick");
            }
        });*/


        //如果设置了setOnTouchListener，那么onTouch方法先调用，如果onTouch方法中返回true,那么OnTouchEvent方法将不会调用
        //如果onTouch方法中返回false,那么OnTouchEvent方法也会调用
        /*setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN :
                        Log.d(TAG, "onTouch ACTION_DOWN");
                        break;

                    case MotionEvent.ACTION_MOVE:
                        Log.d(TAG, "onTouch ACTION_MOVE");
                        break;

                    case MotionEvent.ACTION_CANCEL:
                        Log.d(TAG, "onTouch ACTION_CANCEL");
                        break;

                    case MotionEvent.ACTION_UP:
                        Log.d(TAG, "onTouch ACTION_UP");
                        break;

                    case MotionEvent.ACTION_OUTSIDE:
                        Log.d(TAG, "onTouch ACTION_OUTSIDE");
                        break;
                }
                return true;
            }
        });*/

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        //getParent().requestDisallowInterceptTouchEvent(true);
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
    public boolean onInterceptTouchEvent(MotionEvent ev) {//getParent().requestDisallowInterceptTouchEvent(true);
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
                Log.d(TAG, "onTouchEvent ACTION_MOVE");//return false;
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
package com.example.vinoj.trackpadders.module_one;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.*;
import android.widget.Toast;

/**
 * Created by vinoj on 2017-12-02.
 */

public class touch_event extends View {
    private Path path = new Path();

    public touch_event(Context context, AttributeSet atrset) {
        super(context, atrset);
    }

    public boolean onTouch_Event(MotionEvent event) {
        float xAxis = event.getX();
        float yAxis = event.getY();

        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                path.moveTo(xAxis,yAxis);
                return true;
            case MotionEvent.ACTION_MOVE:
                path.moveTo(xAxis,yAxis);
                //Toast toast = Toast.makeText(getApplicationContext(), "Moving", Toast.LENGTH_SHORT);
                //toast.show();// display the toast
                break;
            case MotionEvent.ACTION_UP:
                break;
            default:
                return false;
        }
        return true;
    }
}

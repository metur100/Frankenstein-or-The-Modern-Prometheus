package com.certidevelopment.frankenstein;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.animation.ScaleAnimation;
import android.widget.ScrollView;
import android.widget.TextView;

import java.io.InputStream;

public class Chapter1 extends AppCompatActivity{

    private float mScale = 1f;
    private ScaleGestureDetector mScaleDetector;
    GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView largeText = (TextView) findViewById(R.id.chapter1_textView);

        try {
            Resources res = getResources();
            InputStream in_s = res.openRawResource(R.raw.chapter1_text);
            byte[] b = new byte[in_s.available()];
            in_s.read(b);
            largeText.setText(new String(b));
        }
        catch (Exception e)
        {
            largeText.setText("Error: Please, try again!");
        }

        gestureDetector = new GestureDetector(this, new GestureListenerChapter1());

        mScaleDetector = new ScaleGestureDetector(this, new ScaleGestureDetector.SimpleOnScaleGestureListener(){
            @Override
            public boolean onScale(ScaleGestureDetector detector)
            {
                float scale = 1 - detector.getScaleFactor();

                float prevScale = mScale;
                mScale += scale;

                if (mScale < 0.1f) // Minimum scale condition:
                    mScale = 0.1f;

                if (mScale > 10f) // Maximum scale condition:
                    mScale = 10f;
                ScaleAnimation scaleAnimation = new ScaleAnimation(1f / prevScale, 1f / mScale, 1f / prevScale, 1f / mScale, detector.getFocusX(), detector.getFocusY());
                scaleAnimation.setDuration(0);
                scaleAnimation.setFillAfter(true);
                ScrollView layout =(ScrollView) findViewById(R.id.scrollViewZoom_Chapter1);
                layout.startAnimation(scaleAnimation);
                return true;
            }
        });
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        super.dispatchTouchEvent(event);
        mScaleDetector.onTouchEvent(event);
        gestureDetector.onTouchEvent(event);
        return gestureDetector.onTouchEvent(event);
    }
}

class GestureListenerChapter1 extends GestureDetector.SimpleOnGestureListener {
    @Override
    public boolean onDown(MotionEvent e) {
        return true;
    }
    // event when double tap occurs
    @Override
    public boolean onDoubleTap(MotionEvent e) {
        // double tap fired.
        return true;
    }
}
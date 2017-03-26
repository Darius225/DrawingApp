package com.example.drawing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ViewC canvasView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      canvasView=(ViewC) findViewById(R.id.canvas);
    }
    public void clearCanvas(View v) {
        canvasView.clearCanvas();
    }
}

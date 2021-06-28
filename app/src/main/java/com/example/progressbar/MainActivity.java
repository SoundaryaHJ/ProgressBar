package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.Circle;
import com.github.ybq.android.spinkit.style.CubeGrid;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.github.ybq.android.spinkit.style.FadingCircle;
import com.github.ybq.android.spinkit.style.FoldingCube;
import com.github.ybq.android.spinkit.style.RotatingCircle;
import com.github.ybq.android.spinkit.style.RotatingPlane;
import com.github.ybq.android.spinkit.style.ThreeBounce;
import com.github.ybq.android.spinkit.style.Wave;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ProgressBar progressBar1 = (ProgressBar)findViewById(R.id.spin_kit1);
        Sprite doubleBounce1 = new CubeGrid();
        progressBar1.setIndeterminateDrawable(doubleBounce1);

        ProgressBar progressBar2 = (ProgressBar)findViewById(R.id.spin_kit2);
        Sprite doubleBounce2 = new Wave();
        progressBar2.setIndeterminateDrawable(doubleBounce2);

        ProgressBar progressBar3 = (ProgressBar)findViewById(R.id.spin_kit3);
        Sprite doubleBounce3 = new FadingCircle();
        progressBar3.setIndeterminateDrawable(doubleBounce3);

        ProgressBar progressBar4 = (ProgressBar)findViewById(R.id.spin_kit4);
        Sprite doubleBounce4 = new FoldingCube();
        progressBar4.setIndeterminateDrawable(doubleBounce4);

        ProgressBar progressBar5 = (ProgressBar)findViewById(R.id.spin_kit5);
        Sprite doubleBounce5 = new ThreeBounce();
        progressBar5.setIndeterminateDrawable(doubleBounce5);


    }
}
package com.example.animation;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class TweenAnimationActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        imageView = findViewById(R.id.imageView);
        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_in);
        Animation buttonback = AnimationUtils.loadAnimation(this, R.anim.back2);

        imageView.startAnimation(rotateAnimation);

        Button backButton = findViewById(R.id.btnBack);

        backButton.startAnimation(buttonback);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
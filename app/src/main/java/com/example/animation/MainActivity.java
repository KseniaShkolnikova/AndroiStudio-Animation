package com.example.animation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.animation.R;

public class MainActivity extends AppCompatActivity {
    Button battonFrameAnimation, battonTweenAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        battonFrameAnimation = findViewById(R.id.battnFrameAnimation);
        battonTweenAnimation = findViewById(R.id.battnTweenAnimation);
        Animation button_slide_in = AnimationUtils.loadAnimation(this, R.anim.button_slide_in);
        Animation button_fade_in = AnimationUtils.loadAnimation(this, R.anim.button_fade_in);
        battonFrameAnimation.startAnimation(button_slide_in);
        battonTweenAnimation.startAnimation(button_fade_in);
        battonFrameAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FrameAnimationActivity.class);
                startActivity(intent);
            }
        });
        battonTweenAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TweenAnimationActivity.class);
                startActivity(intent);
            }
        });
    }
}
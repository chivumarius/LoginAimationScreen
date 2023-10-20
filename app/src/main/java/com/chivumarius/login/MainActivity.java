package com.chivumarius.login;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    // ▼ "DECLARATION" OF "WIDGETS IDS" ▼
    Button button;
    TextView textView;
    TextView textView2;



    // ▼ CREATING "OBJECTS" OF "ANIMATION" INSTANCE ▼
    Animation animate_btn;
    Animation animate_texts;





    // ▬ "ON CREATE()" METHOD ▬
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // ▼ "INITIALIZATION" OF "WIDGETS IDS" ▼
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);



        // ▼ "INITIALIZATION" OF "OBJECTS" OF "ANIMATION" INSTANCE ▼
        animate_btn = AnimationUtils.loadAnimation(this, R.anim.animate_btn);
        animate_texts = AnimationUtils.loadAnimation(this, R.anim.animate_texts);


        // ▼ "SETTING" THE "ANIMATION" OF "WIDGETS" ▼
        button.setAnimation(animate_btn);
        textView.setAnimation(animate_texts);
        textView2.setAnimation(animate_texts);
    }
}
package com.example.dell.slacklandingpage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intent for Slack app in google play store
        ImageView img1 = (ImageView)findViewById(R.id.imageView5);
        img1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.Slack&hl=en"));
                startActivity(intent);
            }
        });

        //Intent for Slack app in ios store
        ImageView img2 = (ImageView)findViewById(R.id.imageView6);
        img2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://itunes.apple.com/us/app/slack/id618783545?mt=8"));
                startActivity(intent);
            }
        });
    }
}

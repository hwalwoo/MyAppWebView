package com.example.user.myappwebview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageViewConvertActivity extends Activity implements View.OnClickListener{
    ImageView imageView;
    Button btNextImage,btPrevImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_convert);
        imageView = (ImageView)findViewById(R.id.imageView);
        btNextImage = (Button)(findViewById(R.id.btNextImage));
        btPrevImage=  (Button)(findViewById(R.id.btPrevImage));
        btNextImage.setOnClickListener(this);
        btNextImage.setOnClickListener(this);
        btPrevImage.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btNextImage:
                imageView.setImageResource(R.drawable.flower);
                btPrevImage.setVisibility(View.INVISIBLE);
                btNextImage.setVisibility(View.VISIBLE);
                break;
            case R.id.btPrevImage:
                imageView.setImageResource(R.drawable.penguins);
                btPrevImage.setVisibility(View.VISIBLE);
                btNextImage.setVisibility(View.INVISIBLE);
                break;

        }
    }
}

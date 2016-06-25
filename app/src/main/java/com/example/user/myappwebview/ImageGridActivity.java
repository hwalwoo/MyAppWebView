package com.example.user.myappwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class ImageGridActivity extends AppCompatActivity {
    GridView gridView;
    static final String[] movies = new String[]{
      "mov01","mov02","mov03","mov04","mov05","mov06"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_grid);
        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new MovieAdapter(this, movies));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "테스트값", Toast.LENGTH_SHORT );
            }
        });
    }
}

package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.labo3.utils.AppConstant;

public class newActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent mIntent = getIntent();
        mTextView = findViewById(R.id.tv_texto);

        if(mIntent!=null){
            mTextView.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }


    }






}

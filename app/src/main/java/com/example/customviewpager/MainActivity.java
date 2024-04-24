package com.example.customviewpager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.customviewpagerlibrary.ToastHandler;

public class MainActivity extends AppCompatActivity {

    ToastHandler newToastHandler ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       newToastHandler = new ToastHandler(this);
       newToastHandler.showToast("hello");
    }
}
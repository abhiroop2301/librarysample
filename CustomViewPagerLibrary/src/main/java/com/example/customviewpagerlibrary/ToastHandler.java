package com.example.customviewpagerlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastHandler {

    private final Context context;

    public ToastHandler(Context context){
        this.context = context;
    }

    public void showToast(String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}

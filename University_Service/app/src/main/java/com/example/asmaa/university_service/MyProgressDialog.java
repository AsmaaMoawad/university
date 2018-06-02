package com.example.asmaa.university_service;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyProgressDialog extends AlertDialog {
    @BindView(R.id.progressBarText)
    TextView progressText;
//    private TextView progressText;
    private String text;

    public MyProgressDialog(Context context, String text) {
        super(context);
        this.text = text;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void show() {
        super.show();
        setContentView(R.layout.dialog_background);
        ButterKnife.bind(this);
//        progressText = (TextView) findViewById(R.id.progressBarText);
        progressText.setText(text);
    }

}

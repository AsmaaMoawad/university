package com.example.asmaa.university_service;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class UniversityActivity extends AppCompatActivity implements RetreiveResult{

        @BindView(R.id.University_ID_EditText)     EditText Account_Number ;
        String service_Id ;
        private AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        service_Id = intent.getStringExtra("SERVICE_ID_UNIVERSITY");
        setContentView(R.layout.activity_university);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnUniversity)
    public void Implement(){

        if (!Account_Number.getText().toString().isEmpty()){
            ConnectionApiMomkn connectionApiMomkn = new ConnectionApiMomkn(UniversityActivity.this, UniversityActivity.this, getResources().getString(R.string.loading));
            connectionApiMomkn.getUniversityInquirey("111", "123456", "6", Account_Number.getText().toString(), service_Id);
        }
        else {
            Toast.makeText(this,"من فضلك ادخل رقم الحساب",Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void makeAction() {
        if (DataAllModels.getUniversity_inquiery_dto().getCode().equals("200")){
            Intent intent = new Intent(this,Inquirey_University.class);
            intent.putExtra("SERVICE_ID_UNIVERSITY",service_Id);
            startActivity(intent);
        }
       else {
            Infodialog(DataAllModels.getUniversity_inquiery_dto().getMessage());
        }


    }

    @Override
    public void onFailed(String failurReason) {

    }


    public void Infodialog(String message) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setMessage(message); // Message here

        alert.setPositiveButton(getResources().getString(R.string.done),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        dialog.cancel();
                    }
                });

        alertDialog = alert.create();
        alertDialog.setCancelable(false);
        alertDialog.show();
    }
}

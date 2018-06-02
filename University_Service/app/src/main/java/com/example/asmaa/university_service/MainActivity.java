package com.example.asmaa.university_service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements RetreiveResult {

    @BindView(R.id.list_university)     ListView list_All_Universities;
    ArrayAdapter<String> listAdapterOfUniversityService;
    ArrayList<String>    list_contentOfUniversityService;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        list_contentOfUniversityService = new ArrayList<String>();
        ConnectionApiMomkn connectionApiMomkn =new ConnectionApiMomkn(this,this,getResources().getString(R.string.loading));
        connectionApiMomkn.getALL_UniversityService();

    }

    @Override
    public void makeAction() {
        for (int i = 0; i <DataAllModels.getAll_university_service_dto().getServices().size() ; i++) {
            list_contentOfUniversityService.add(DataAllModels.getAll_university_service_dto().getServices().get(i).getName());

        }
        listAdapterOfUniversityService = new ArrayAdapter<String>(this, R.layout.sub_list_item, R.id.subListItem,list_contentOfUniversityService);
        list_All_Universities.setAdapter(listAdapterOfUniversityService);

        list_All_Universities.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this,UniversityActivity.class);
                intent.putExtra("SERVICE_ID_UNIVERSITY",DataAllModels.getAll_university_service_dto().getServices().get(i).getService_ID());
                startActivity(intent);

            }
        });

    }

    @Override
    public void onFailed(String failurReason) {

    }
}

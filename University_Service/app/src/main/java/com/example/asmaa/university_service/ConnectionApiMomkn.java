package com.example.asmaa.university_service;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.json.JSONException;
import org.json.JSONObject;

import flexjson.JSONSerializer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Asmaa on 5/15/2018.
 */

public class ConnectionApiMomkn {

    RetreiveResult retreiveResult;
    private MyProgressDialog pDialog;

    private String progressText;
    Context mcontext;

    public ConnectionApiMomkn(RetreiveResult requestStatus, Context context, String progressText) {
        this.retreiveResult = requestStatus;
        this.mcontext = context;
        this.progressText = progressText;
    }


    // Get All Service University

    public void getALL_UniversityService() {
        try {

            APiMomkn aPiMomkn = Serverconnection.getApiClien().create(APiMomkn.class);
            Call<Universities_Service_DTO> call = aPiMomkn.getServiceUniversity();
            LoadData();
            call.enqueue(new Callback<Universities_Service_DTO>() {
                @Override
                public void onResponse(Call<Universities_Service_DTO> call, Response<Universities_Service_DTO> response) {
                    response.body();

                    pDialog.dismiss();
                    DataAllModels.setAll_university_service_dto(response.body());
                    retreiveResult.makeAction();


                }

                @Override
                public void onFailure(Call<Universities_Service_DTO> call, Throwable t) {
                    Log.d("as", t.getMessage());;
                    retreiveResult.onFailed("Failed to access");
                    pDialog.dismiss();
                }
            });
        } catch (Exception e) {
            Log.i("error", e.getMessage());
        }

    }


// Inquirey for ALL Bills in University

    public void getUniversityInquirey(String mUsername, String mPassword , String mCenterId , String mAccountNumber ,String mService_id ) {
        try {

            APiMomkn aPiMomkn = Serverconnection.getApiClien().create(APiMomkn.class);
            Call<University_Inquiery_DTO> call = aPiMomkn.getServiceUniversityInquirey(mUsername,mPassword,mCenterId,mAccountNumber,mService_id);
            LoadData();
            call.enqueue(new Callback<University_Inquiery_DTO>() {
                @Override
                public void onResponse(Call<University_Inquiery_DTO> call, Response<University_Inquiery_DTO> response) {



                    if (response.body().getCode().equals("200")){
                        response.body();
                        pDialog.dismiss();
                        DataAllModels.setUniversity_inquiery_dto(response.body());
                        retreiveResult.makeAction();
                    }
                    else {
                        response.body();

                        retreiveResult.onFailed(response.body().getMessage());
                        pDialog.dismiss();
                    }


                }

                @Override
                public void onFailure(Call<University_Inquiery_DTO> call, Throwable t) {
                    retreiveResult.onFailed(t.getMessage());
                    pDialog.dismiss();
                }
            });
        } catch (Exception e) {
            Log.i("error", e.getMessage());
        }

    }








// Get Inquirey University One by One

    public void getUniversityOneByOneInquiry( University_Inquiery_One_By_One_Post university_inquiery_one_by_one_post) {
        try {



//            JSONSerializer serializer = new JSONSerializer();
//            serializer.serialize( university_inquiery_one_by_one_post);
//
//            Gson gson = new Gson();
//            String json = gson.toJson(university_inquiery_one_by_one_post);



               JSONObject jsonObj = new JSONObject();

                jsonObj.put("Usernm",university_inquiery_one_by_one_post.getUsernm() );
                jsonObj.put("Password", university_inquiery_one_by_one_post.getPassword());
                jsonObj.put("CenterID", university_inquiery_one_by_one_post.getCenterID());
                jsonObj.put("Account_number", university_inquiery_one_by_one_post.getAccount_number());
                jsonObj.put("Service_id", university_inquiery_one_by_one_post.getService_id());
                jsonObj.put("billRecId", university_inquiery_one_by_one_post.getBillRecId());
                jsonObj.put("paymentRefInfo",university_inquiery_one_by_one_post.getPaymentRefInfo());
                jsonObj.put("AccountName", university_inquiery_one_by_one_post.getAccountName());
                jsonObj.put("Address", university_inquiery_one_by_one_post.getAddress());
                jsonObj.put("Bill_Number_val", university_inquiery_one_by_one_post.getBill_Number_val());
                jsonObj.put("billingAccount", university_inquiery_one_by_one_post.getBillingAccount());
                jsonObj.put("request_id_inquiry", university_inquiery_one_by_one_post.getRequest_id_inquiry());
                jsonObj.put("sequences", university_inquiery_one_by_one_post.getSequences());

            APiMomkn aPiMomkn = Serverconnection.getApiClien().create(APiMomkn.class);
            Call<University_Inquiery_One_By_One_DTO> call = aPiMomkn.getServiceUniversity_Inquiry_One_By_One(jsonObj);

            LoadData();
            call.enqueue(new Callback<University_Inquiery_One_By_One_DTO>() {
                @Override
                public void onResponse(Call<University_Inquiery_One_By_One_DTO> call, Response<University_Inquiery_One_By_One_DTO> response) {
                    response.body();
                    if (response.body().getCode().equals("200")){
                        pDialog.dismiss();
                        DataAllModels.setUniversity_inquiery_one_by_one_dto(response.body());
                        retreiveResult.makeAction();
                    }
                    else {

                        retreiveResult.onFailed(response.body().getMessage());
                        pDialog.dismiss();
                    }





                }

                @Override
                public void onFailure(Call<University_Inquiery_One_By_One_DTO> call, Throwable t) {
                    Log.d("ttt", t.getMessage());;
                    retreiveResult.onFailed("Failed to access");
                    pDialog.dismiss();
                }
            });
        } catch (Exception e) {
            Log.i("error", e.getMessage());
        }

    }

// Get UniversityPayment

    public void getUniversityPayment( University_Payment_Post university_payment_post) {
        try {
            Gson gson = new Gson();
            String json = gson.toJson(university_payment_post);

            APiMomkn aPiMomkn = Serverconnection.getApiClien().create(APiMomkn.class);
            Call<University_Payment_DTO> call = aPiMomkn.getServiceUniversity_Payment(json);
            LoadData();
            call.enqueue(new Callback<University_Payment_DTO>() {
                @Override
                public void onResponse(Call<University_Payment_DTO> call, Response<University_Payment_DTO> response) {
                    response.body();

                    pDialog.dismiss();
                    DataAllModels.setUniversity_payment_dto(response.body());
                    retreiveResult.makeAction();


                }

                @Override
                public void onFailure(Call<University_Payment_DTO> call, Throwable t) {
                    Log.d("as", t.getMessage());;
                    retreiveResult.onFailed("Failed to access");
                    pDialog.dismiss();
                }
            });
        } catch (Exception e) {
            Log.i("error", e.getMessage());
        }

    }


    public void LoadData() {
        pDialog = new MyProgressDialog(mcontext, progressText);
        pDialog.setCancelable(false);
        pDialog.show();

    }

}

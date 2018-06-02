package com.example.asmaa.university_service;

import android.icu.util.CurrencyAmount;

import org.json.JSONObject;

import flexjson.JSONSerializer;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Asmaa on 5/15/2018.
 */

public interface APiMomkn {


    @GET("api/ReturnServicesuniversity")
    Call<Universities_Service_DTO> getServiceUniversity();



    @GET("api/University_Efinance")
    Call<University_Inquiery_DTO> getServiceUniversityInquirey(  @Query("UserName")           String mUserame
                                                                ,@Query("Password")           String mPassword,
                                                                 @Query("CenterID")           String mCenterId ,
                                                                 @Query("account_number")     String mAcountNumber ,
                                                                 @Query("service_id")         String service);
    @Headers("Content-Type:application/json")
    @POST("api/UniversityInquiry")
    Call<University_Inquiery_One_By_One_DTO> getServiceUniversity_Inquiry_One_By_One(@Body JSONObject json);




    @Headers("Content-Type:application/json")
    @POST("api/UniversityPayment ")
    Call<University_Payment_DTO>getServiceUniversity_Payment(@Body String jsonOfUniversityPayment);


}

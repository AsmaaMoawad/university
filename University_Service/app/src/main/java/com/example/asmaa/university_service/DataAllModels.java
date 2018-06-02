package com.example.asmaa.university_service;

/**
 * Created by Asmaa on 5/15/2018.
 */

public class DataAllModels {

    /////////////////////////////// ADDED NEW STATIC ITEMS FOR University Service ///////////////////////////////////

    public static Universities_Service_DTO all_university_service_dto ;

    public static Universities_Service_DTO getAll_university_service_dto() {
        return all_university_service_dto;
    }

    public static void setAll_university_service_dto(Universities_Service_DTO all_university_service_dto) {
        DataAllModels.all_university_service_dto = all_university_service_dto;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////






////////////////////////////// ADDED NEW STATIC ITEMS FOR University Service Inquiery////////////////////////

    public static University_Inquiery_DTO university_inquiery_dto ;

    public static University_Inquiery_DTO getUniversity_inquiery_dto() {
        return university_inquiery_dto;
    }

    public static void setUniversity_inquiery_dto (University_Inquiery_DTO university_inquiery_dto) {
        DataAllModels.university_inquiery_dto = university_inquiery_dto;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////




    ////////////////////////////// ADDED NEW STATIC ITEMS FOR University Inquirey One By One////////////////////////

    public static University_Inquiery_One_By_One_DTO university_inquiery_one_by_one_dto ;

    public static University_Inquiery_One_By_One_DTO getUniversity_inquiery_one_by_one_dto() {
        return university_inquiery_one_by_one_dto;
    }

    public static void setUniversity_inquiery_one_by_one_dto(University_Inquiery_One_By_One_DTO university_inquiery_one_by_one_dto) {
        DataAllModels.university_inquiery_one_by_one_dto = university_inquiery_one_by_one_dto;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////


    ////////////////////////////// ADDED NEW STATIC ITEMS FOR University Payment/////////////////////////////

    public static University_Payment_DTO university_payment_dto ;

    public static University_Payment_DTO getUniversity_payment_dto() {
        return university_payment_dto;
    }

    public static void setUniversity_payment_dto(University_Payment_DTO university_payment_dto) {
        DataAllModels.university_payment_dto = university_payment_dto;
            }
////////////////////////////// //////////////////////////////////////////////////////////////////////////

}

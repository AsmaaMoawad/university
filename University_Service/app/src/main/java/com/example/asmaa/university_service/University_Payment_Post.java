package com.example.asmaa.university_service;

public class University_Payment_Post {

     String UserName;
     String Password;
     String CenterID;
     String account_number;
     String Amount_val;
     String AccountName ;
     String Due_Date ;
     String Address;
     String Bills_Count;
     String ePay_Bill_Record_ID;
     String Bill_Number_val;
     String Default_Amount ;
     String EFinance_Fees;
     String service_id;
     String request_id_inquiry;
     String paymentRefInfo;
     String billingAccount;

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setCenterID(String centerID) {
        CenterID = centerID;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public void setAmount_val(String amount_val) {
        Amount_val = amount_val;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public void setDue_Date(String due_Date) {
        Due_Date = due_Date;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setBills_Count(String bills_Count) {
        Bills_Count = bills_Count;
    }

    public void setePay_Bill_Record_ID(String ePay_Bill_Record_ID) {
        this.ePay_Bill_Record_ID = ePay_Bill_Record_ID;
    }

    public void setBill_Number_val(String bill_Number_val) {
        Bill_Number_val = bill_Number_val;
    }

    public void setDefault_Amount(String default_Amount) {
        Default_Amount = default_Amount;
    }

    public void setEFinance_Fees(String EFinance_Fees) {
        this.EFinance_Fees = EFinance_Fees;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public void setRequest_id_inquiry(String request_id_inquiry) {
        this.request_id_inquiry = request_id_inquiry;
    }

    public void setPaymentRefInfo(String paymentRefInfo) {
        this.paymentRefInfo = paymentRefInfo;
    }

    public void setBillingAccount(String billingAccount) {
        this.billingAccount = billingAccount;
    }
}

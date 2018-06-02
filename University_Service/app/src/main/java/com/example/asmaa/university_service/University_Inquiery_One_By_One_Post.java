package com.example.asmaa.university_service;

import java.io.Serializable;

public  class University_Inquiery_One_By_One_Post implements Serializable {


     String Usernm;
     String Password;
     String CenterID;
     String Account_number;
     String Service_id;
     String billRecId ;
     String paymentRefInfo ;
     String AccountName;
     String Address;
     String Bill_Number_val;
     String billingAccount;
     String request_id_inquiry ;
     String sequences;


     public String getUsernm() {
          return Usernm;
     }

     public String getPassword() {
          return Password;
     }

     public String getCenterID() {
          return CenterID;
     }

     public String getAccount_number() {
          return Account_number;
     }

     public String getService_id() {
          return Service_id;
     }

     public String getBillRecId() {
          return billRecId;
     }

     public String getPaymentRefInfo() {
          return paymentRefInfo;
     }

     public String getAccountName() {
          return AccountName;
     }

     public String getAddress() {
          return Address;
     }

     public String getBill_Number_val() {
          return Bill_Number_val;
     }

     public String getBillingAccount() {
          return billingAccount;
     }

     public String getRequest_id_inquiry() {
          return request_id_inquiry;
     }

     public String getSequences() {
          return sequences;
     }

     public void setmUsername(String mUsername) {
          this.Usernm = mUsername;
     }

     public void setmPassword(String mPassword) {
          this.Password = mPassword;
     }

     public void setmCenterId(String mCenterId) {
          this.CenterID = mCenterId;
     }

     public void setmAccount_Number(String mAccount_Number) {
          this.Account_number = mAccount_Number;
     }

     public void setmService_id(String mService_id) {
          this.Service_id = mService_id;
     }

     public void setMbillRecId(String mbillRecId) {
          this.billRecId = mbillRecId;
     }

     public void setMpaymentRefInfo(String mpaymentRefInfo) {
          this.paymentRefInfo = mpaymentRefInfo;
     }

     public void setmAccountName(String mAccountName) {
          this.AccountName = mAccountName;
     }

     public void setmAddress(String mAddress) {
          this.Address = mAddress;
     }

     public void setmBill_Number_val(String mBill_Number_val) {
          this.Bill_Number_val = mBill_Number_val;
     }

     public void setMbillingAccount(String mbillingAccount) {
          this.billingAccount = mbillingAccount;
     }

     public void setMrequest_id_inquiry(String mrequest_id_inquiry) {
          this.request_id_inquiry = mrequest_id_inquiry;
     }

     public void setmSequences(String msequences) {
          this.sequences = msequences;
     }

     public University_Inquiery_One_By_One_Post(){

    }
}

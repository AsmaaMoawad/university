package com.example.asmaa.university_service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Asmaa on 5/15/2018.
 */

public class University_Inquiery_DTO {
    @SerializedName("Account_number")
    @Expose
    private String accountNumber;
    @SerializedName("AccountName")
    @Expose
    private String accountName;
    @SerializedName("collageName")
    @Expose
    private String collageName;
    @SerializedName("educationYear")
    @Expose
    private String educationYear;
    @SerializedName("Bill_Number")
    @Expose
    private String billNumber;
    @SerializedName("Bills_Count")
    @Expose
    private String billsCount;
    @SerializedName("EPay_Bill_Record_ID")
    @Expose
    private String ePayBillRecordID;
    @SerializedName("Bill_Number_val")
    @Expose
    private String billNumberVal;
    @SerializedName("Default_Amount")
    @Expose
    private String defaultAmount;
    @SerializedName("EFinance_Fees")
    @Expose
    private String eFinanceFees;
    @SerializedName("Request_id_inquiry")
    @Expose
    private String requestIdInquiry;
    @SerializedName("Ref_Info")
    @Expose
    private String refInfo;
    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Amount")
    @Expose
    private String amount;
    @SerializedName("AddedMoney")
    @Expose
    private String addedMoney;
    @SerializedName("Total_Amount")
    @Expose
    private String totalAmount;
    @SerializedName("Request_id_payment")
    @Expose
    private Object requestIdPayment;
    @SerializedName("Invoice_num")
    @Expose
    private String invoiceNum;
    @SerializedName("UserId")
    @Expose
    private String userId;
    @SerializedName("CenterID")
    @Expose
    private String centerID;
    @SerializedName("totalWithAddedMoney")
    @Expose
    private String totalWithAddedMoney;
    @SerializedName("AddedTime")
    @Expose
    private String addedTime;
    @SerializedName("BalanceNow")
    @Expose
    private String balanceNow;
    @SerializedName("billingAccount")
    @Expose
    private String billingAccount;
    @SerializedName("Invoices")
    @Expose
    private List<Invoice> invoices = null;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public String getEducationYear() {
        return educationYear;
    }

    public void setEducationYear(String educationYear) {
        this.educationYear = educationYear;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getBillsCount() {
        return billsCount;
    }

    public void setBillsCount(String billsCount) {
        this.billsCount = billsCount;
    }

    public String getEPayBillRecordID() {
        return ePayBillRecordID;
    }

    public void setEPayBillRecordID(String ePayBillRecordID) {
        this.ePayBillRecordID = ePayBillRecordID;
    }

    public String getBillNumberVal() {
        return billNumberVal;
    }

    public void setBillNumberVal(String billNumberVal) {
        this.billNumberVal = billNumberVal;
    }

    public String getDefaultAmount() {
        return defaultAmount;
    }

    public void setDefaultAmount(String defaultAmount) {
        this.defaultAmount = defaultAmount;
    }

    public String getEFinanceFees() {
        return eFinanceFees;
    }

    public void setEFinanceFees(String eFinanceFees) {
        this.eFinanceFees = eFinanceFees;
    }

    public String getRequestIdInquiry() {
        return requestIdInquiry;
    }

    public void setRequestIdInquiry(String requestIdInquiry) {
        this.requestIdInquiry = requestIdInquiry;
    }

    public String getRefInfo() {
        return refInfo;
    }

    public void setRefInfo(String refInfo) {
        this.refInfo = refInfo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Object getAddedMoney() {
        return addedMoney;
    }

    public void setAddedMoney(String addedMoney) {
        this.addedMoney = addedMoney;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Object getRequestIdPayment() {
        return requestIdPayment;
    }

    public void setRequestIdPayment(Object requestIdPayment) {
        this.requestIdPayment = requestIdPayment;
    }

    public Object getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCenterID() {
        return centerID;
    }

    public void setCenterID(String centerID) {
        this.centerID = centerID;
    }

    public String getTotalWithAddedMoney() {
        return totalWithAddedMoney;
    }

    public void setTotalWithAddedMoney(String totalWithAddedMoney) {
        this.totalWithAddedMoney = totalWithAddedMoney;
    }

    public String getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(String addedTime) {
        this.addedTime = addedTime;
    }

    public String getBalanceNow() {
        return balanceNow;
    }

    public void setBalanceNow(String balanceNow) {
        this.balanceNow = balanceNow;
    }

    public String getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount(String billingAccount) {
        this.billingAccount = billingAccount;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }



public class Invoice {

    @SerializedName("amount")
    @Expose
    private String amount;
    @SerializedName("currentCode")
    @Expose
    private String currentCode;
    @SerializedName("minAmount")
    @Expose
    private String minAmount;
    @SerializedName("paymentMode")
    @Expose
    private String paymentMode;
    @SerializedName("sequence")
    @Expose
    private String sequence;
    @SerializedName("shortDescAR")
    @Expose
    private String shortDescAR;
    @SerializedName("shortDescEN")
    @Expose
    private String shortDescEN;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrentCode() {
        return currentCode;
    }

    public void setCurrentCode(String currentCode) {
        this.currentCode = currentCode;
    }

    public String getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(String minAmount) {
        this.minAmount = minAmount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getShortDescAR() {
        return shortDescAR;
    }

    public void setShortDescAR(String shortDescAR) {
        this.shortDescAR = shortDescAR;
    }

    public Object getShortDescEN() {
        return shortDescEN;
    }

    public void setShortDescEN(String shortDescEN) {
        this.shortDescEN = shortDescEN;
    }
}


}

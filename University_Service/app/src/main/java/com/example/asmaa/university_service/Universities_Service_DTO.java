package com.example.asmaa.university_service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Asmaa on 5/12/2018.
 */

public class Universities_Service_DTO implements Serializable {





    
    @Expose
    @SerializedName("Services")
    private List<Services> Services;

    public List<Services> getServices() {
        return Services;
    }

    public void setServices(List<Services> services) {
        Services = services;
    }

    public static class Services {
        @Expose
        @SerializedName("Service_ID")
        private String Service_ID;

        public String getService_ID() {
            return Service_ID;
        }

        public void setService_ID(String service_ID) {
            Service_ID = service_ID;
        }

        public String getStatus_message() {
            return Status_message;
        }

        public void setStatus_message(String status_message) {
            Status_message = status_message;
        }

        public String getStatus_code() {
            return Status_code;
        }

        public void setStatus_code(String status_code) {
            Status_code = status_code;
        }

        public String getProvider() {
            return Provider;
        }

        public void setProvider(String provider) {
            Provider = provider;
        }

        public String getDeduct() {
            return Deduct;
        }

        public void setDeduct(String deduct) {
            Deduct = deduct;
        }

        public String getValue_money() {
            return Value_money;
        }

        public void setValue_money(String value_money) {
            Value_money = value_money;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getBalance_now() {
            return Balance_now;
        }

        public void setBalance_now(String balance_now) {
            Balance_now = balance_now;
        }

        public String getInvoice_num() {
            return Invoice_num;
        }

        public void setInvoice_num(String invoice_num) {
            Invoice_num = invoice_num;
        }

        @Expose
        @SerializedName("Status_message")
        private String Status_message;
        @Expose
        @SerializedName("Status_code")
        private String Status_code;
        @Expose
        @SerializedName("Provider")
        private String Provider;
        @Expose
        @SerializedName("Deduct")
        private String Deduct;
        @Expose
        @SerializedName("Value_money")
        private String Value_money;
        @Expose
        @SerializedName("Name")
        private String Name;

        @Expose
        @SerializedName("Balance_nowme")
        private String Balance_now;

        @Expose
        @SerializedName("Invoice_num")
        private String Invoice_num;
    }
}

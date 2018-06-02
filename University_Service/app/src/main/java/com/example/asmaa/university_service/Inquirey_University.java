package com.example.asmaa.university_service;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Inquirey_University extends AppCompatActivity implements RetreiveResult {


    @BindView(R.id.subListItem_of_invoices) ListView list_All_Invoices;
    ArrayAdapter<String> listAdapterOfInvoices;
    ArrayList<String>    list_contentOfInvoice;
    ConnectionApiMomkn connectionApiMomkn ;
    String StatusOfUniversity ,service_Id;
    University_Inquiery_One_By_One_Post university_inquiery_one_by_one_post ;
    University_Payment_Post university_payment_post ;

//    private Printer p = Printer.getInstance();



    private AlertDialog.Builder alert, confirmAlert;
    private AlertDialog alertDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent() ;
        service_Id = intent.getStringExtra("SERVICE_ID_UNIVERSITY");

        setContentView(R.layout.activity_inquirey__university);
        ButterKnife.bind(this);
        list_contentOfInvoice= new ArrayList<String>();


        for (int i = 0; i <DataAllModels.getUniversity_inquiery_dto().getInvoices().size() ; i++) {

            list_contentOfInvoice.add(DataAllModels.getUniversity_inquiery_dto().getInvoices().get(i).getShortDescAR()+ "المبلغ : " + DataAllModels.getUniversity_inquiery_dto().getInvoices().get(i).getAmount());
            listAdapterOfInvoices = new ArrayAdapter<String>(this, R.layout.sub_list_item, R.id.subListItem,list_contentOfInvoice);
            list_All_Invoices.setAdapter(listAdapterOfInvoices);

        }
        list_All_Invoices.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {







                university_inquiery_one_by_one_post=new University_Inquiery_One_By_One_Post();
                university_inquiery_one_by_one_post.setmUsername("111");
                university_inquiery_one_by_one_post.setmPassword("123456");
                university_inquiery_one_by_one_post.setmCenterId("6");
                university_inquiery_one_by_one_post.setmService_id(service_Id);
                university_inquiery_one_by_one_post.setmAccount_Number(DataAllModels.getUniversity_inquiery_dto().getAccountNumber());
                university_inquiery_one_by_one_post.setmAccountName(DataAllModels.getUniversity_inquiery_dto().getAccountName());
                university_inquiery_one_by_one_post.setMpaymentRefInfo(DataAllModels.getUniversity_inquiery_dto().getRefInfo());
                university_inquiery_one_by_one_post.setmBill_Number_val(DataAllModels.getUniversity_inquiery_dto().getBillNumberVal());
                university_inquiery_one_by_one_post.setmSequences(DataAllModels.getUniversity_inquiery_dto().getInvoices().get(i).getSequence());
                university_inquiery_one_by_one_post.setmAddress(" ");
                university_inquiery_one_by_one_post.setMbillingAccount(DataAllModels.getUniversity_inquiery_dto().getBillingAccount());
                university_inquiery_one_by_one_post.setMrequest_id_inquiry(DataAllModels.getUniversity_inquiery_dto().getRequestIdInquiry());
                university_inquiery_one_by_one_post.setMbillRecId(DataAllModels.getUniversity_inquiery_dto().getEPayBillRecordID());

                connectionApiMomkn = new ConnectionApiMomkn(Inquirey_University.this,Inquirey_University.this,getResources().getString(R.string.loading));
                connectionApiMomkn.getUniversityOneByOneInquiry(university_inquiery_one_by_one_post);
                StatusOfUniversity="Inquirey";

            }
        });



    }

    @Override
    public void makeAction() {
        if (DataAllModels.getUniversity_inquiery_one_by_one_dto().getCode().equals("200")&&StatusOfUniversity.equals("Inquirey")) {





            alert = new AlertDialog.Builder(Inquirey_University.this);
            String message;
            message = getResources().getString(R.string.customerName) + " : " + DataAllModels.getUniversity_inquiery_one_by_one_dto().getAccountName()
                    + "\n" + getResources().getString(R.string.billAmount) + " : " + DataAllModels.getUniversity_inquiery_one_by_one_dto().getAmount()
                    + "\n" + getResources().getString(R.string.fees) + " : " + DataAllModels.getUniversity_inquiery_one_by_one_dto().getAddedMoney()
                    + "\n" + getResources().getString(R.string.totalAmount) + " : " + DataAllModels.getUniversity_inquiery_one_by_one_dto().getTotalWithAddedMoney();
            alert.setPositiveButton(getResources().getString(R.string.pay),
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,
                                            int whichButton) {

                            confirmAlert = new AlertDialog.Builder(Inquirey_University.this);
                            confirmAlert.setPositiveButton(getResources().getString(R.string.pay),
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog,
                                                            int whichButton) {


                                            university_payment_post=new University_Payment_Post();
                                            university_payment_post.setUserName("111");
                                            university_payment_post.setPassword("123456");
                                            university_payment_post.setCenterID("6");
                                            university_payment_post.setAccount_number(DataAllModels.getUniversity_inquiery_one_by_one_dto().getAccountNumber());
                                            university_payment_post.setAccountName(DataAllModels.getUniversity_inquiery_one_by_one_dto().getAccountName());
                                            university_payment_post.setAmount_val(DataAllModels.getUniversity_inquiery_one_by_one_dto().getAmount());
                                            university_payment_post.setBills_Count(DataAllModels.getUniversity_inquiery_one_by_one_dto().getBillsCount());
                                            university_payment_post.setAmount_val(DataAllModels.getUniversity_inquiery_one_by_one_dto().getAmount());
                                            university_payment_post.setEFinance_Fees(DataAllModels.getUniversity_inquiery_one_by_one_dto().getEFinanceFees());
                                            university_payment_post.setService_id(service_Id);
                                            university_payment_post.setRequest_id_inquiry(DataAllModels.getUniversity_inquiery_one_by_one_dto().getRequestIdInquiry());
                                            university_payment_post.setBillingAccount(DataAllModels.getUniversity_inquiery_one_by_one_dto().getBillingAccount());
                                            university_payment_post.setBill_Number_val(DataAllModels.getUniversity_inquiery_one_by_one_dto().getBillNumberVal());
                                            university_payment_post.setePay_Bill_Record_ID(DataAllModels.getUniversity_inquiery_one_by_one_dto().getEPayBillRecordID());
                                            university_payment_post.setAddress("");
                                            university_payment_post.setDue_Date("  ");
                                            university_payment_post.setDefault_Amount(DataAllModels.getUniversity_inquiery_one_by_one_dto().getDefaultAmount());


                                            connectionApiMomkn=new ConnectionApiMomkn(Inquirey_University.this,Inquirey_University.this,getResources().getString(R.string.loading));
                                            connectionApiMomkn.getUniversityPayment(university_payment_post);

                                            StatusOfUniversity="PayInvoiceOfUniversity";


                                        }
                                    });
                            confirmAlert.setNegativeButton(getResources().getString(R.string.cancel),
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog,
                                                            int which) {
                                            // TODO Auto-generated method stub
                                            dialog.cancel();
                                        }
                                    });
                            confirmAlert.setTitle(getResources().getString(R.string.inquiryResult));
                            confirmAlert.setMessage(getResources().getString(R.string.doYouWantContinueInPaymentProcess));
                            confirmAlert.create().show();


                        }
                    });

            alert.setTitle(getResources().getString(R.string.inquiryResult));
            alert.setMessage(message); // Message here

            alert.setNegativeButton(getResources().getString(R.string.cancel),
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog,
                                            int which) {
                            // TODO Auto-generated method stub
                            dialog.cancel();
                        }
                    });
            alert.create().show();


        }
        else  if (DataAllModels.getUniversity_payment_dto().getCode().equals("200")&& StatusOfUniversity.equals("PayInvoiceOfUniversity")){

             String result = DataAllModels.getUniversity_payment_dto().getMessage() + "\n" + getResources().getString(R.string.trx_ID) + " : " + DataAllModels.getUniversity_payment_dto().getInvoiceNum();
             Infodialog(result);
//             printUniversityBill();




        }



        else {




            Infodialog(DataAllModels.getUniversity_inquiery_dto().getMessage());

        }

    }

    @Override
    public void onFailed(String failurReason) {
        alert = new AlertDialog.Builder(Inquirey_University.this);
        alert.setTitle(getResources().getString(R.string.inquiryResult));
        alert.setMessage(failurReason); // Message here
        alert.create().show();



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





//    private String printUniversityBill() {
//        switch (p.getPaperStatus()) // check paper status
//        {
//            case Printer.PRINTER_EXIST_PAPER:
//                if (p.voltageCheck()) // check voltage, if it is allowed to print
//                {
//                    p.printBitmap(getResources().openRawResource(R.raw.momkn));
////				p.printText("   "+"شركة "+getResources().getString(R.string.app_name),2, true);
//                    p.printText(" " + header, 2, true);
//                    p.printText(getResources().getString(R.string.customerName) + "   " + customerName, true);
//                    p.printText(getResources().getString(R.string.phoneNumber) + "   " + DataAllModels.getOrangeReseller_bill_dto().getMobile(), true);
//                    p.printText(getResources().getString(R.string.amount) + "   " + DataAllModels.getOrangeReseller_bill_dto().getAmount(), true);
//                    p.printText(getResources().getString(R.string.fees) + "   " + DataAllModels.getOrangeReseller_bill_dto().getAddedMoney(), true);
//                    p.printText(getResources().getString(R.string.totalAmount) + "   " + DataAllModels.getOrangeReseller_bill_dto().getTotal_Amount(), true);
//                    p.printText("- - - - - - - - - - - - - - - -", 1, true);
//                    p.printText(getResources().getString(R.string.date) + "   " + DataAllModels.getOrangeReseller_bill_dto().getAddedTime().substring(0, DataAllModels.getOrangeReseller_bill_dto().getAddedTime().indexOf(" ")), 1, true);
//                    p.printText(getResources().getString(R.string.time) + "   " + DataAllModels.getOrangeReseller_bill_dto().getAddedTime().substring(DataAllModels.getOrangeReseller_bill_dto().getAddedTime().indexOf(" ")), 1, true);
//                    p.printText(getResources().getString(R.string.trx_ID) + "   " + orangeResellerBill_DTO.getInvoice_num(), 1, true);
//                    p.printText(getResources().getString(R.string.centerCode) + "   " + centerID, 1, true);
//                    p.printText(getResources().getString(R.string.centerName) + "   " + centerName, 1, true);
//                    p.printText(getResources().getString(R.string.customerService), 1, true);
//                    p.printText("         01222228826");
//                    p.printText("       www.Momkn.com.eg");
//                    p.printEndLine();
//
//                } else {
//                    return "Low baterry";
//                }
//                break;
//            case Printer.PRINTER_NO_PAPER:
//                return "No paper";
//
//            case Printer.PRINTER_PAPER_ERROR:
//                return "Printing error";
//        }
//        return "successNotification";
//
//    }


}
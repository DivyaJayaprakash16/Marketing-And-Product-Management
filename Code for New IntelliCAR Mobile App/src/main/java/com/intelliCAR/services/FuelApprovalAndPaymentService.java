package com.intelliCAR.services;

import org.springframework.stereotype.Service;

/**
 * Created by divya jayaprakash
 */
@Service
public class FuelApprovalAndPaymentService {

    public String approveFuel(String carProcessorId, Long phoneNum){
        String carNum = getRegisteredCarNumber(carProcessorId);
        String vendor  = "valero #3q4234";
        boolean paymentApproved =makePayment(carProcessorId, vendor);
        if(!paymentApproved){

       System.out.println(" Fuel allowd for carNum : " +carNum);
        }
        return "complete";
    }

    private
    String getRegisteredCarNumber(String carProcessorId) {
        return "TX 2345";
    }


    private
    boolean makePayment(String carProcessorId, String vendor) {
        return true;
    }

}

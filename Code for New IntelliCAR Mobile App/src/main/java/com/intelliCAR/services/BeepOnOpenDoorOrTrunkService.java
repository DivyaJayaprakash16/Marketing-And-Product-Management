package com.intelliCAR.services;

import org.springframework.stereotype.Service;

/**
 * Created by divya jayaprakash
 */
@Service
public class BeepOnOpenDoorOrTrunkService {

    public String beepPhone(String carProcessorId, Long phoneNum){
        boolean engineStatus = getCurrentDoorStatus(carProcessorId);
        if(!engineStatus){
            System.out.println("door open for five minutes");

        }
        return "BEEP";
    }

    private boolean getCurrentDoorStatus(String carProcessorId) {
        return false;
    }


}

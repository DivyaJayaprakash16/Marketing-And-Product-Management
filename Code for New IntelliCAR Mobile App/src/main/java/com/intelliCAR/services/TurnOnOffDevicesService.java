package com.intelliCAR.services;

import org.springframework.stereotype.Service;

/**
 * Created by divya jayaprakash
 */
@Service
public class TurnOnOffDevicesService {
    public String turnONOFF(String carProcessorId, Long phoneNum){
        String desiredDevice = "Lights";
        boolean desiredstatus =  true;

        boolean currentStatus   =  getCurrentDeviceStatus(carProcessorId);
        if(!currentStatus==desiredstatus){
            System.out.println("Toggle Device");

        }
        return "complete";
    }

    private boolean getCurrentDeviceStatus(String carProcessorId) {
        return false;
    }

}

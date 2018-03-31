package com.intelliCAR.services;

import org.springframework.stereotype.Service;

/**
 * Created by divya jayaprakash
 */
@Service
public class ParkingLocationShareService {
    public String getParkedLocation(String carProcessorId, Long phoneNum){
        String location = getCurrentParkedLocation(carProcessorId);
        boolean parked = true;
        if(!parked){
            System.out.println("Sending google notification " + location);

        }
        return "complete";
    }

    private String getCurrentParkedLocation(String carProcessorId) {
        return "Google locatin id #232, zip 75252 ";
    }


}

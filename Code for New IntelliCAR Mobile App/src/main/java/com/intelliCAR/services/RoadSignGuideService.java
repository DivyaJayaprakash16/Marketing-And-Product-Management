package com.intelliCAR.services;

import org.springframework.stereotype.Service;

/**
 * Created by divya jayaprakash
 */
@Service
public class RoadSignGuideService {
    public String trackRoadSign(String carProcessorId, Long phoneNum){

         boolean isdestinationReached = isDestinationReached(carProcessorId);

        while(!isdestinationReached){

            String currentLocation = getCurrentLocation(carProcessorId);
            System.out.println(" ROad sign processed in currentLocation for 500 mt distance");
            isdestinationReached = true;
        }
        return "complete";
    }

    private boolean isDestinationReached(String carProcessorId) {
        return false;
    }

    private String getCurrentLocation(String carProcessorId) {
        return "Google locatin id #232, zip 75252 ";
    }


}

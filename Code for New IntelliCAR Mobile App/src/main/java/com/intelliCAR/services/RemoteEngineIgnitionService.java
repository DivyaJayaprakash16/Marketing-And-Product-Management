package com.intelliCAR.services;

import org.springframework.stereotype.Service;

/**
 * Created by divya jayaprakash.
 */
@Service
public class RemoteEngineIgnitionService {
    public String igniteEngine(String carProcessorId, Long phoneNum){
        boolean engineStatus = getCurrentEngineStatus(carProcessorId);
        if(!engineStatus){
            System.out.println("Sending engine ignition signal");

        }
        return "complete";
    }

    private boolean getCurrentEngineStatus(String carProcessorId) {
        return false;
    }
}

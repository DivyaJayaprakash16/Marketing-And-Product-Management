package com.intelliCAR.controller;

import com.intelliCAR.services.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/intelliCAR")
public class intelliCARController {

    @RequestMapping("/igniteEngine")
    public ResponseEntity<String> igniteEngine() {
        Long phnum = Long.valueOf(1233455556);
        RemoteEngineIgnitionService remoteEngineIgnitionService = new RemoteEngineIgnitionService();
        remoteEngineIgnitionService.igniteEngine("100.100.100.100", phnum);
         return new ResponseEntity<>("Complete -  engine ignition successful", HttpStatus.OK);
    }
    @RequestMapping("/approveFuel")
    public ResponseEntity<String> approveFuel() {
        Long phnum = Long.valueOf(1233455556);
        FuelApprovalAndPaymentService fuelApprovalAndPaymentService = new FuelApprovalAndPaymentService();
        fuelApprovalAndPaymentService.approveFuel("100.100.100.100", phnum);
        return new ResponseEntity<>("Complete - fUEL APPROVED 2 LITRES AT VALERO station #123677  - payment approved citi bank", HttpStatus.OK);
    }
    @RequestMapping("/getParkedLocation")
    public ResponseEntity<String> getParkedLocation() {
        Long phnum = Long.valueOf(1233455556);
        ParkingLocationShareService parkingLocationShareService = new ParkingLocationShareService();
        parkingLocationShareService.getParkedLocation("100.100.100.100", phnum);
        return new ResponseEntity<>("Complete - parked loCATION IS YOUR google map notification # zip 75252 ", HttpStatus.OK);
    }
    @RequestMapping("/trackRoadSign")
    public ResponseEntity<String> trackRoadSign() {
        Long phnum = Long.valueOf(1233455556);
        RoadSignGuideService roadSignGuideService = new RoadSignGuideService();
        roadSignGuideService.trackRoadSign("100.100.100.100", phnum);
        return new ResponseEntity<>("Complete: Take EXIT 45 and bear right!!!!!!", HttpStatus.OK);
    }

    @RequestMapping("/beepPhone")
    public ResponseEntity<String> beepPhone() {
        Long phnum = Long.valueOf(1233455556);
        BeepOnOpenDoorOrTrunkService beepOnOpenDoorOrTrunkService = new BeepOnOpenDoorOrTrunkService();
        beepOnOpenDoorOrTrunkService.beepPhone("100.100.100.100", phnum);
        return new ResponseEntity<>("Complete - YOUR door is open for more than 5 mins", HttpStatus.OK);
    }

    @RequestMapping("/turnONOFF")
    public ResponseEntity<String> turnONOFF() {
        Long phnum = Long.valueOf(1233455556);
        TurnOnOffDevicesService turnOnOffDevicesService = new TurnOnOffDevicesService();
        turnOnOffDevicesService.turnONOFF("100.100.100.100", phnum);
        return new ResponseEntity<>("Complete - Car Light is  is turned ON ", HttpStatus.OK);
    }
}

package com.intelliCAR.dto;

import lombok.Data;

/**
 * Created by divya jayaprakash.
 */
@Data
public class BankingDetails {

    private Long bankAccNumber;
    private String nameOnAcc;
    private Long routingNum;
    private String bankName;
    private Boolean userOrVendorType;
}

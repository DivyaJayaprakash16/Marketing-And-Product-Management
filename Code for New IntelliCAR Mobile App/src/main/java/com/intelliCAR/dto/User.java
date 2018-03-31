package com.intelliCAR.dto;

import lombok.Data;

/**
 * Created by divya jayaprakash.
 */
@Data
public class User {

    private String loginEmailId;
    private String loginPWD;
    private String firstName;
    private String lastName;
    private Long phoneNum;
    private BankingDetails bankDetails;
    private Boolean userOrVendorType;
}

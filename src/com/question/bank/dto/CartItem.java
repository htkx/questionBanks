package com.question.bank.dto;

import java.io.Serializable;

/**
 * @author hughijin
 */
public class CartItem implements Serializable{

    private static final long serialVersionUID = 5264162908653901014L;

    private String partNumber;

    private String availabilityCheckCode;

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getAvailabilityCheckCode() {
        return availabilityCheckCode;
    }

    public void setAvailabilityCheckCode(String availabilityCheckCode) {
        this.availabilityCheckCode = availabilityCheckCode;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "partNumber='" + partNumber + '\'' +
                ", availabilityCheckCode='" + availabilityCheckCode + '\'' +
                '}';
    }
}

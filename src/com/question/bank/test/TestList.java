package com.question.bank.test;

import com.question.bank.dto.CartItem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hughjin
 */
public class TestList {

    public static void main(String[] args) {
        List<CartItem> list = new ArrayList<CartItem>();
        CartItem cartItem = new CartItem();
        cartItem.setPartNumber("1");
        cartItem.setAvailabilityCheckCode("1");
        list.add(cartItem);
        CartItem cartItem2 = new CartItem();
        cartItem2.setPartNumber("2");
        cartItem2.setAvailabilityCheckCode("1");
        list.add(cartItem2);
        List<CartItem> res = new ArrayList<CartItem>();
        for (CartItem item : list) {
            if(item.getPartNumber().equals("1")){
                res.add(item);
            }
        }
        for (CartItem re : res) {
            re.setAvailabilityCheckCode("1111111111111111");
        }
        for (CartItem item : list) {
            System.out.println(item.getAvailabilityCheckCode());
            /* 结果：
                1111111111111111
                1
             */
        }
    }
}

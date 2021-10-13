/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.escuelaing.arep.ec2aws;
import java.lang.Math;
/**
 *
 * @author ADMIN
 */
public class Services {
     public Double asin(Double value){
        String operation = "asin";
        Double result = Math.asin(value);
        return result;
    }
     public Double acos(Double value){
        String operation = "asin";
        Double result = Math.acos(value);
        return result;
        //return "{\"operation\":" +operation + ", \"input\":" + value + ", \"output\":" + result +"}";
    }
}

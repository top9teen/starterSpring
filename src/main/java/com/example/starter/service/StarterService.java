package com.example.starter.service;

import java.util.StringJoiner;

import org.springframework.stereotype.Service;

@Service
public class StarterService {
    
    private int maxFor = 12;

    public String forNumber(int inputNumber ){
        StringJoiner reNumber = new StringJoiner("\n "); 
        for( int i=1; i<= this.maxFor; i++ ) {
            reNumber.add( inputNumber+" x "+i+" = "+( inputNumber * i ) );
  
        }

        return reNumber.toString();
    }



    public String ifNumber(int inputNumber ){
        if(inputNumber > 80) {
            return "4";
        } else if(inputNumber > 70){
            return "3";
        } else if(inputNumber > 60){
            return "2";
        } else if(inputNumber > 50){
            return "1";
        } else {
            return "0";
        }
    }


    public String mainMethod(int inputNumber ){
        return subMethod(inputNumber);
    }


    private String subMethod(int inputNumber ){
        int tmp = this.maxFor;
        this.maxFor = inputNumber;

        return "number is " + tmp + " to " +  this.maxFor;
    }
}

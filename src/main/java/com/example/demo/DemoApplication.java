package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

//@SpringBootApplication
public class DemoApplication {


    public static void main(String[] args) {
        int[] array = {6, 4, 5, 3, 2, 1};
        for (int i = 0,size=array.length; i <size-1 ; i++) {
            for (int j = 0; j < size-1-i; j++) {
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
print(Arrays.toString(array));
    }

    public static void print(String s) {
        System.out.println("s = " + s);
    }
}

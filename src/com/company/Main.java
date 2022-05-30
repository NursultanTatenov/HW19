package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        try(Car car=new Car()){
            car.drive();

        } catch (RuntimeException e) {
            e.printStackTrace();

        }
        catch (Error ignored){

        }
//        System.out.println("hello nurs");

    }
}
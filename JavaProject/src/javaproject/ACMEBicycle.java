/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author johnson
 */
public class ACMEBicycle implements BicycleInterface {

    int cadence = 0;
    int speed = 0;
    int gear = 1;
    
    
 
    public void changeCadence(int newValue) {
        cadence= newValue;
    }

    public void changeGear(int newValue) {
        speed = newValue; 
    }

   
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    
    void printStates()
    {
        System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
    
}

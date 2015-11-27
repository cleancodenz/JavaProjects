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
public class Bicycle {
    
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    
    // the Bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    
    void changeCadence(int newValue)
    {
        cadence = newValue;
                
    }
    
    void changeGear(int newValue)
    {
        gear = newValue;
    }
    
    void speedUp(int increment)
    {
        speed = speed + increment;
    }
    
    void applyBrakes(int decrement)
    {
        speed = speed - decrement;
    }
    
    void printStates()
    {
        System.out.println("cadence:"+
                cadence + " speed:"+
                speed + " gear:"+gear);
    }
}

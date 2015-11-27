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
public class MountainBike extends Bicycle {
    
    public int seatHeight;
    
    public MountainBike(int startHeight, int startCadence,
            int startSpeed, int startGear)
    {
        super(startCadence,startSpeed, startGear);
        seatHeight = startHeight;
        
    }
    
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
    
    // make sure there is same method in super to be overriden
    // if not writing it, you could accidently override base class methods
    @Override
    void printStates()
    {
        System.out.println("cadence:"+
                cadence + " speed:"+
                speed + " gear:"+gear +
                "seat height:" + seatHeight);
    }
    
}

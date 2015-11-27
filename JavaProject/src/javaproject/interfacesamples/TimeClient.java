/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.interfacesamples;

import java.util.Date;

/**
 *
 * @author johnson
 */
public interface TimeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second);
   Date getLocalDateTime();
    /** not supported in 1.7
    static int getZoneId (String zoneString) {
          return 1;
        
    }**/
   
   /** default interface not supported in 1.7 supposedly to add methods to interfaces without breaking current implementations
        
    default Date getZonedDateTime(String zoneString) {
        return Date();
     }**/
}

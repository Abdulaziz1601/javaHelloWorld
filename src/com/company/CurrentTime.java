package com.company;

public class CurrentTime {
    public  static String getUTCTime()
    {
        long ticks = System.currentTimeMillis();
int hours =  (int) (ticks / 1000 / 60 / 60) % 24;
int minutes =  (int) (ticks / 1000 / 60) % 60;
return  hours + ":"  + minutes;
    }

}

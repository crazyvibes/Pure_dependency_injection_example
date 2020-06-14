package in.crazyvibes.pure_dependency_injection_example;

import android.util.Log;

public class SmartPhone {

    public Battery battery;
    private MemoryCard memoryCard;
    private SIMCard simCard;
    private static final String TAG = "SmartPhone";

    public SmartPhone(Battery battery, MemoryCard memoryCard, SIMCard simCard) {
        this.battery = battery;
        this.memoryCard = memoryCard;
        this.simCard = simCard;
    }

    public void makeACall(){
        Log.d(TAG, " making a call......... ");
    }

    public void setBattery(Battery battery)
    {
        this.battery=battery;
    }
}

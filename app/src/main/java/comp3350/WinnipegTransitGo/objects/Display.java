package comp3350.WinnipegTransitGo.objects;

import java.util.ArrayList;
import java.util.List;

import comp3350.WinnipegTransitGo.apiService.TransitAPI;
import comp3350.WinnipegTransitGo.apiService.TransitAPIProvider;

/**
 * Created by nibras on 2017-05-24.
 */

public class Display
{
    private int busNumber;
    private String busStopName;
    private int busStopNumber;
    private String destination;
    private String remainingTime;
    private String busStatus;
    String lat="49.8049250";
    String longitude="-97.1569080";
    List<String> times;

    private String apiKey="NB08BPIRd1oFuwRil4";

    public Display(int busNumber,int busStopNumber, String busStopName, String destination, String timing, String status, List<String> allTimes)
    {
        this.busNumber=busNumber;
        this.busStopNumber=busStopNumber;
        this.busStopName=busStopName;
        this.destination=destination;
        remainingTime = timing;
        busStatus = status;
        times = allTimes;
    }

    public String getBusStopName()
    {
        return busStopName;
    }
    public int getBusNumber()
    {
        return busStopNumber;
    }
    public String getBusStopDestination()
    {
        return destination;
    }
    public String getBusTimeRemaining() { return remainingTime;}
    public String getBusStatus()
    {
        return busStatus;
    }
    public List<String> getTimes()
    {
        return times;
    }
}
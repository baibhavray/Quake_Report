package com.example.quakereport;

public class Earthquake {
    private Double mMagnitide;
    private String mLocatoin;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(Double magnitude, String location, long timeInMilliseconds, String url){
        mMagnitide=magnitude;
        mLocatoin=location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public Double getMagnitide(){return mMagnitide;}
    public String getLocatoin(){return mLocatoin;}
    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }
    public String getUrl() { return mUrl; }
}

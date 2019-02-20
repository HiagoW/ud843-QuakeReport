package com.example.android.quakereport;

/**
 * An {@link Earthquake} object contains information related to a single earthquake.
 */
public class Earthquake {

    /** Magnitude of the earthquake*/
    private double mMag;

    /** Location of the earthquake */
    private String mLocation;

    /** Date of the earthquake */
    private long mTimeInMilliseconds;

    /** url to details */
    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param mag is the magnitude of the earthquake
     * @param loc is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     * @param url is the url to see details of the earthquake
     *    *  earthquake happened
     */
    public Earthquake(double mag, String loc, long timeInMilliseconds, String url){
        mMag = mag;
        mLocation = loc;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     *
     * @return the magnitude of the earthquake
     */
    double getmMag(){
        return mMag;
    }

    /**
     *
     * @return the location of the earthquake
     */
    String getmLocation(){
        return mLocation;
    }

    /**
     *
     * @return the date of the earthquake formatted
     */
    long getmTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }

    /**
     *
     * @return the url with the details of the earthquake
     */

    String getmUrl(){ return mUrl; }
}

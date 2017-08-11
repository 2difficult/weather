package com.weather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by GYJ on 2017/8/11.
 */

public class County extends DataSupport{

    int countyid;
    String countyname;
    String weatherid;
    int cityid;

    public int getCountyid() {
        return countyid;
    }

    public void setCountyid(int countyid) {
        this.countyid = countyid;
    }

    public String getCountyname() {
        return countyname;
    }

    public void setCountyname(String countyname) {
        this.countyname = countyname;
    }

    public String getWeatherid() {
        return weatherid;
    }

    public void setWeatherid(String weatherid) {
        this.weatherid = weatherid;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }
}

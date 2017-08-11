package com.weather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by GYJ on 2017/8/11.
 */

public class City extends DataSupport{
    int cityid;
    String cityname;
    int citycode;
    int provinceid;

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public int getCitycode() {
        return citycode;
    }

    public void setCitycode(int citycode) {
        this.citycode = citycode;
    }

    public int getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(int provinceid) {
        this.provinceid = provinceid;
    }
}

package com.weather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by GYJ on 2017/8/11.
 */

public class Province extends DataSupport{
    int provinceid;
    String provincename;
    int provincecode;

    public int getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(int provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public int getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(int provincecode) {
        this.provincecode = provincecode;
    }
}

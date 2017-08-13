package com.weather.android.util;

import android.text.TextUtils;

import com.weather.android.db.City;
import com.weather.android.db.County;
import com.weather.android.db.Province;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by GYJ on 2017/8/11.
 * 解析和处理服务器返回的json数据
 */

public class Utility {
/**
 * 解析和处理服务器返回的省级数据
 */

public static boolean handleProvinceResponse(String response)
{
    if (!TextUtils.isEmpty(response))
    {
        try {
            JSONArray allProvinces = new JSONArray(response);
            for (int i = 0;i < allProvinces.length();i++)
            {
                JSONObject provinceObject = allProvinces.getJSONObject(i);
                Province province = new Province();
                province.setProvincename(provinceObject.getString("name"));
                province.setProvincecode(provinceObject.getInt("id"));
                province.save();
            }
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    return false;
}

/**
 * 解析和处理服务器返回的市级数据
 */
public static boolean handleCityResponse(String response,int provinceId)
{
    if (!TextUtils.isEmpty(response))
    {
        try {
            JSONArray allcities = new JSONArray(response);
            for (int i=0; i < allcities.length(); i++)
            {
                JSONObject cityObject = allcities.getJSONObject(i);
                City city = new City();
                city.setCityname(cityObject.getString("name"));
                city.setCitycode(cityObject.getInt("id"));
                city.setProvinceid(provinceId);
                city.save();
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    return false;
}

/**
 * 解析和处理服务器返回的县级数据
 */
public static boolean handleCountyResponse(String response, int cityId)
{
    if (!TextUtils.isEmpty(response))
    {
        try {
            JSONArray allcounties = new JSONArray(response);
            for (int i=0; i<allcounties.length(); i++)
            {
                JSONObject countyObject = allcounties.getJSONObject(i);
                County county = new County();
                county.setCountyname(countyObject.getString("name"));
                county.setCountyid(countyObject.getInt("id"));
                county.setCityid(cityId);
                county.save();
            }
            return true;
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    return false;
}
}

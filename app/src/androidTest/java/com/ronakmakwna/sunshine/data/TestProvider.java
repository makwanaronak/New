package com.ronakmakwna.sunshine.data;

import android.database.sqlite.SQLiteDatabase;
import android.test.AndroidTestCase;

/**
 * Created by Ronak on 12/16/2015.
 */
public class TestProvider extends AndroidTestCase {
    public void testDeleteDb() throws Throwable{
        mContext.deleteDatabase(WeatherDbHelper.DATABASE_NAME);

    }
    public void testInsertReadDb(){
        String testName = "North Pole";
        String testLocationString = "99705";
        double testLatitude=64.772;
        double testLonitude=-147.355;

        WeatherDbHelper  dbHelper = new WeatherDbHelper(mContext);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
    }
}

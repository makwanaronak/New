package com.ronakmakwna.sunshine.data;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.test.AndroidTestCase;

/**
 * Created by Ronak on 12/16/2015.
 */
public class TestDb extends AndroidTestCase {
    public void testCreateDb() throws Throwable{
        mContext.deleteDatabase(WeatherDbHelper.DATABASE_NAME);
        SQLiteDatabase db = new WeatherDbHelper(
                this.mContext).getWritableDatabase();
        assertEquals(true,db.isOpen());
        db.close();
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

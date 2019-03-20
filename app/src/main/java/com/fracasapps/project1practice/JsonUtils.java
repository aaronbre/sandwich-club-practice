package com.fracasapps.project1practice;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtils {
    public static String TAG = "JsonUtils";

    public static Stock convertJsonToStock(String json) {
        String symbol, companyName, sector;
        Double latestPrice, yearHigh, yearLow;
        Long marketCap;

        try{
            JSONObject baseObject = new JSONObject(json);
            JSONObject quote = baseObject.getJSONObject("quote");
            if(quote != null){
                //TODO find all fields and assign them to the variables
                symbol = quote.getString("symbol");
                companyName = quote.getString("companyName");
                sector = quote.getString("sector");
                latestPrice = quote.getDouble("latestPrice");
                yearHigh = quote.getDouble("week52High");
                yearLow = quote.getDouble("week52Low");
                marketCap = quote.getLong("marketCap");
            } else {
                throw new IllegalArgumentException("json was not parseable as a stock");
            }

        } catch (JSONException e) {
            Log.e(TAG, "convertJsonToStock: Error in parsing json", e);
            return null;
        }

        return new Stock(symbol, companyName, latestPrice, sector, marketCap, yearHigh, yearLow);
    }
}

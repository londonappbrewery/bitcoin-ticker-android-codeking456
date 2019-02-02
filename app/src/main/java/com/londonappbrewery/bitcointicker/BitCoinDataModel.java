package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitCoinDataModel {
    private String mBaseCurrency;
    public static BitCoinDataModel fromJson(JSONObject jsonObject){
        BitCoinDataModel bitCoinData=new BitCoinDataModel();
        try {
            bitCoinData.mBaseCurrency = jsonObject.getString("last");
            return bitCoinData;
        }
        catch(JSONException e)
        {
            e.printStackTrace();
            return null;
        }

    }

    public String getBaseCurrency() {
        return mBaseCurrency;
    }
}

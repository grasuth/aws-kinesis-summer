package com.nodestone.ksum;

import com.amazonaws.util.json.Jackson;
/**
 * Represents raw json data from a producer
 */
class RawData {
    public String custId;
    public String value;
    
    public static RawData fromJSON(String jsonInput) {
        return Jackson.fromJsonString(jsonInput, RawData.class);
    } 
}
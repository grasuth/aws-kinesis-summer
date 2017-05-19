package com.nodestone.ksum;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class RawDataTest {
    
    @Test
    public void testHappyJSONDecode() {
        RawData rd = RawData.fromJSON("{\"custId\": \"11\", \"value\": \"33\"}");
        
        assertTrue(rd.custId.equals("11"));
        assertTrue(rd.value.equals("33"));
    }
    
    @Test
    public void testBadDecode() {
        try {
            RawData rd = RawData.fromJSON("");
            fail("decode should fail");
        } catch (Exception e) {
            // pass
        }
    }
}
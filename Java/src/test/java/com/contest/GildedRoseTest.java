package com.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {
    
    @Test
    public void should_return_quality_minus_1_when_one_day_past_given_normal_on_sale() throws TheValidQualityException {
    	Normal[] normals = new Normal[] { new Normal("normal", 10, 20) };
    	GildedRose gildedRose = new GildedRose(normals);
    	
    	gildedRose.updateQuality();
    	
    	assertEquals(9, gildedRose.normals[0].sellIn);
        assertEquals(19, gildedRose.normals[0].quality);
    }
    
    @Test
    public void should_return_quality_minus_2_when_one_day_past_given_expired_normal() throws TheValidQualityException {
    	Normal[] normals = new Normal[] { new Normal("normal", 1, 20) };
    	GildedRose gildedRose = new GildedRose(normals);
    	
    	gildedRose.updateQuality();
    	gildedRose.updateQuality();
    	
        assertEquals(17, gildedRose.normals[0].quality);
    }
    
    @Test
    public void should_return_quality_add_1_when_one_day_past_given_AgedBrie_on_sale() throws TheValidQualityException {
    	Normal[] normals = new Normal[] { new AgedBrie("agedBrie", 10, 20) };
    	GildedRose gildedRose = new GildedRose(normals);
    	
    	gildedRose.updateQuality();
    	
    	assertEquals(21, gildedRose.normals[0].quality);
    }
    
    @Test
    public void should_return_quality_minus_2_when_one_day_past_given_expired_AgedBrie() throws TheValidQualityException {
    	Normal[] normals = new Normal[] { new AgedBrie("agedBrie", 1, 20) };
    	GildedRose gildedRose = new GildedRose(normals);
    	
    	gildedRose.updateQuality();
    	gildedRose.updateQuality();
    	
    	assertEquals(19, gildedRose.normals[0].quality);
    }
    
    @Test
    public void should_return_the_fixed_quality_when_one_day_past_given_Sulfuras() throws TheValidQualityException {
    	Normal[] normals = new Normal[] { new Sulfuras("sulfuras", 10, 80) };
    	GildedRose gildedRose = new GildedRose(normals);
    	
    	gildedRose.updateQuality();
    	
    	assertEquals(80, gildedRose.normals[0].quality);
    }
    
    @Test
    public void should_return_quality_add_1_when_one_day_past_given_BackstagePasses_more_than_10_days_before_sale() {
    	
    }
}

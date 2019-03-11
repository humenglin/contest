package com.contest;

class GildedRose {
	Normal[] normals;

    public GildedRose(Normal[] normals) {
        this.normals = normals;
    }

    public void updateQuality() throws TheValidQualityException {
        for(Normal normal : normals) {
        	normal.updateQuality();
        }
    }
}
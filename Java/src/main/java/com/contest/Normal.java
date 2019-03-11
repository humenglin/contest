package com.contest;

public class Normal extends Item {
	
	public Normal(String name, int sellIn, int quality){
		super(name, sellIn, quality);
	}

	public void updateQuality() throws TheValidQualityException {
		if (this.sellIn > 0) {
			this.quality -=1;
		} else {
			this.quality -= 2;
		}
		
		this.sellIn -= 1;
		
		if (this.quality < 0) {
			this.quality = 0;
		}
	}

}

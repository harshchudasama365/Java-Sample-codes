package com.LTI.another;

abstract class RBI{
	abstract public void ROI();
}

abstract class Another extends RBI{
	
}
public class AbtractImpl extends Another{
	public void ROI() {
		System.out.println("SBI ROI");
	}
}

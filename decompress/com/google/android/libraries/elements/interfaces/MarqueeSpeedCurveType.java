// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum MarqueeSpeedCurveType
{
    private static final MarqueeSpeedCurveType[] $VALUES;
    
    MARQUEE_SPEED_CURVE_TYPE_ACCELERATE_DECELERATE("MARQUEE_SPEED_CURVE_TYPE_ACCELERATE_DECELERATE", 2), 
    MARQUEE_SPEED_CURVE_TYPE_LINEAR("MARQUEE_SPEED_CURVE_TYPE_LINEAR", 1), 
    MARQUEE_SPEED_CURVE_UNKNOWN("MARQUEE_SPEED_CURVE_UNKNOWN", 0);
    
    private static MarqueeSpeedCurveType[] $values() {
        return new MarqueeSpeedCurveType[] { MarqueeSpeedCurveType.MARQUEE_SPEED_CURVE_UNKNOWN, MarqueeSpeedCurveType.MARQUEE_SPEED_CURVE_TYPE_LINEAR, MarqueeSpeedCurveType.MARQUEE_SPEED_CURVE_TYPE_ACCELERATE_DECELERATE };
    }
    
    static {
        $VALUES = $values();
    }
    
    private MarqueeSpeedCurveType(final String s, final int n) {
    }
}

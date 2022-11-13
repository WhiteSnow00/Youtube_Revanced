// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum MarqueeScrollDirection
{
    private static final MarqueeScrollDirection[] $VALUES;
    
    MARQUEE_SCROLL_DIRECTION_DEFAULT("MARQUEE_SCROLL_DIRECTION_DEFAULT", 1), 
    MARQUEE_SCROLL_DIRECTION_LEFT_TO_RIGHT("MARQUEE_SCROLL_DIRECTION_LEFT_TO_RIGHT", 3), 
    MARQUEE_SCROLL_DIRECTION_RIGHT_TO_LEFT("MARQUEE_SCROLL_DIRECTION_RIGHT_TO_LEFT", 2), 
    MARQUEE_SCROLL_DIRECTION_UNKNOWN("MARQUEE_SCROLL_DIRECTION_UNKNOWN", 0);
    
    private static MarqueeScrollDirection[] $values() {
        return new MarqueeScrollDirection[] { MarqueeScrollDirection.MARQUEE_SCROLL_DIRECTION_UNKNOWN, MarqueeScrollDirection.MARQUEE_SCROLL_DIRECTION_DEFAULT, MarqueeScrollDirection.MARQUEE_SCROLL_DIRECTION_RIGHT_TO_LEFT, MarqueeScrollDirection.MARQUEE_SCROLL_DIRECTION_LEFT_TO_RIGHT };
    }
    
    static {
        $VALUES = $values();
    }
    
    private MarqueeScrollDirection(final String s, final int n) {
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum FlexDirection
{
    private static final FlexDirection[] $VALUES;
    
    FLEX_DIRECTION_COLUMN("FLEX_DIRECTION_COLUMN", 3), 
    FLEX_DIRECTION_COLUMN_REVERSE("FLEX_DIRECTION_COLUMN_REVERSE", 4), 
    FLEX_DIRECTION_ROW("FLEX_DIRECTION_ROW", 1), 
    FLEX_DIRECTION_ROW_REVERSE("FLEX_DIRECTION_ROW_REVERSE", 2), 
    FLEX_DIRECTION_UNKNOWN("FLEX_DIRECTION_UNKNOWN", 0);
    
    private static FlexDirection[] $values() {
        return new FlexDirection[] { FlexDirection.FLEX_DIRECTION_UNKNOWN, FlexDirection.FLEX_DIRECTION_ROW, FlexDirection.FLEX_DIRECTION_ROW_REVERSE, FlexDirection.FLEX_DIRECTION_COLUMN, FlexDirection.FLEX_DIRECTION_COLUMN_REVERSE };
    }
    
    static {
        $VALUES = $values();
    }
    
    private FlexDirection(final String s, final int n) {
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum FlexWrap
{
    private static final FlexWrap[] $VALUES;
    
    FLEX_WRAP_NO_WRAP("FLEX_WRAP_NO_WRAP", 1), 
    FLEX_WRAP_UNKNOWN("FLEX_WRAP_UNKNOWN", 0), 
    FLEX_WRAP_WRAP("FLEX_WRAP_WRAP", 2), 
    FLEX_WRAP_WRAP_REVERSE("FLEX_WRAP_WRAP_REVERSE", 3);
    
    private static FlexWrap[] $values() {
        return new FlexWrap[] { FlexWrap.FLEX_WRAP_UNKNOWN, FlexWrap.FLEX_WRAP_NO_WRAP, FlexWrap.FLEX_WRAP_WRAP, FlexWrap.FLEX_WRAP_WRAP_REVERSE };
    }
    
    static {
        $VALUES = $values();
    }
    
    private FlexWrap(final String s, final int n) {
    }
}

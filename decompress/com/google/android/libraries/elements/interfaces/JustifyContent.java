// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum JustifyContent
{
    private static final JustifyContent[] $VALUES;
    
    JUSTIFY_CONTENT_BETWEEN("JUSTIFY_CONTENT_BETWEEN", 4), 
    JUSTIFY_CONTENT_CENTER("JUSTIFY_CONTENT_CENTER", 3), 
    JUSTIFY_CONTENT_FLEX_END("JUSTIFY_CONTENT_FLEX_END", 2), 
    JUSTIFY_CONTENT_FLEX_START("JUSTIFY_CONTENT_FLEX_START", 1), 
    JUSTIFY_CONTENT_SPACE_AROUND("JUSTIFY_CONTENT_SPACE_AROUND", 5), 
    JUSTIFY_CONTENT_SPACE_EVENLY("JUSTIFY_CONTENT_SPACE_EVENLY", 6), 
    JUSTIFY_CONTENT_UNKNOWN("JUSTIFY_CONTENT_UNKNOWN", 0);
    
    private static JustifyContent[] $values() {
        return new JustifyContent[] { JustifyContent.JUSTIFY_CONTENT_UNKNOWN, JustifyContent.JUSTIFY_CONTENT_FLEX_START, JustifyContent.JUSTIFY_CONTENT_FLEX_END, JustifyContent.JUSTIFY_CONTENT_CENTER, JustifyContent.JUSTIFY_CONTENT_BETWEEN, JustifyContent.JUSTIFY_CONTENT_SPACE_AROUND, JustifyContent.JUSTIFY_CONTENT_SPACE_EVENLY };
    }
    
    static {
        $VALUES = $values();
    }
    
    private JustifyContent(final String s, final int n) {
    }
}

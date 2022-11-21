// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum TextAlignment
{
    private static final TextAlignment[] $VALUES;
    
    TEXT_ALIGNMENT_CENTER("TEXT_ALIGNMENT_CENTER", 3), 
    TEXT_ALIGNMENT_JUSTIFIED("TEXT_ALIGNMENT_JUSTIFIED", 4), 
    TEXT_ALIGNMENT_LAYOUT_START("TEXT_ALIGNMENT_LAYOUT_START", 5), 
    TEXT_ALIGNMENT_LEFT("TEXT_ALIGNMENT_LEFT", 1), 
    TEXT_ALIGNMENT_RIGHT("TEXT_ALIGNMENT_RIGHT", 2), 
    TEXT_ALIGNMENT_UNKNOWN("TEXT_ALIGNMENT_UNKNOWN", 0);
    
    private static TextAlignment[] $values() {
        return new TextAlignment[] { TextAlignment.TEXT_ALIGNMENT_UNKNOWN, TextAlignment.TEXT_ALIGNMENT_LEFT, TextAlignment.TEXT_ALIGNMENT_RIGHT, TextAlignment.TEXT_ALIGNMENT_CENTER, TextAlignment.TEXT_ALIGNMENT_JUSTIFIED, TextAlignment.TEXT_ALIGNMENT_LAYOUT_START };
    }
    
    static {
        $VALUES = $values();
    }
    
    private TextAlignment(final String s, final int n) {
    }
}

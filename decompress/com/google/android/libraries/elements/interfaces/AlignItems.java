// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum AlignItems
{
    private static final AlignItems[] $VALUES;
    
    ALIGN_ITEMS_AUTO("ALIGN_ITEMS_AUTO", 1), 
    ALIGN_ITEMS_BASELINE_FIRST("ALIGN_ITEMS_BASELINE_FIRST", 6), 
    ALIGN_ITEMS_BASELINE_LAST("ALIGN_ITEMS_BASELINE_LAST", 7), 
    ALIGN_ITEMS_CENTER("ALIGN_ITEMS_CENTER", 4), 
    ALIGN_ITEMS_END("ALIGN_ITEMS_END", 3), 
    ALIGN_ITEMS_START("ALIGN_ITEMS_START", 2), 
    ALIGN_ITEMS_STRETCH("ALIGN_ITEMS_STRETCH", 5), 
    ALIGN_ITEMS_UNKNOWN("ALIGN_ITEMS_UNKNOWN", 0);
    
    private static AlignItems[] $values() {
        return new AlignItems[] { AlignItems.ALIGN_ITEMS_UNKNOWN, AlignItems.ALIGN_ITEMS_AUTO, AlignItems.ALIGN_ITEMS_START, AlignItems.ALIGN_ITEMS_END, AlignItems.ALIGN_ITEMS_CENTER, AlignItems.ALIGN_ITEMS_STRETCH, AlignItems.ALIGN_ITEMS_BASELINE_FIRST, AlignItems.ALIGN_ITEMS_BASELINE_LAST };
    }
    
    static {
        $VALUES = $values();
    }
    
    private AlignItems(final String s, final int n) {
    }
}

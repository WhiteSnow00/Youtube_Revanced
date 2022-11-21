// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum ScrollableContainerTypeDirection
{
    private static final ScrollableContainerTypeDirection[] $VALUES;
    
    SCROLLABLE_CONTAINER_TYPE_DIRECTION_HORIZONTAL("SCROLLABLE_CONTAINER_TYPE_DIRECTION_HORIZONTAL", 1), 
    SCROLLABLE_CONTAINER_TYPE_DIRECTION_UNKNOWN("SCROLLABLE_CONTAINER_TYPE_DIRECTION_UNKNOWN", 0), 
    SCROLLABLE_CONTAINER_TYPE_DIRECTION_VERTICAL("SCROLLABLE_CONTAINER_TYPE_DIRECTION_VERTICAL", 2);
    
    private static ScrollableContainerTypeDirection[] $values() {
        return new ScrollableContainerTypeDirection[] { ScrollableContainerTypeDirection.SCROLLABLE_CONTAINER_TYPE_DIRECTION_UNKNOWN, ScrollableContainerTypeDirection.SCROLLABLE_CONTAINER_TYPE_DIRECTION_HORIZONTAL, ScrollableContainerTypeDirection.SCROLLABLE_CONTAINER_TYPE_DIRECTION_VERTICAL };
    }
    
    static {
        $VALUES = $values();
    }
    
    private ScrollableContainerTypeDirection(final String s, final int n) {
    }
}

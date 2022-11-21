// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum ScrollableContainerTypeOverscrollMode
{
    private static final ScrollableContainerTypeOverscrollMode[] $VALUES;
    
    SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_ALWAYS("SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_ALWAYS", 3), 
    SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_IF_CONTENT_SCROLLS("SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_IF_CONTENT_SCROLLS", 2), 
    SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_NEVER("SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_NEVER", 1), 
    SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_UNSPECIFIED("SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_UNSPECIFIED", 0);
    
    private static ScrollableContainerTypeOverscrollMode[] $values() {
        return new ScrollableContainerTypeOverscrollMode[] { ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_UNSPECIFIED, ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_NEVER, ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_IF_CONTENT_SCROLLS, ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_ALWAYS };
    }
    
    static {
        $VALUES = $values();
    }
    
    private ScrollableContainerTypeOverscrollMode(final String s, final int n) {
    }
}

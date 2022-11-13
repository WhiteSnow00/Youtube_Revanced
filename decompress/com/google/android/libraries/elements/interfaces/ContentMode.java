// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum ContentMode
{
    private static final ContentMode[] $VALUES;
    
    CONTENT_MODE_CENTER("CONTENT_MODE_CENTER", 4), 
    CONTENT_MODE_SCALE_ASPECT_FILL("CONTENT_MODE_SCALE_ASPECT_FILL", 3), 
    CONTENT_MODE_SCALE_ASPECT_FIT("CONTENT_MODE_SCALE_ASPECT_FIT", 2), 
    CONTENT_MODE_SCALE_TO_FILL("CONTENT_MODE_SCALE_TO_FILL", 1), 
    CONTENT_MODE_UNKNOWN("CONTENT_MODE_UNKNOWN", 0);
    
    private static ContentMode[] $values() {
        return new ContentMode[] { ContentMode.CONTENT_MODE_UNKNOWN, ContentMode.CONTENT_MODE_SCALE_TO_FILL, ContentMode.CONTENT_MODE_SCALE_ASPECT_FIT, ContentMode.CONTENT_MODE_SCALE_ASPECT_FILL, ContentMode.CONTENT_MODE_CENTER };
    }
    
    static {
        $VALUES = $values();
    }
    
    private ContentMode(final String s, final int n) {
    }
}

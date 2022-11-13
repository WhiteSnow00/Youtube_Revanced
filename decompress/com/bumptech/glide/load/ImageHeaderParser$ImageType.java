// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load;

public enum ImageHeaderParser$ImageType
{
    private static final ImageHeaderParser$ImageType[] $VALUES;
    
    ANIMATED_WEBP("ANIMATED_WEBP", 7, true), 
    AVIF("AVIF", 8, true), 
    GIF("GIF", 0, true), 
    JPEG("JPEG", 1, false), 
    PNG("PNG", 4, false), 
    PNG_A("PNG_A", 3, true), 
    RAW("RAW", 2, false), 
    UNKNOWN("UNKNOWN", 9, false), 
    WEBP("WEBP", 6, false), 
    WEBP_A("WEBP_A", 5, true);
    
    private final boolean a;
    
    private ImageHeaderParser$ImageType(final String s, final int n, final boolean a) {
        this.a = a;
    }
    
    public boolean hasAlpha() {
        return this.a;
    }
    
    public boolean isWebp() {
        final int ordinal = this.ordinal();
        return ordinal == 5 || ordinal == 6 || ordinal == 7;
    }
}

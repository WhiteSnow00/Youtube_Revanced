// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum ImageFormatHint
{
    private static final ImageFormatHint[] $VALUES;
    
    IMAGE_FORMAT_ANIMATED_GIF("IMAGE_FORMAT_ANIMATED_GIF", 4), 
    IMAGE_FORMAT_ANIMATED_WEBP("IMAGE_FORMAT_ANIMATED_WEBP", 3), 
    IMAGE_FORMAT_DEFAULT("IMAGE_FORMAT_DEFAULT", 0), 
    IMAGE_FORMAT_STATIC_GIF("IMAGE_FORMAT_STATIC_GIF", 2), 
    IMAGE_FORMAT_STATIC_WEBP("IMAGE_FORMAT_STATIC_WEBP", 1);
    
    private static ImageFormatHint[] $values() {
        return new ImageFormatHint[] { ImageFormatHint.IMAGE_FORMAT_DEFAULT, ImageFormatHint.IMAGE_FORMAT_STATIC_WEBP, ImageFormatHint.IMAGE_FORMAT_STATIC_GIF, ImageFormatHint.IMAGE_FORMAT_ANIMATED_WEBP, ImageFormatHint.IMAGE_FORMAT_ANIMATED_GIF };
    }
    
    static {
        $VALUES = $values();
    }
    
    private ImageFormatHint(final String s, final int n) {
    }
}

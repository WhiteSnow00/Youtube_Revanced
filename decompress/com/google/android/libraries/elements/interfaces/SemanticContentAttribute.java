// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum SemanticContentAttribute
{
    private static final SemanticContentAttribute[] $VALUES;
    
    SEMANTIC_CONTENT_ATTRIBUTE_FORCE_LTR("SEMANTIC_CONTENT_ATTRIBUTE_FORCE_LTR", 1), 
    SEMANTIC_CONTENT_ATTRIBUTE_FORCE_RTL("SEMANTIC_CONTENT_ATTRIBUTE_FORCE_RTL", 2), 
    SEMANTIC_CONTENT_ATTRIBUTE_PLAYBACK("SEMANTIC_CONTENT_ATTRIBUTE_PLAYBACK", 3), 
    SEMANTIC_CONTENT_ATTRIBUTE_SPATIAL("SEMANTIC_CONTENT_ATTRIBUTE_SPATIAL", 4), 
    SEMANTIC_CONTENT_ATTRIBUTE_UNKNOWN("SEMANTIC_CONTENT_ATTRIBUTE_UNKNOWN", 0);
    
    private static SemanticContentAttribute[] $values() {
        return new SemanticContentAttribute[] { SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_UNKNOWN, SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_FORCE_LTR, SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_FORCE_RTL, SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_PLAYBACK, SemanticContentAttribute.SEMANTIC_CONTENT_ATTRIBUTE_SPATIAL };
    }
    
    static {
        $VALUES = $values();
    }
    
    private SemanticContentAttribute(final String s, final int n) {
    }
}

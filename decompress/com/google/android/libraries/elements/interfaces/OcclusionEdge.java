// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum OcclusionEdge
{
    private static final OcclusionEdge[] $VALUES;
    
    BOTTOM("BOTTOM", 1), 
    LEFT("LEFT", 2), 
    RIGHT("RIGHT", 3), 
    TOP("TOP", 0);
    
    private static OcclusionEdge[] $values() {
        return new OcclusionEdge[] { OcclusionEdge.TOP, OcclusionEdge.BOTTOM, OcclusionEdge.LEFT, OcclusionEdge.RIGHT };
    }
    
    static {
        $VALUES = $values();
    }
    
    private OcclusionEdge(final String s, final int n) {
    }
}

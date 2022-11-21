// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum StatusInResponse
{
    private static final StatusInResponse[] $VALUES;
    
    ATTACHED("ATTACHED", 2), 
    OMITTED("OMITTED", 1), 
    UNKNOWN("UNKNOWN", 0);
    
    private static StatusInResponse[] $values() {
        return new StatusInResponse[] { StatusInResponse.UNKNOWN, StatusInResponse.OMITTED, StatusInResponse.ATTACHED };
    }
    
    static {
        $VALUES = $values();
    }
    
    private StatusInResponse(final String s, final int n) {
    }
}

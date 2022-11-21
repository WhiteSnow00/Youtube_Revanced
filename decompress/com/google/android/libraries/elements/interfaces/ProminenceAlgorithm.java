// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum ProminenceAlgorithm
{
    private static final ProminenceAlgorithm[] $VALUES;
    
    DEFAULT_ALGORITHM("DEFAULT_ALGORITHM", 0);
    
    private static ProminenceAlgorithm[] $values() {
        return new ProminenceAlgorithm[] { ProminenceAlgorithm.DEFAULT_ALGORITHM };
    }
    
    static {
        $VALUES = $values();
    }
    
    private ProminenceAlgorithm(final String s, final int n) {
    }
}

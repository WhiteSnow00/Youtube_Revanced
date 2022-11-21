// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum TruncationMode
{
    private static final TruncationMode[] $VALUES;
    
    TRUNCATION_MODE_BY_TRUNCATING_HEAD("TRUNCATION_MODE_BY_TRUNCATING_HEAD", 1), 
    TRUNCATION_MODE_BY_TRUNCATING_MIDDLE("TRUNCATION_MODE_BY_TRUNCATING_MIDDLE", 3), 
    TRUNCATION_MODE_BY_TRUNCATING_TAIL("TRUNCATION_MODE_BY_TRUNCATING_TAIL", 2), 
    TRUNCATION_MODE_BY_TRUNCATING_TAIL_AT_WORD("TRUNCATION_MODE_BY_TRUNCATING_TAIL_AT_WORD", 5), 
    TRUNCATION_MODE_TRUNCATE_BY_CLIPPING("TRUNCATION_MODE_TRUNCATE_BY_CLIPPING", 4), 
    TRUNCATION_MODE_UNKNOWN("TRUNCATION_MODE_UNKNOWN", 0);
    
    private static TruncationMode[] $values() {
        return new TruncationMode[] { TruncationMode.TRUNCATION_MODE_UNKNOWN, TruncationMode.TRUNCATION_MODE_BY_TRUNCATING_HEAD, TruncationMode.TRUNCATION_MODE_BY_TRUNCATING_TAIL, TruncationMode.TRUNCATION_MODE_BY_TRUNCATING_MIDDLE, TruncationMode.TRUNCATION_MODE_TRUNCATE_BY_CLIPPING, TruncationMode.TRUNCATION_MODE_BY_TRUNCATING_TAIL_AT_WORD };
    }
    
    static {
        $VALUES = $values();
    }
    
    private TruncationMode(final String s, final int n) {
    }
}

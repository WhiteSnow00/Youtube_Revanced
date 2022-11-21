// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum Position
{
    private static final Position[] $VALUES;
    
    POSITION_ABSOLUTE("POSITION_ABSOLUTE", 2), 
    POSITION_RELATIVE("POSITION_RELATIVE", 1), 
    POSITION_UNKNOWN("POSITION_UNKNOWN", 0);
    
    private static Position[] $values() {
        return new Position[] { Position.POSITION_UNKNOWN, Position.POSITION_RELATIVE, Position.POSITION_ABSOLUTE };
    }
    
    static {
        $VALUES = $values();
    }
    
    private Position(final String s, final int n) {
    }
}

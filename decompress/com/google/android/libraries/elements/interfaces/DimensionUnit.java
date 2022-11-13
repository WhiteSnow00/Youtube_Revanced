// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum DimensionUnit
{
    private static final DimensionUnit[] $VALUES;
    
    DIMENSION_UNIT_FRACTION("DIMENSION_UNIT_FRACTION", 2), 
    DIMENSION_UNIT_POINT("DIMENSION_UNIT_POINT", 1), 
    DIMENSION_UNIT_UNKNOWN("DIMENSION_UNIT_UNKNOWN", 0);
    
    private static DimensionUnit[] $values() {
        return new DimensionUnit[] { DimensionUnit.DIMENSION_UNIT_UNKNOWN, DimensionUnit.DIMENSION_UNIT_POINT, DimensionUnit.DIMENSION_UNIT_FRACTION };
    }
    
    static {
        $VALUES = $values();
    }
    
    private DimensionUnit(final String s, final int n) {
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

public enum CardboardDevice$DeviceParams$VerticalAlignmentType implements ahbl
{
    private static final CardboardDevice$DeviceParams$VerticalAlignmentType[] $VALUES;
    
    BOTTOM("BOTTOM", 0, 0);
    
    public static final int BOTTOM_VALUE = 0;
    
    CENTER("CENTER", 1, 1);
    
    public static final int CENTER_VALUE = 1;
    
    TOP("TOP", 2, 2);
    
    public static final int TOP_VALUE = 2;
    private static final ahbm internalValueMap;
    private final int value;
    
    private static CardboardDevice$DeviceParams$VerticalAlignmentType[] $values() {
        return new CardboardDevice$DeviceParams$VerticalAlignmentType[] { CardboardDevice$DeviceParams$VerticalAlignmentType.BOTTOM, CardboardDevice$DeviceParams$VerticalAlignmentType.CENTER, CardboardDevice$DeviceParams$VerticalAlignmentType.TOP };
    }
    
    static {
        $VALUES = $values();
        internalValueMap = (ahbm)new CardboardDevice$DeviceParams$VerticalAlignmentType$1();
    }
    
    private CardboardDevice$DeviceParams$VerticalAlignmentType(final String s, final int n, final int value) {
        this.value = value;
    }
    
    public static CardboardDevice$DeviceParams$VerticalAlignmentType forNumber(final int n) {
        if (n == 0) {
            return CardboardDevice$DeviceParams$VerticalAlignmentType.BOTTOM;
        }
        if (n == 1) {
            return CardboardDevice$DeviceParams$VerticalAlignmentType.CENTER;
        }
        if (n != 2) {
            return null;
        }
        return CardboardDevice$DeviceParams$VerticalAlignmentType.TOP;
    }
    
    public static ahbn internalGetVerifier() {
        return CardboardDevice$DeviceParams$VerticalAlignmentType$VerticalAlignmentTypeVerifier.INSTANCE;
    }
    
    public final int getNumber() {
        return this.value;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}

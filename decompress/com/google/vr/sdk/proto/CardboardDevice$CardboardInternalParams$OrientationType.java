// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

public enum CardboardDevice$CardboardInternalParams$OrientationType implements ahbl
{
    private static final CardboardDevice$CardboardInternalParams$OrientationType[] $VALUES;
    
    CCW_0_DEGREES("CCW_0_DEGREES", 0, 0), 
    CCW_0_DEGREES_MIRRORED("CCW_0_DEGREES_MIRRORED", 4, 4);
    
    public static final int CCW_0_DEGREES_MIRRORED_VALUE = 4;
    public static final int CCW_0_DEGREES_VALUE = 0;
    
    CCW_180_DEGREES("CCW_180_DEGREES", 2, 2), 
    CCW_180_DEGREES_MIRRORED("CCW_180_DEGREES_MIRRORED", 6, 6);
    
    public static final int CCW_180_DEGREES_MIRRORED_VALUE = 6;
    public static final int CCW_180_DEGREES_VALUE = 2;
    
    CCW_270_DEGREES("CCW_270_DEGREES", 3, 3), 
    CCW_270_DEGREES_MIRRORED("CCW_270_DEGREES_MIRRORED", 7, 7);
    
    public static final int CCW_270_DEGREES_MIRRORED_VALUE = 7;
    public static final int CCW_270_DEGREES_VALUE = 3;
    
    CCW_90_DEGREES("CCW_90_DEGREES", 1, 1), 
    CCW_90_DEGREES_MIRRORED("CCW_90_DEGREES_MIRRORED", 5, 5);
    
    public static final int CCW_90_DEGREES_MIRRORED_VALUE = 5;
    public static final int CCW_90_DEGREES_VALUE = 1;
    private static final ahbm internalValueMap;
    private final int value;
    
    private static CardboardDevice$CardboardInternalParams$OrientationType[] $values() {
        return new CardboardDevice$CardboardInternalParams$OrientationType[] { CardboardDevice$CardboardInternalParams$OrientationType.CCW_0_DEGREES, CardboardDevice$CardboardInternalParams$OrientationType.CCW_90_DEGREES, CardboardDevice$CardboardInternalParams$OrientationType.CCW_180_DEGREES, CardboardDevice$CardboardInternalParams$OrientationType.CCW_270_DEGREES, CardboardDevice$CardboardInternalParams$OrientationType.CCW_0_DEGREES_MIRRORED, CardboardDevice$CardboardInternalParams$OrientationType.CCW_90_DEGREES_MIRRORED, CardboardDevice$CardboardInternalParams$OrientationType.CCW_180_DEGREES_MIRRORED, CardboardDevice$CardboardInternalParams$OrientationType.CCW_270_DEGREES_MIRRORED };
    }
    
    static {
        $VALUES = $values();
        internalValueMap = (ahbm)new CardboardDevice$CardboardInternalParams$OrientationType$1();
    }
    
    private CardboardDevice$CardboardInternalParams$OrientationType(final String s, final int n, final int value) {
        this.value = value;
    }
    
    public static CardboardDevice$CardboardInternalParams$OrientationType forNumber(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return CardboardDevice$CardboardInternalParams$OrientationType.CCW_270_DEGREES_MIRRORED;
            }
            case 6: {
                return CardboardDevice$CardboardInternalParams$OrientationType.CCW_180_DEGREES_MIRRORED;
            }
            case 5: {
                return CardboardDevice$CardboardInternalParams$OrientationType.CCW_90_DEGREES_MIRRORED;
            }
            case 4: {
                return CardboardDevice$CardboardInternalParams$OrientationType.CCW_0_DEGREES_MIRRORED;
            }
            case 3: {
                return CardboardDevice$CardboardInternalParams$OrientationType.CCW_270_DEGREES;
            }
            case 2: {
                return CardboardDevice$CardboardInternalParams$OrientationType.CCW_180_DEGREES;
            }
            case 1: {
                return CardboardDevice$CardboardInternalParams$OrientationType.CCW_90_DEGREES;
            }
            case 0: {
                return CardboardDevice$CardboardInternalParams$OrientationType.CCW_0_DEGREES;
            }
        }
    }
    
    public static ahbn internalGetVerifier() {
        return CardboardDevice$CardboardInternalParams$OrientationType$OrientationTypeVerifier.INSTANCE;
    }
    
    public final int getNumber() {
        return this.value;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}

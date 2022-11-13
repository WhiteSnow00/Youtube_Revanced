// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

public enum CardboardDevice$DeviceParams$ButtonType implements ahbl
{
    private static final CardboardDevice$DeviceParams$ButtonType[] $VALUES;
    
    INDIRECT_TOUCH("INDIRECT_TOUCH", 3, 3);
    
    public static final int INDIRECT_TOUCH_VALUE = 3;
    
    MAGNET("MAGNET", 1, 1);
    
    public static final int MAGNET_VALUE = 1;
    
    NONE("NONE", 0, 0);
    
    public static final int NONE_VALUE = 0;
    
    TOUCH("TOUCH", 2, 2);
    
    public static final int TOUCH_VALUE = 2;
    private static final ahbm internalValueMap;
    private final int value;
    
    private static CardboardDevice$DeviceParams$ButtonType[] $values() {
        return new CardboardDevice$DeviceParams$ButtonType[] { CardboardDevice$DeviceParams$ButtonType.NONE, CardboardDevice$DeviceParams$ButtonType.MAGNET, CardboardDevice$DeviceParams$ButtonType.TOUCH, CardboardDevice$DeviceParams$ButtonType.INDIRECT_TOUCH };
    }
    
    static {
        $VALUES = $values();
        internalValueMap = (ahbm)new CardboardDevice$DeviceParams$ButtonType$1();
    }
    
    private CardboardDevice$DeviceParams$ButtonType(final String s, final int n, final int value) {
        this.value = value;
    }
    
    public static CardboardDevice$DeviceParams$ButtonType forNumber(final int n) {
        if (n == 0) {
            return CardboardDevice$DeviceParams$ButtonType.NONE;
        }
        if (n == 1) {
            return CardboardDevice$DeviceParams$ButtonType.MAGNET;
        }
        if (n == 2) {
            return CardboardDevice$DeviceParams$ButtonType.TOUCH;
        }
        if (n != 3) {
            return null;
        }
        return CardboardDevice$DeviceParams$ButtonType.INDIRECT_TOUCH;
    }
    
    public static ahbn internalGetVerifier() {
        return CardboardDevice$DeviceParams$ButtonType$ButtonTypeVerifier.INSTANCE;
    }
    
    public final int getNumber() {
        return this.value;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}

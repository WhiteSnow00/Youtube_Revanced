// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.proto;

public enum CardboardDevice$DeviceParams$ButtonType implements agzm
{
    INDIRECT_TOUCH("INDIRECT_TOUCH", 3, 3);
    
    public static final int INDIRECT_TOUCH_VALUE = 3;
    
    MAGNET("MAGNET", 1, 1);
    
    public static final int MAGNET_VALUE = 1;
    
    NONE("NONE", 0, 0);
    
    public static final int NONE_VALUE = 0;
    
    TOUCH("TOUCH", 2, 2);
    
    public static final int TOUCH_VALUE = 2;
    private static final agzn internalValueMap;
    private final int value;
    
    static {
        internalValueMap = (agzn)new CardboardDevice$DeviceParams$ButtonType$1();
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
    
    public static agzn internalGetValueMap() {
        return CardboardDevice$DeviceParams$ButtonType.internalValueMap;
    }
    
    public static agzo internalGetVerifier() {
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

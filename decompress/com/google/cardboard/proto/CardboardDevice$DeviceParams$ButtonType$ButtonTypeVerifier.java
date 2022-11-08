// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.proto;

final class CardboardDevice$DeviceParams$ButtonType$ButtonTypeVerifier implements agzo
{
    static final agzo INSTANCE;
    
    static {
        INSTANCE = (agzo)new CardboardDevice$DeviceParams$ButtonType$ButtonTypeVerifier();
    }
    
    private CardboardDevice$DeviceParams$ButtonType$ButtonTypeVerifier() {
    }
    
    public boolean isInRange(final int n) {
        return CardboardDevice$DeviceParams$ButtonType.forNumber(n) != null;
    }
}

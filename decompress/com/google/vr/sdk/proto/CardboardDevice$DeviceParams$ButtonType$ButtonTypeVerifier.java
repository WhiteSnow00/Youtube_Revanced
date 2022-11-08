// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

final class CardboardDevice$DeviceParams$ButtonType$ButtonTypeVerifier implements agzo
{
    static final agzo INSTANCE;
    
    static {
        INSTANCE = new CardboardDevice$DeviceParams$ButtonType$ButtonTypeVerifier();
    }
    
    private CardboardDevice$DeviceParams$ButtonType$ButtonTypeVerifier() {
    }
    
    @Override
    public boolean isInRange(final int n) {
        return CardboardDevice$DeviceParams$ButtonType.forNumber(n) != null;
    }
}

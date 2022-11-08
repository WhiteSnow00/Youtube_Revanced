// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

final class CardboardDevice$CardboardInternalParams$OrientationType$OrientationTypeVerifier implements agzo
{
    static final agzo INSTANCE;
    
    static {
        INSTANCE = new CardboardDevice$CardboardInternalParams$OrientationType$OrientationTypeVerifier();
    }
    
    private CardboardDevice$CardboardInternalParams$OrientationType$OrientationTypeVerifier() {
    }
    
    @Override
    public boolean isInRange(final int n) {
        return CardboardDevice$CardboardInternalParams$OrientationType.forNumber(n) != null;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.cardboard.proto;

final class CardboardDevice$DeviceParams$VerticalAlignmentType$VerticalAlignmentTypeVerifier implements agzo
{
    static final agzo INSTANCE;
    
    static {
        INSTANCE = (agzo)new CardboardDevice$DeviceParams$VerticalAlignmentType$VerticalAlignmentTypeVerifier();
    }
    
    private CardboardDevice$DeviceParams$VerticalAlignmentType$VerticalAlignmentTypeVerifier() {
    }
    
    public boolean isInRange(final int n) {
        return CardboardDevice$DeviceParams$VerticalAlignmentType.forNumber(n) != null;
    }
}

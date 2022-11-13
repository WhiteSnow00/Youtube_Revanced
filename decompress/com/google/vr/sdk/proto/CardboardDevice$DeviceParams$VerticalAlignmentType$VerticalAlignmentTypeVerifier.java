// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

final class CardboardDevice$DeviceParams$VerticalAlignmentType$VerticalAlignmentTypeVerifier implements ahbn
{
    static final ahbn INSTANCE;
    
    static {
        INSTANCE = (ahbn)new CardboardDevice$DeviceParams$VerticalAlignmentType$VerticalAlignmentTypeVerifier();
    }
    
    private CardboardDevice$DeviceParams$VerticalAlignmentType$VerticalAlignmentTypeVerifier() {
    }
    
    public boolean isInRange(final int n) {
        return CardboardDevice$DeviceParams$VerticalAlignmentType.forNumber(n) != null;
    }
}

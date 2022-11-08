// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

final class CardboardDevice$VignetteParams$VignetteParamsCondition$VignetteParamsConditionVerifier implements agzo
{
    static final agzo INSTANCE;
    
    static {
        INSTANCE = new CardboardDevice$VignetteParams$VignetteParamsCondition$VignetteParamsConditionVerifier();
    }
    
    private CardboardDevice$VignetteParams$VignetteParamsCondition$VignetteParamsConditionVerifier() {
    }
    
    @Override
    public boolean isInRange(final int n) {
        return CardboardDevice$VignetteParams$VignetteParamsCondition.forNumber(n) != null;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

final class CardboardDevice$VignetteParams$VignetteParamsCondition$VignetteParamsConditionVerifier implements ahbn
{
    static final ahbn INSTANCE;
    
    static {
        INSTANCE = (ahbn)new CardboardDevice$VignetteParams$VignetteParamsCondition$VignetteParamsConditionVerifier();
    }
    
    private CardboardDevice$VignetteParams$VignetteParamsCondition$VignetteParamsConditionVerifier() {
    }
    
    public boolean isInRange(final int n) {
        return CardboardDevice$VignetteParams$VignetteParamsCondition.forNumber(n) != null;
    }
}

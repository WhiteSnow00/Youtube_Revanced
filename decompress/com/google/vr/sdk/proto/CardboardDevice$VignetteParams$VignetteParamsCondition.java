// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

public enum CardboardDevice$VignetteParams$VignetteParamsCondition implements ahbl
{
    private static final CardboardDevice$VignetteParams$VignetteParamsCondition[] $VALUES;
    
    HORIZ_DIMEN_LESS_THAN_METER("HORIZ_DIMEN_LESS_THAN_METER", 1, 1);
    
    public static final int HORIZ_DIMEN_LESS_THAN_METER_VALUE = 1;
    
    NO_VIGNETTE_CONDITION("NO_VIGNETTE_CONDITION", 0, 0);
    
    public static final int NO_VIGNETTE_CONDITION_VALUE = 0;
    private static final ahbm internalValueMap;
    private final int value;
    
    private static CardboardDevice$VignetteParams$VignetteParamsCondition[] $values() {
        return new CardboardDevice$VignetteParams$VignetteParamsCondition[] { CardboardDevice$VignetteParams$VignetteParamsCondition.NO_VIGNETTE_CONDITION, CardboardDevice$VignetteParams$VignetteParamsCondition.HORIZ_DIMEN_LESS_THAN_METER };
    }
    
    static {
        $VALUES = $values();
        internalValueMap = (ahbm)new CardboardDevice$VignetteParams$VignetteParamsCondition$1();
    }
    
    private CardboardDevice$VignetteParams$VignetteParamsCondition(final String s, final int n, final int value) {
        this.value = value;
    }
    
    public static CardboardDevice$VignetteParams$VignetteParamsCondition forNumber(final int n) {
        if (n == 0) {
            return CardboardDevice$VignetteParams$VignetteParamsCondition.NO_VIGNETTE_CONDITION;
        }
        if (n != 1) {
            return null;
        }
        return CardboardDevice$VignetteParams$VignetteParamsCondition.HORIZ_DIMEN_LESS_THAN_METER;
    }
    
    public static ahbn internalGetVerifier() {
        return CardboardDevice$VignetteParams$VignetteParamsCondition$VignetteParamsConditionVerifier.INSTANCE;
    }
    
    public final int getNumber() {
        return this.value;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}

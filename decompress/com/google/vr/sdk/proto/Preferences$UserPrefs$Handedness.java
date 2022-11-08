// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

public enum Preferences$UserPrefs$Handedness implements agzm
{
    LEFT_HANDED("LEFT_HANDED", 1, 1);
    
    public static final int LEFT_HANDED_VALUE = 1;
    
    RIGHT_HANDED("RIGHT_HANDED", 0, 0);
    
    public static final int RIGHT_HANDED_VALUE = 0;
    private static final agzn internalValueMap;
    private final int value;
    
    static {
        internalValueMap = (agzn)new Preferences$UserPrefs$Handedness$1();
    }
    
    private Preferences$UserPrefs$Handedness(final String s, final int n, final int value) {
        this.value = value;
    }
    
    public static Preferences$UserPrefs$Handedness forNumber(final int n) {
        if (n == 0) {
            return Preferences$UserPrefs$Handedness.RIGHT_HANDED;
        }
        if (n != 1) {
            return null;
        }
        return Preferences$UserPrefs$Handedness.LEFT_HANDED;
    }
    
    public static agzo internalGetVerifier() {
        return Preferences$UserPrefs$Handedness$HandednessVerifier.INSTANCE;
    }
    
    public final int getNumber() {
        return this.value;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}

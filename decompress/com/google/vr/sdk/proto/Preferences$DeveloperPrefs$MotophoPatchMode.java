// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

public enum Preferences$DeveloperPrefs$MotophoPatchMode implements agzm
{
    IMPULSE("IMPULSE", 2, 2);
    
    public static final int IMPULSE_VALUE = 2;
    
    NONE("NONE", 0, 0);
    
    public static final int NONE_VALUE = 0;
    
    VELOCITY("VELOCITY", 1, 1);
    
    public static final int VELOCITY_VALUE = 1;
    private static final agzn internalValueMap;
    private final int value;
    
    static {
        internalValueMap = (agzn)new Preferences$DeveloperPrefs$MotophoPatchMode$1();
    }
    
    private Preferences$DeveloperPrefs$MotophoPatchMode(final String s, final int n, final int value) {
        this.value = value;
    }
    
    public static Preferences$DeveloperPrefs$MotophoPatchMode forNumber(final int n) {
        if (n == 0) {
            return Preferences$DeveloperPrefs$MotophoPatchMode.NONE;
        }
        if (n == 1) {
            return Preferences$DeveloperPrefs$MotophoPatchMode.VELOCITY;
        }
        if (n != 2) {
            return null;
        }
        return Preferences$DeveloperPrefs$MotophoPatchMode.IMPULSE;
    }
    
    public static agzo internalGetVerifier() {
        return Preferences$DeveloperPrefs$MotophoPatchMode$MotophoPatchModeVerifier.INSTANCE;
    }
    
    public final int getNumber() {
        return this.value;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}

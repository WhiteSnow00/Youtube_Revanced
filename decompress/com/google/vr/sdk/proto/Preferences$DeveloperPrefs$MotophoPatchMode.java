// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

public enum Preferences$DeveloperPrefs$MotophoPatchMode implements ahbl
{
    private static final Preferences$DeveloperPrefs$MotophoPatchMode[] $VALUES;
    
    IMPULSE("IMPULSE", 2, 2);
    
    public static final int IMPULSE_VALUE = 2;
    
    NONE("NONE", 0, 0);
    
    public static final int NONE_VALUE = 0;
    
    VELOCITY("VELOCITY", 1, 1);
    
    public static final int VELOCITY_VALUE = 1;
    private static final ahbm internalValueMap;
    private final int value;
    
    private static Preferences$DeveloperPrefs$MotophoPatchMode[] $values() {
        return new Preferences$DeveloperPrefs$MotophoPatchMode[] { Preferences$DeveloperPrefs$MotophoPatchMode.NONE, Preferences$DeveloperPrefs$MotophoPatchMode.VELOCITY, Preferences$DeveloperPrefs$MotophoPatchMode.IMPULSE };
    }
    
    static {
        $VALUES = $values();
        internalValueMap = (ahbm)new Preferences$DeveloperPrefs$MotophoPatchMode$1();
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
    
    public static ahbn internalGetVerifier() {
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

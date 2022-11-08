// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

final class Preferences$DeveloperPrefs$MotophoPatchMode$MotophoPatchModeVerifier implements agzo
{
    static final agzo INSTANCE;
    
    static {
        INSTANCE = (agzo)new Preferences$DeveloperPrefs$MotophoPatchMode$MotophoPatchModeVerifier();
    }
    
    private Preferences$DeveloperPrefs$MotophoPatchMode$MotophoPatchModeVerifier() {
    }
    
    public boolean isInRange(final int n) {
        return Preferences$DeveloperPrefs$MotophoPatchMode.forNumber(n) != null;
    }
}

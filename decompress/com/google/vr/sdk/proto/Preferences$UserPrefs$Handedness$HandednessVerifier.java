// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

final class Preferences$UserPrefs$Handedness$HandednessVerifier implements agzo
{
    static final agzo INSTANCE;
    
    static {
        INSTANCE = (agzo)new Preferences$UserPrefs$Handedness$HandednessVerifier();
    }
    
    private Preferences$UserPrefs$Handedness$HandednessVerifier() {
    }
    
    public boolean isInRange(final int n) {
        return Preferences$UserPrefs$Handedness.forNumber(n) != null;
    }
}

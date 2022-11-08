// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

final class Preferences$PlayAreaType$PlayAreaTypeVerifier implements agzo
{
    static final agzo INSTANCE;
    
    static {
        INSTANCE = (agzo)new Preferences$PlayAreaType$PlayAreaTypeVerifier();
    }
    
    private Preferences$PlayAreaType$PlayAreaTypeVerifier() {
    }
    
    public boolean isInRange(final int n) {
        return Preferences$PlayAreaType.forNumber(n) != null;
    }
}

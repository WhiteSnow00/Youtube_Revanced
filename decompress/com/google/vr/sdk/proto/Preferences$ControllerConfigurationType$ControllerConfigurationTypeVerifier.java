// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

final class Preferences$ControllerConfigurationType$ControllerConfigurationTypeVerifier implements agzo
{
    static final agzo INSTANCE;
    
    static {
        INSTANCE = (agzo)new Preferences$ControllerConfigurationType$ControllerConfigurationTypeVerifier();
    }
    
    private Preferences$ControllerConfigurationType$ControllerConfigurationTypeVerifier() {
    }
    
    public boolean isInRange(final int n) {
        return Preferences$ControllerConfigurationType.forNumber(n) != null;
    }
}

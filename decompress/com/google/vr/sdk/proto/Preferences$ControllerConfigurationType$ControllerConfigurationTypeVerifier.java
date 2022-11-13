// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

final class Preferences$ControllerConfigurationType$ControllerConfigurationTypeVerifier implements ahbn
{
    static final ahbn INSTANCE;
    
    static {
        INSTANCE = (ahbn)new Preferences$ControllerConfigurationType$ControllerConfigurationTypeVerifier();
    }
    
    private Preferences$ControllerConfigurationType$ControllerConfigurationTypeVerifier() {
    }
    
    public boolean isInRange(final int n) {
        return Preferences$ControllerConfigurationType.forNumber(n) != null;
    }
}

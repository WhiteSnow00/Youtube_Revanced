// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

public enum Preferences$ControllerConfigurationType implements agzm
{
    GVR_CONTROLLER_CONFIGURATION_3DOF_1("GVR_CONTROLLER_CONFIGURATION_3DOF_1", 2, 2);
    
    public static final int GVR_CONTROLLER_CONFIGURATION_3DOF_1_VALUE = 2;
    
    GVR_CONTROLLER_CONFIGURATION_6DOF_2("GVR_CONTROLLER_CONFIGURATION_6DOF_2", 3, 3), 
    GVR_CONTROLLER_CONFIGURATION_6DOF_2_RESERVED("GVR_CONTROLLER_CONFIGURATION_6DOF_2_RESERVED", 4, 4);
    
    public static final int GVR_CONTROLLER_CONFIGURATION_6DOF_2_RESERVED_VALUE = 4;
    public static final int GVR_CONTROLLER_CONFIGURATION_6DOF_2_VALUE = 3;
    
    GVR_CONTROLLER_CONFIGURATION_UNKNOWN("GVR_CONTROLLER_CONFIGURATION_UNKNOWN", 0, 0);
    
    public static final int GVR_CONTROLLER_CONFIGURATION_UNKNOWN_VALUE = 0;
    
    GVR_CONTROLLER_CONFIGURATION_UNSUPPORTED("GVR_CONTROLLER_CONFIGURATION_UNSUPPORTED", 1, 1);
    
    public static final int GVR_CONTROLLER_CONFIGURATION_UNSUPPORTED_VALUE = 1;
    private static final agzn internalValueMap;
    private final int value;
    
    static {
        internalValueMap = (agzn)new Preferences$ControllerConfigurationType$1();
    }
    
    private Preferences$ControllerConfigurationType(final String s, final int n, final int value) {
        this.value = value;
    }
    
    public static Preferences$ControllerConfigurationType forNumber(final int n) {
        if (n == 0) {
            return Preferences$ControllerConfigurationType.GVR_CONTROLLER_CONFIGURATION_UNKNOWN;
        }
        if (n == 1) {
            return Preferences$ControllerConfigurationType.GVR_CONTROLLER_CONFIGURATION_UNSUPPORTED;
        }
        if (n == 2) {
            return Preferences$ControllerConfigurationType.GVR_CONTROLLER_CONFIGURATION_3DOF_1;
        }
        if (n == 3) {
            return Preferences$ControllerConfigurationType.GVR_CONTROLLER_CONFIGURATION_6DOF_2;
        }
        if (n != 4) {
            return null;
        }
        return Preferences$ControllerConfigurationType.GVR_CONTROLLER_CONFIGURATION_6DOF_2_RESERVED;
    }
    
    public static agzo internalGetVerifier() {
        return Preferences$ControllerConfigurationType$ControllerConfigurationTypeVerifier.INSTANCE;
    }
    
    public final int getNumber() {
        return this.value;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}

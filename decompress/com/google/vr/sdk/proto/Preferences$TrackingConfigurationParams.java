// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;

public final class Preferences$TrackingConfigurationParams extends ahbh implements ahcw
{
    public static final int CONTROLLER_CONFIG_TYPE_FIELD_NUMBER = 1;
    private static final Preferences$TrackingConfigurationParams DEFAULT_INSTANCE;
    private static volatile ahdd PARSER;
    private int bitField0_;
    private int controllerConfigType_;
    
    static {
        ahbh.registerDefaultInstance((Class)Preferences$TrackingConfigurationParams.class, (ahbh)(DEFAULT_INSTANCE = new Preferences$TrackingConfigurationParams()));
    }
    
    private Preferences$TrackingConfigurationParams() {
    }
    
    static Preferences$TrackingConfigurationParams access$9000() {
        return Preferences$TrackingConfigurationParams.DEFAULT_INSTANCE;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd parser;
                if ((parser = Preferences$TrackingConfigurationParams.PARSER) == null) {
                    synchronized (Preferences$TrackingConfigurationParams.class) {
                        if (Preferences$TrackingConfigurationParams.PARSER == null) {
                            Preferences$TrackingConfigurationParams.PARSER = (ahdd)new ahba((ahbh)Preferences$TrackingConfigurationParams.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return Preferences$TrackingConfigurationParams.DEFAULT_INSTANCE;
            }
            case 4: {
                return new Preferences$TrackingConfigurationParams$Builder(null);
            }
            case 3: {
                return new Preferences$TrackingConfigurationParams();
            }
            case 2: {
                return newMessageInfo((MessageLite)Preferences$TrackingConfigurationParams.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "bitField0_", "controllerConfigType_", Preferences$ControllerConfigurationType.internalGetVerifier() });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}

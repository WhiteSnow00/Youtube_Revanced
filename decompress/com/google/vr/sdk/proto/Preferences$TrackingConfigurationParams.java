// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;

public final class Preferences$TrackingConfigurationParams extends agzi implements ahax
{
    public static final int CONTROLLER_CONFIG_TYPE_FIELD_NUMBER = 1;
    private static final Preferences$TrackingConfigurationParams DEFAULT_INSTANCE;
    private static volatile ahbe PARSER;
    private int bitField0_;
    private int controllerConfigType_;
    
    static {
        agzi.registerDefaultInstance(Preferences$TrackingConfigurationParams.class, DEFAULT_INSTANCE = new Preferences$TrackingConfigurationParams());
    }
    
    private Preferences$TrackingConfigurationParams() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe parser;
                if ((parser = Preferences$TrackingConfigurationParams.PARSER) == null) {
                    synchronized (Preferences$TrackingConfigurationParams.class) {
                        if (Preferences$TrackingConfigurationParams.PARSER == null) {
                            Preferences$TrackingConfigurationParams.PARSER = (ahbe)new agzb((agzi)Preferences$TrackingConfigurationParams.DEFAULT_INSTANCE);
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
                return agzi.newMessageInfo((MessageLite)Preferences$TrackingConfigurationParams.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "bitField0_", "controllerConfigType_", Preferences$ControllerConfigurationType.internalGetVerifier() });
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

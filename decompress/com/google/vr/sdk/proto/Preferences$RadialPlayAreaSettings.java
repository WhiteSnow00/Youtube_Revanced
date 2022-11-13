// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;

public final class Preferences$RadialPlayAreaSettings extends ahbh implements ahcw
{
    private static final Preferences$RadialPlayAreaSettings DEFAULT_INSTANCE;
    private static volatile ahdd PARSER;
    public static final int RADIUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private float radius_;
    
    static {
        ahbh.registerDefaultInstance((Class)Preferences$RadialPlayAreaSettings.class, (ahbh)(DEFAULT_INSTANCE = new Preferences$RadialPlayAreaSettings()));
    }
    
    private Preferences$RadialPlayAreaSettings() {
    }
    
    static Preferences$RadialPlayAreaSettings access$9400() {
        return Preferences$RadialPlayAreaSettings.DEFAULT_INSTANCE;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd parser;
                if ((parser = Preferences$RadialPlayAreaSettings.PARSER) == null) {
                    synchronized (Preferences$RadialPlayAreaSettings.class) {
                        if (Preferences$RadialPlayAreaSettings.PARSER == null) {
                            Preferences$RadialPlayAreaSettings.PARSER = (ahdd)new ahba((ahbh)Preferences$RadialPlayAreaSettings.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return Preferences$RadialPlayAreaSettings.DEFAULT_INSTANCE;
            }
            case 4: {
                return new Preferences$RadialPlayAreaSettings$Builder(null);
            }
            case 3: {
                return new Preferences$RadialPlayAreaSettings();
            }
            case 2: {
                return newMessageInfo((MessageLite)Preferences$RadialPlayAreaSettings.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "bitField0_", "radius_" });
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

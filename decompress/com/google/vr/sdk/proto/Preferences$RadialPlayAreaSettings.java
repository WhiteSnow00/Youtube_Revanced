// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;

public final class Preferences$RadialPlayAreaSettings extends agzi implements ahax
{
    private static final Preferences$RadialPlayAreaSettings DEFAULT_INSTANCE;
    private static volatile ahbe PARSER;
    public static final int RADIUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private float radius_;
    
    static {
        agzi.registerDefaultInstance(Preferences$RadialPlayAreaSettings.class, DEFAULT_INSTANCE = new Preferences$RadialPlayAreaSettings());
    }
    
    private Preferences$RadialPlayAreaSettings() {
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
                if ((parser = Preferences$RadialPlayAreaSettings.PARSER) == null) {
                    synchronized (Preferences$RadialPlayAreaSettings.class) {
                        if (Preferences$RadialPlayAreaSettings.PARSER == null) {
                            Preferences$RadialPlayAreaSettings.PARSER = (ahbe)new agzb((agzi)Preferences$RadialPlayAreaSettings.DEFAULT_INSTANCE);
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
                return agzi.newMessageInfo((MessageLite)Preferences$RadialPlayAreaSettings.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "bitField0_", "radius_" });
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

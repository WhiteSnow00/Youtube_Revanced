// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;

public final class Preferences$RuntimeFeature extends agzi implements ahax
{
    private static final Preferences$RuntimeFeature DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile ahbe PARSER;
    private int bitField0_;
    private boolean enabled_;
    private int id_;
    
    static {
        agzi.registerDefaultInstance(Preferences$RuntimeFeature.class, DEFAULT_INSTANCE = new Preferences$RuntimeFeature());
    }
    
    private Preferences$RuntimeFeature() {
        this.id_ = -1;
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
                if ((parser = Preferences$RuntimeFeature.PARSER) == null) {
                    synchronized (Preferences$RuntimeFeature.class) {
                        if (Preferences$RuntimeFeature.PARSER == null) {
                            Preferences$RuntimeFeature.PARSER = (ahbe)new agzb((agzi)Preferences$RuntimeFeature.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return Preferences$RuntimeFeature.DEFAULT_INSTANCE;
            }
            case 4: {
                return new Preferences$RuntimeFeature$Builder(null);
            }
            case 3: {
                return new Preferences$RuntimeFeature();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)Preferences$RuntimeFeature.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1007\u0001", new Object[] { "bitField0_", "id_", "enabled_" });
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

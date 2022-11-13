// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;

public final class Preferences$RuntimeFeature extends ahbh implements ahcw
{
    private static final Preferences$RuntimeFeature DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile ahdd PARSER;
    private int bitField0_;
    private boolean enabled_;
    private int id_;
    
    static {
        ahbh.registerDefaultInstance((Class)Preferences$RuntimeFeature.class, (ahbh)(DEFAULT_INSTANCE = new Preferences$RuntimeFeature()));
    }
    
    private Preferences$RuntimeFeature() {
        this.id_ = -1;
    }
    
    static Preferences$RuntimeFeature access$11000() {
        return Preferences$RuntimeFeature.DEFAULT_INSTANCE;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd parser;
                if ((parser = Preferences$RuntimeFeature.PARSER) == null) {
                    synchronized (Preferences$RuntimeFeature.class) {
                        if (Preferences$RuntimeFeature.PARSER == null) {
                            Preferences$RuntimeFeature.PARSER = (ahdd)new ahba((ahbh)Preferences$RuntimeFeature.DEFAULT_INSTANCE);
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
                return newMessageInfo((MessageLite)Preferences$RuntimeFeature.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1007\u0001", new Object[] { "bitField0_", "id_", "enabled_" });
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

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;

public final class Preferences$PlayAreaSettings extends ahbh implements ahcw
{
    public static final int ANCHOR_IDS_FIELD_NUMBER = 1;
    private static final Preferences$PlayAreaSettings DEFAULT_INSTANCE;
    private static volatile ahdd PARSER;
    public static final int PLAY_AREA_TYPE_FIELD_NUMBER = 2;
    public static final int RADIAL_PLAY_AREA_FIELD_NUMBER = 3;
    private ahbx anchorIds_;
    private int bitField0_;
    private int playAreaType_;
    private Preferences$RadialPlayAreaSettings radialPlayArea_;
    
    static {
        ahbh.registerDefaultInstance((Class)Preferences$PlayAreaSettings.class, (ahbh)(DEFAULT_INSTANCE = new Preferences$PlayAreaSettings()));
    }
    
    private Preferences$PlayAreaSettings() {
        this.anchorIds_ = ahbh.emptyProtobufList();
    }
    
    static Preferences$PlayAreaSettings access$9800() {
        return Preferences$PlayAreaSettings.DEFAULT_INSTANCE;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd parser;
                if ((parser = Preferences$PlayAreaSettings.PARSER) == null) {
                    synchronized (Preferences$PlayAreaSettings.class) {
                        if (Preferences$PlayAreaSettings.PARSER == null) {
                            Preferences$PlayAreaSettings.PARSER = (ahdd)new ahba((ahbh)Preferences$PlayAreaSettings.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return Preferences$PlayAreaSettings.DEFAULT_INSTANCE;
            }
            case 4: {
                return new Preferences$PlayAreaSettings$Builder(null);
            }
            case 3: {
                return new Preferences$PlayAreaSettings();
            }
            case 2: {
                return newMessageInfo((MessageLite)Preferences$PlayAreaSettings.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002\u100c\u0000\u0003\u1009\u0001", new Object[] { "bitField0_", "anchorIds_", "playAreaType_", Preferences$PlayAreaType.internalGetVerifier(), "radialPlayArea_" });
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

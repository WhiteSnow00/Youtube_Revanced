// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;

public final class CardboardDevice$ScreenAlignmentMarker extends ahbh implements ahcw
{
    private static final CardboardDevice$ScreenAlignmentMarker DEFAULT_INSTANCE;
    public static final int HORIZONTAL_FIELD_NUMBER = 1;
    private static volatile ahdd PARSER;
    public static final int VERTICAL_FIELD_NUMBER = 2;
    private int bitField0_;
    private float horizontal_;
    private float vertical_;
    
    static {
        ahbh.registerDefaultInstance((Class)CardboardDevice$ScreenAlignmentMarker.class, (ahbh)(DEFAULT_INSTANCE = new CardboardDevice$ScreenAlignmentMarker()));
    }
    
    private CardboardDevice$ScreenAlignmentMarker() {
    }
    
    static CardboardDevice$ScreenAlignmentMarker access$9600() {
        return CardboardDevice$ScreenAlignmentMarker.DEFAULT_INSTANCE;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd parser;
                if ((parser = CardboardDevice$ScreenAlignmentMarker.PARSER) == null) {
                    synchronized (CardboardDevice$ScreenAlignmentMarker.class) {
                        if (CardboardDevice$ScreenAlignmentMarker.PARSER == null) {
                            CardboardDevice$ScreenAlignmentMarker.PARSER = (ahdd)new ahba((ahbh)CardboardDevice$ScreenAlignmentMarker.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return CardboardDevice$ScreenAlignmentMarker.DEFAULT_INSTANCE;
            }
            case 4: {
                return new CardboardDevice$ScreenAlignmentMarker$Builder(null);
            }
            case 3: {
                return new CardboardDevice$ScreenAlignmentMarker();
            }
            case 2: {
                return newMessageInfo((MessageLite)CardboardDevice$ScreenAlignmentMarker.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001", new Object[] { "bitField0_", "horizontal_", "vertical_" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public float getHorizontal() {
        return this.horizontal_;
    }
    
    public float getVertical() {
        return this.vertical_;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;

public final class CardboardDevice$VignetteParams extends agzi implements ahax
{
    public static final int CONDITION_FIELD_NUMBER = 2;
    private static final CardboardDevice$VignetteParams DEFAULT_INSTANCE;
    private static volatile ahbe PARSER;
    public static final int VALUE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int condition_;
    private float value_;
    
    static {
        agzi.registerDefaultInstance((Class)CardboardDevice$VignetteParams.class, (agzi)(DEFAULT_INSTANCE = new CardboardDevice$VignetteParams()));
    }
    
    private CardboardDevice$VignetteParams() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe parser;
                if ((parser = CardboardDevice$VignetteParams.PARSER) == null) {
                    synchronized (CardboardDevice$VignetteParams.class) {
                        if (CardboardDevice$VignetteParams.PARSER == null) {
                            CardboardDevice$VignetteParams.PARSER = (ahbe)new agzb((agzi)CardboardDevice$VignetteParams.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return CardboardDevice$VignetteParams.DEFAULT_INSTANCE;
            }
            case 4: {
                return new CardboardDevice$VignetteParams$Builder(null);
            }
            case 3: {
                return new CardboardDevice$VignetteParams();
            }
            case 2: {
                return newMessageInfo((MessageLite)CardboardDevice$VignetteParams.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u100c\u0000\u0003\u1001\u0001", new Object[] { "bitField0_", "condition_", CardboardDevice$VignetteParams$VignetteParamsCondition.internalGetVerifier(), "value_" });
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

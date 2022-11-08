// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import java.util.List;
import com.google.protobuf.MessageLite;

public final class CardboardDevice$DeviceParamsList extends agzi implements ahax
{
    private static final CardboardDevice$DeviceParamsList DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile ahbe PARSER;
    private agzy params_;
    
    static {
        agzi.registerDefaultInstance((Class)CardboardDevice$DeviceParamsList.class, (agzi)(DEFAULT_INSTANCE = new CardboardDevice$DeviceParamsList()));
    }
    
    private CardboardDevice$DeviceParamsList() {
        this.params_ = emptyProtobufList();
    }
    
    public static CardboardDevice$DeviceParamsList getDefaultInstance() {
        return CardboardDevice$DeviceParamsList.DEFAULT_INSTANCE;
    }
    
    public static CardboardDevice$DeviceParamsList$Builder newBuilder() {
        return (CardboardDevice$DeviceParamsList$Builder)CardboardDevice$DeviceParamsList.DEFAULT_INSTANCE.createBuilder();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe parser;
                if ((parser = CardboardDevice$DeviceParamsList.PARSER) == null) {
                    synchronized (CardboardDevice$DeviceParamsList.class) {
                        if (CardboardDevice$DeviceParamsList.PARSER == null) {
                            CardboardDevice$DeviceParamsList.PARSER = (ahbe)new agzb((agzi)CardboardDevice$DeviceParamsList.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return CardboardDevice$DeviceParamsList.DEFAULT_INSTANCE;
            }
            case 4: {
                return new CardboardDevice$DeviceParamsList$Builder(null);
            }
            case 3: {
                return new CardboardDevice$DeviceParamsList();
            }
            case 2: {
                return newMessageInfo((MessageLite)CardboardDevice$DeviceParamsList.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "params_", CardboardDevice$DeviceParams.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public List getParamsList() {
        return this.params_;
    }
}

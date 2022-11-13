// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import java.util.List;
import com.google.protobuf.MessageLite;

public final class CardboardDevice$DeviceParamsList extends ahbh implements ahcw
{
    private static final CardboardDevice$DeviceParamsList DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile ahdd PARSER;
    private ahbx params_;
    
    static {
        ahbh.registerDefaultInstance((Class)CardboardDevice$DeviceParamsList.class, (ahbh)(DEFAULT_INSTANCE = new CardboardDevice$DeviceParamsList()));
    }
    
    private CardboardDevice$DeviceParamsList() {
        this.params_ = emptyProtobufList();
    }
    
    static CardboardDevice$DeviceParamsList access$10200() {
        return CardboardDevice$DeviceParamsList.DEFAULT_INSTANCE;
    }
    
    public static CardboardDevice$DeviceParamsList getDefaultInstance() {
        return CardboardDevice$DeviceParamsList.DEFAULT_INSTANCE;
    }
    
    public static CardboardDevice$DeviceParamsList$Builder newBuilder() {
        return (CardboardDevice$DeviceParamsList$Builder)CardboardDevice$DeviceParamsList.DEFAULT_INSTANCE.createBuilder();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd parser;
                if ((parser = CardboardDevice$DeviceParamsList.PARSER) == null) {
                    synchronized (CardboardDevice$DeviceParamsList.class) {
                        if (CardboardDevice$DeviceParamsList.PARSER == null) {
                            CardboardDevice$DeviceParamsList.PARSER = (ahdd)new ahba((ahbh)CardboardDevice$DeviceParamsList.DEFAULT_INSTANCE);
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
        return (List)this.params_;
    }
}

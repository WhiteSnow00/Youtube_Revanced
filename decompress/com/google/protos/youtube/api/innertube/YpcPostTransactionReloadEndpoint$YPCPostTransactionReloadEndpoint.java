// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint extends agzi implements ahax
{
    public static final YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint a;
    private static volatile ahbe b;
    public static final agzg ypcPostTransactionReloadEndpoint;
    
    static {
        final YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint a2 = new YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint();
        agzi.registerDefaultInstance((Class)YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint.class, (agzi)(a = a2));
        ypcPostTransactionReloadEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 339342808, ahcm.k, (Class)YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint.class);
    }
    
    private YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint.b) == null) {
                    synchronized (YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint.class) {
                        if (YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint.b == null) {
                            YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint.b = (ahbe)new agzb((agzi)YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint.a;
            }
            case 4: {
                return new agza((agzi)YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint.a);
            }
            case 3: {
                return new YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint.a, "\u0001\u0000", (Object[])null);
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

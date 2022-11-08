// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint extends agzi implements ahax
{
    public static final YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint a;
    private static volatile ahbe c;
    public static final agzg ypcTipTransactionEndpoint;
    public String b;
    private int d;
    
    static {
        final YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint a2 = new YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint();
        agzi.registerDefaultInstance((Class)YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.class, (agzi)(a = a2));
        ypcTipTransactionEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 65099913, ahcm.k, (Class)YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.class);
    }
    
    private YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.c) == null) {
                    synchronized (YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.class) {
                        if (YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.c == null) {
                            YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.c = (ahbe)new agzb((agzi)YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.a;
            }
            case 4: {
                return new agza((agzi)YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.a);
            }
            case 3: {
                return new YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

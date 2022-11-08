// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint extends agzi implements ahax
{
    public static final YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint a;
    private static volatile ahbe d;
    public static final agzg ypcCompleteTransactionEndpoint;
    public String b;
    public agyc c;
    private int e;
    private byte f;
    
    static {
        final YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint a2 = new YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint();
        agzi.registerDefaultInstance((Class)YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.class, (agzi)(a = a2));
        ypcCompleteTransactionEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 137730199, ahcm.k, (Class)YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.class);
    }
    
    private YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint() {
        this.f = 2;
        this.b = "";
        emptyProtobufList();
        this.c = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.d) == null) {
                    synchronized (YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.class) {
                        if (YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.d == null) {
                            YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.d = (ahbe)new agzb((agzi)YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.a;
            }
            case 4: {
                return new agza((agzi)YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.a);
            }
            case 3: {
                return new YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u100a\u0002", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}

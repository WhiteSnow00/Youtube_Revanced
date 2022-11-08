// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint extends agzi implements ahax
{
    public static final YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint a;
    private static volatile ahbe j;
    public static final agzg ypcHandleTransactionEndpoint;
    public int b;
    public String c;
    public String d;
    public agyc e;
    public int f;
    public aotv g;
    public boolean h;
    public agzy i;
    
    static {
        final YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint a2 = new YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint();
        agzi.registerDefaultInstance((Class)YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.class, (agzi)(a = a2));
        ypcHandleTransactionEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 165047913, ahcm.k, (Class)YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.class);
    }
    
    private YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint() {
        this.c = "";
        this.d = "";
        this.e = agyc.b;
        this.i = agzi.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe j;
                if ((j = YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.j) == null) {
                    synchronized (YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.class) {
                        if (YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.j == null) {
                            YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.j = (ahbe)new agzb((agzi)YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.a;
            }
            case 4: {
                return new agza((agzi)YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.a);
            }
            case 3: {
                return new YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100a\u0002\u0004\u100c\u0003\u0005\u1009\u0004\u0006\u001a\u0007\u1007\u0005", new Object[] { "b", "c", "d", "e", "f", aotc.e, "g", "i", "h" });
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

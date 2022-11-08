// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint extends agzi implements ahax
{
    public static final YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint a;
    private static volatile ahbe f;
    public static final agzg ypcCancelRecurrenceEndpoint;
    public String b;
    public String c;
    public apve d;
    public agyc e;
    private int g;
    
    static {
        final YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint a2 = new YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint();
        agzi.registerDefaultInstance((Class)YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.class, (agzi)(a = a2));
        ypcCancelRecurrenceEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 88642421, ahcm.k, (Class)YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.class);
    }
    
    private YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint() {
        this.b = "";
        this.c = "";
        this.e = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.f) == null) {
                    synchronized (YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.class) {
                        if (YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.f == null) {
                            YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.f = (ahbe)new agzb((agzi)YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.a;
            }
            case 4: {
                return new agza((agzi)YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.a);
            }
            case 3: {
                return new YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0002\u0003\u100a\u0003\u0004\u1008\u0001", new Object[] { "g", "b", "d", "e", "c" });
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

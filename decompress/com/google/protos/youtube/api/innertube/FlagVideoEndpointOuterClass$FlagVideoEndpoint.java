// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class FlagVideoEndpointOuterClass$FlagVideoEndpoint extends agzi implements ahax
{
    public static final FlagVideoEndpointOuterClass$FlagVideoEndpoint a;
    private static volatile ahbe c;
    public static final agzg flagVideoEndpoint;
    public String b;
    private int d;
    
    static {
        final FlagVideoEndpointOuterClass$FlagVideoEndpoint a2 = new FlagVideoEndpointOuterClass$FlagVideoEndpoint();
        agzi.registerDefaultInstance((Class)FlagVideoEndpointOuterClass$FlagVideoEndpoint.class, (agzi)(a = a2));
        flagVideoEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 74232392, ahcm.k, (Class)FlagVideoEndpointOuterClass$FlagVideoEndpoint.class);
    }
    
    private FlagVideoEndpointOuterClass$FlagVideoEndpoint() {
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
                if ((c = FlagVideoEndpointOuterClass$FlagVideoEndpoint.c) == null) {
                    synchronized (FlagVideoEndpointOuterClass$FlagVideoEndpoint.class) {
                        if (FlagVideoEndpointOuterClass$FlagVideoEndpoint.c == null) {
                            FlagVideoEndpointOuterClass$FlagVideoEndpoint.c = (ahbe)new agzb((agzi)FlagVideoEndpointOuterClass$FlagVideoEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return FlagVideoEndpointOuterClass$FlagVideoEndpoint.a;
            }
            case 4: {
                return new agza((agzi)FlagVideoEndpointOuterClass$FlagVideoEndpoint.a);
            }
            case 3: {
                return new FlagVideoEndpointOuterClass$FlagVideoEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)FlagVideoEndpointOuterClass$FlagVideoEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

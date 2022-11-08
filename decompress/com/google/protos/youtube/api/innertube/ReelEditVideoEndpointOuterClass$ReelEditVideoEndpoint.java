// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint extends agzi implements ahax
{
    public static final ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint a;
    private static volatile ahbe c;
    public static final agzg reelEditVideoEndpoint;
    public anss b;
    private int d;
    private byte e;
    
    static {
        final ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint a2 = new ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint();
        agzi.registerDefaultInstance((Class)ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.class, (agzi)(a = a2));
        reelEditVideoEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 153734793, ahcm.k, (Class)ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.class);
    }
    
    private ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint() {
        this.e = 2;
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
                final ahbe c;
                if ((c = ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.c) == null) {
                    synchronized (ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.class) {
                        if (ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.c == null) {
                            ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.c = (ahbe)new agzb((agzi)ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.a);
            }
            case 3: {
                return new ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}

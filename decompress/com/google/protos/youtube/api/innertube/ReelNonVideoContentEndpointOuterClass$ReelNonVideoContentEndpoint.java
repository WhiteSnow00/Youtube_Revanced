// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint extends agzi implements ahax
{
    public static final ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint a;
    private static volatile ahbe c;
    public static final agzg reelNonVideoContentEndpoint;
    public anss b;
    private int d;
    private byte e;
    
    static {
        final ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint a2 = new ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint();
        agzi.registerDefaultInstance((Class)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.class, (agzi)(a = a2));
        reelNonVideoContentEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 394709859, ahcm.k, (Class)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.class);
    }
    
    private ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint() {
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
                if ((c = ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.c) == null) {
                    synchronized (ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.class) {
                        if (ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.c == null) {
                            ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.c = (ahbe)new agzb((agzi)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.a);
            }
            case 3: {
                return new ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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

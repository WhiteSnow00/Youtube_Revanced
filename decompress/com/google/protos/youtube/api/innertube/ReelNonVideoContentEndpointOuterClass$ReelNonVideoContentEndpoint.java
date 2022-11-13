// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint extends ahbh implements ahcw
{
    public static final ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint a;
    private static volatile ahdd c;
    public static final ahbf reelNonVideoContentEndpoint;
    public anuv b;
    private int d;
    private byte e;
    
    static {
        final ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint a2 = new ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint();
        ahbh.registerDefaultInstance((Class)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.class, (ahbh)(a = a2));
        reelNonVideoContentEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 394709859, ahek.k, (Class)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.class);
    }
    
    private ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.c) == null) {
                    synchronized (ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.class) {
                        if (ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.c == null) {
                            ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.c = (ahdd)new ahba((ahbh)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.a);
            }
            case 3: {
                return new ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}

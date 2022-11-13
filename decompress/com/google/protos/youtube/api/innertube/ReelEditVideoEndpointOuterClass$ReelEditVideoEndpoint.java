// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint extends ahbh implements ahcw
{
    public static final ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint a;
    private static volatile ahdd c;
    public static final ahbf reelEditVideoEndpoint;
    public anuv b;
    private int d;
    private byte e;
    
    static {
        final ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint a2 = new ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint();
        ahbh.registerDefaultInstance((Class)ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.class, (ahbh)(a = a2));
        reelEditVideoEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 153734793, ahek.k, (Class)ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.class);
    }
    
    private ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint() {
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
                if ((c = ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.c) == null) {
                    synchronized (ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.class) {
                        if (ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.c == null) {
                            ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.c = (ahdd)new ahba((ahbh)ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.a);
            }
            case 3: {
                return new ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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

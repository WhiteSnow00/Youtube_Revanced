// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PingingEndpointOuterClass$PingingEndpoint extends ahbh implements ahcw
{
    public static final PingingEndpointOuterClass$PingingEndpoint a;
    private static volatile ahdd d;
    public static final ahbf pingingEndpoint;
    public int b;
    public boolean c;
    
    static {
        final PingingEndpointOuterClass$PingingEndpoint a2 = new PingingEndpointOuterClass$PingingEndpoint();
        ahbh.registerDefaultInstance((Class)PingingEndpointOuterClass$PingingEndpoint.class, (ahbh)(a = a2));
        pingingEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 98444775, ahek.k, (Class)PingingEndpointOuterClass$PingingEndpoint.class);
    }
    
    private PingingEndpointOuterClass$PingingEndpoint() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = PingingEndpointOuterClass$PingingEndpoint.d) == null) {
                    synchronized (PingingEndpointOuterClass$PingingEndpoint.class) {
                        if (PingingEndpointOuterClass$PingingEndpoint.d == null) {
                            PingingEndpointOuterClass$PingingEndpoint.d = (ahdd)new ahba((ahbh)PingingEndpointOuterClass$PingingEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return PingingEndpointOuterClass$PingingEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)PingingEndpointOuterClass$PingingEndpoint.a);
            }
            case 3: {
                return new PingingEndpointOuterClass$PingingEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)PingingEndpointOuterClass$PingingEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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

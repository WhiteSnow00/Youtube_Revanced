// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PingingEndpointOuterClass$PingingEndpoint extends agzi implements ahax
{
    public static final PingingEndpointOuterClass$PingingEndpoint a;
    private static volatile ahbe d;
    public static final agzg pingingEndpoint;
    public int b;
    public boolean c;
    
    static {
        final PingingEndpointOuterClass$PingingEndpoint a2 = new PingingEndpointOuterClass$PingingEndpoint();
        agzi.registerDefaultInstance((Class)PingingEndpointOuterClass$PingingEndpoint.class, (agzi)(a = a2));
        pingingEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 98444775, ahcm.k, (Class)PingingEndpointOuterClass$PingingEndpoint.class);
    }
    
    private PingingEndpointOuterClass$PingingEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = PingingEndpointOuterClass$PingingEndpoint.d) == null) {
                    synchronized (PingingEndpointOuterClass$PingingEndpoint.class) {
                        if (PingingEndpointOuterClass$PingingEndpoint.d == null) {
                            PingingEndpointOuterClass$PingingEndpoint.d = (ahbe)new agzb((agzi)PingingEndpointOuterClass$PingingEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return PingingEndpointOuterClass$PingingEndpoint.a;
            }
            case 4: {
                return new agza((agzi)PingingEndpointOuterClass$PingingEndpoint.a);
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

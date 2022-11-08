// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class FlagEndpointOuterClass$FlagEndpoint extends agzi implements ahax
{
    public static final FlagEndpointOuterClass$FlagEndpoint a;
    private static volatile ahbe d;
    public static final agzg flagEndpoint;
    public String b;
    public int c;
    private int e;
    
    static {
        final FlagEndpointOuterClass$FlagEndpoint a2 = new FlagEndpointOuterClass$FlagEndpoint();
        agzi.registerDefaultInstance((Class)FlagEndpointOuterClass$FlagEndpoint.class, (agzi)(a = a2));
        flagEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 76638993, ahcm.k, (Class)FlagEndpointOuterClass$FlagEndpoint.class);
    }
    
    private FlagEndpointOuterClass$FlagEndpoint() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = FlagEndpointOuterClass$FlagEndpoint.d) == null) {
                    synchronized (FlagEndpointOuterClass$FlagEndpoint.class) {
                        if (FlagEndpointOuterClass$FlagEndpoint.d == null) {
                            FlagEndpointOuterClass$FlagEndpoint.d = (ahbe)new agzb((agzi)FlagEndpointOuterClass$FlagEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return FlagEndpointOuterClass$FlagEndpoint.a;
            }
            case 4: {
                return new agza((agzi)FlagEndpointOuterClass$FlagEndpoint.a);
            }
            case 3: {
                return new FlagEndpointOuterClass$FlagEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)FlagEndpointOuterClass$FlagEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u100c\u0002", new Object[] { "e", "b", "c", ajoa.s });
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

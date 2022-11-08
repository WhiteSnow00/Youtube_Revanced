// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint extends agzi implements ahax
{
    public static final ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint a;
    private static volatile ahbe c;
    public static final agzg replaceCompanionEndpoint;
    public String b;
    private int d;
    
    static {
        final ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint a2 = new ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint();
        agzi.registerDefaultInstance((Class)ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.class, (agzi)(a = a2));
        replaceCompanionEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 167146950, ahcm.k, (Class)ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.class);
    }
    
    private ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint() {
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
                if ((c = ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.c) == null) {
                    synchronized (ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.class) {
                        if (ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.c == null) {
                            ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.c = (ahbe)new agzb((agzi)ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.a);
            }
            case 3: {
                return new ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

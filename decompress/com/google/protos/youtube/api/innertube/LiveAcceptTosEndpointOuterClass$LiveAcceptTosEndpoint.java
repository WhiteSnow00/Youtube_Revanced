// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint extends agzi implements ahax
{
    public static final LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint a;
    private static volatile ahbe b;
    public static final agzg liveAcceptTosEndpoint;
    
    static {
        final LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint a2 = new LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint();
        agzi.registerDefaultInstance((Class)LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.class, (agzi)(a = a2));
        liveAcceptTosEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 129686418, ahcm.k, (Class)LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.class);
    }
    
    private LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.b) == null) {
                    synchronized (LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.class) {
                        if (LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.b == null) {
                            LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.b = (ahbe)new agzb((agzi)LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.a;
            }
            case 4: {
                return new agza((agzi)LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.a);
            }
            case 3: {
                return new LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.a, "\u0001\u0000", (Object[])null);
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

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint extends agzi implements ahax
{
    public static final GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint a;
    private static volatile ahbe c;
    public static final agzg getBroadcastSetupEndpoint;
    public String b;
    private int d;
    
    static {
        final GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint a2 = new GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint();
        agzi.registerDefaultInstance((Class)GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.class, (agzi)(a = a2));
        getBroadcastSetupEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 147869735, ahcm.k, (Class)GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.class);
    }
    
    private GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint() {
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
                if ((c = GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.c) == null) {
                    synchronized (GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.class) {
                        if (GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.c == null) {
                            GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.c = (ahbe)new agzb((agzi)GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.a;
            }
            case 4: {
                return new agza((agzi)GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.a);
            }
            case 3: {
                return new GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint extends agzi implements ahax
{
    public static final GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint a;
    private static volatile ahbe d;
    public static final agzg getScheduledBroadcastsEndpoint;
    public int b;
    public int c;
    private byte e;
    
    static {
        final GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint a2 = new GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint();
        agzi.registerDefaultInstance((Class)GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.class, (agzi)(a = a2));
        getScheduledBroadcastsEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 147074744, ahcm.k, (Class)GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.class);
    }
    
    private GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint() {
        this.e = 2;
        emptyProtobufList();
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
                final ahbe d;
                if ((d = GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.d) == null) {
                    synchronized (GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.class) {
                        if (GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.d == null) {
                            GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.d = (ahbe)new agzb((agzi)GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.a;
            }
            case 4: {
                return new agza((agzi)GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.a);
            }
            case 3: {
                return new GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u100c\u0002", new Object[] { "b", "c", ahzk.h });
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

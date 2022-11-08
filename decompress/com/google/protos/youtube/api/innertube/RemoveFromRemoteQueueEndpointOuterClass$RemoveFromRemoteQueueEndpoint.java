// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint extends agzi implements ahax
{
    public static final RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint a;
    private static volatile ahbe c;
    public static final agzg removeFromRemoteQueueEndpoint;
    public String b;
    private int d;
    private byte e;
    
    static {
        final RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint a2 = new RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint();
        agzi.registerDefaultInstance((Class)RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.class, (agzi)(a = a2));
        removeFromRemoteQueueEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 64982798, ahcm.k, (Class)RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.class);
    }
    
    private RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint() {
        this.e = 2;
        this.b = "";
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
                final ahbe c;
                if ((c = RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.c) == null) {
                    synchronized (RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.class) {
                        if (RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.c == null) {
                            RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.c = (ahbe)new agzb((agzi)RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.a;
            }
            case 4: {
                return new agza((agzi)RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.a);
            }
            case 3: {
                return new RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint extends agzi implements ahax
{
    public static final AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint a;
    public static final agzg addToRemoteQueueEndpoint;
    private static volatile ahbe d;
    public String b;
    public String c;
    private int e;
    private byte f;
    
    static {
        final AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint a2 = new AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint();
        agzi.registerDefaultInstance((Class)AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.class, (agzi)(a = a2));
        addToRemoteQueueEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 76177954, ahcm.k, (Class)AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.class);
    }
    
    private AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint() {
        this.f = 2;
        this.b = "";
        this.c = "";
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
                if ((d = AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.d) == null) {
                    synchronized (AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.class) {
                        if (AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.d == null) {
                            AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.d = (ahbe)new agzb((agzi)AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.a;
            }
            case 4: {
                return new agza((agzi)AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.a);
            }
            case 3: {
                return new AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}

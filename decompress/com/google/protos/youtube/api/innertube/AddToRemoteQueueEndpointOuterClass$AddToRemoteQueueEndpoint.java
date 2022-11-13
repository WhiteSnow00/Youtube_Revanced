// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint extends ahbh implements ahcw
{
    public static final AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint a;
    public static final ahbf addToRemoteQueueEndpoint;
    private static volatile ahdd d;
    public String b;
    public String c;
    private int e;
    private byte f;
    
    static {
        final AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint a2 = new AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint();
        ahbh.registerDefaultInstance((Class)AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.class, (ahbh)(a = a2));
        addToRemoteQueueEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 76177954, ahek.k, (Class)AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.class);
    }
    
    private AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint() {
        this.f = 2;
        this.b = "";
        this.c = "";
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.d) == null) {
                    synchronized (AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.class) {
                        if (AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.d == null) {
                            AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.d = (ahdd)new ahba((ahbh)AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.a);
            }
            case 3: {
                return new AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}

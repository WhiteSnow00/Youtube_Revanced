// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint extends ahbh implements ahcw
{
    public static final RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint a;
    private static volatile ahdd c;
    public static final ahbf removeFromRemoteQueueEndpoint;
    public String b;
    private int d;
    private byte e;
    
    static {
        final RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint a2 = new RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint();
        ahbh.registerDefaultInstance((Class)RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.class, (ahbh)(a = a2));
        removeFromRemoteQueueEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 64982798, ahek.k, (Class)RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.class);
    }
    
    private RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint() {
        this.e = 2;
        this.b = "";
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.c) == null) {
                    synchronized (RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.class) {
                        if (RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.c == null) {
                            RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.c = (ahdd)new ahba((ahbh)RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.a);
            }
            case 3: {
                return new RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}

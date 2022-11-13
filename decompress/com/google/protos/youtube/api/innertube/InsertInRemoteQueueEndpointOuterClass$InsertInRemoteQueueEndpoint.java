// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint extends ahbh implements ahcw
{
    public static final InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint a;
    private static volatile ahdd d;
    public static final ahbf insertInRemoteQueueEndpoint;
    public String b;
    public String c;
    private int e;
    private byte f;
    
    static {
        final InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint a2 = new InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint();
        ahbh.registerDefaultInstance((Class)InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.class, (ahbh)(a = a2));
        insertInRemoteQueueEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 122330696, ahek.k, (Class)InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.class);
    }
    
    private InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint() {
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
                if ((d = InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.d) == null) {
                    synchronized (InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.class) {
                        if (InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.d == null) {
                            InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.d = (ahdd)new ahba((ahbh)InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.a);
            }
            case 3: {
                return new InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "e", "b", "c" });
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

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint extends agzi implements ahax
{
    public static final InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint a;
    private static volatile ahbe d;
    public static final agzg insertInRemoteQueueEndpoint;
    public String b;
    public String c;
    private int e;
    private byte f;
    
    static {
        final InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint a2 = new InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint();
        agzi.registerDefaultInstance((Class)InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.class, (agzi)(a = a2));
        insertInRemoteQueueEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 122330696, ahcm.k, (Class)InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.class);
    }
    
    private InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint() {
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
                if ((d = InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.d) == null) {
                    synchronized (InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.class) {
                        if (InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.d == null) {
                            InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.d = (ahbe)new agzb((agzi)InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.a;
            }
            case 4: {
                return new agza((agzi)InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.a);
            }
            case 3: {
                return new InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "e", "b", "c" });
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

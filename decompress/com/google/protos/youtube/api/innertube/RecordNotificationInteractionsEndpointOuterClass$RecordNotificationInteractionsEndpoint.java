// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint extends agzi implements ahax
{
    public static final RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint a;
    private static volatile ahbe d;
    public static final agzg recordNotificationInteractionsEndpoint;
    public agyc b;
    public agzy c;
    private int e;
    private byte f;
    
    static {
        final RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint a2 = new RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint();
        agzi.registerDefaultInstance((Class)RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.class, (agzi)(a = a2));
        recordNotificationInteractionsEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 78414307, ahcm.k, (Class)RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.class);
    }
    
    private RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint() {
        this.f = 2;
        this.b = agyc.b;
        this.c = emptyProtobufList();
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
                if ((d = RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.d) == null) {
                    synchronized (RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.class) {
                        if (RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.d == null) {
                            RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.d = (ahbe)new agzb((agzi)RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.a;
            }
            case 4: {
                return new agza((agzi)RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.a);
            }
            case 3: {
                return new RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u100a\u0000\u0002\u041b", new Object[] { "e", "b", "c", aioe.class });
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

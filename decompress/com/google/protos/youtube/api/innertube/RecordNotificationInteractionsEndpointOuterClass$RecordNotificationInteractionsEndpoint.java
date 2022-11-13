// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint extends ahbh implements ahcw
{
    public static final RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint a;
    private static volatile ahdd d;
    public static final ahbf recordNotificationInteractionsEndpoint;
    public ahab b;
    public ahbx c;
    private int e;
    private byte f;
    
    static {
        final RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint a2 = new RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint();
        ahbh.registerDefaultInstance((Class)RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.class, (ahbh)(a = a2));
        recordNotificationInteractionsEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 78414307, ahek.k, (Class)RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.class);
    }
    
    private RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint() {
        this.f = 2;
        this.b = ahab.b;
        this.c = emptyProtobufList();
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
                if ((d = RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.d) == null) {
                    synchronized (RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.class) {
                        if (RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.d == null) {
                            RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.d = (ahdd)new ahba((ahbh)RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.a);
            }
            case 3: {
                return new RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u100a\u0000\u0002\u041b", new Object[] { "e", "b", "c", aiqj.class });
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

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint extends agzi implements ahax
{
    public static final NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint a;
    private static volatile ahbe g;
    public static final agzg notificationOptOutEndpoint;
    public int b;
    public agyc c;
    public ajsq d;
    public agyc e;
    public agzy f;
    private ajsq h;
    private byte i;
    
    static {
        final NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint a2 = new NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint();
        agzi.registerDefaultInstance((Class)NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.class, (agzi)(a = a2));
        notificationOptOutEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 65091333, ahcm.k, (Class)NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.class);
    }
    
    private NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint() {
        this.i = 2;
        this.c = agyc.b;
        emptyProtobufList();
        this.e = agyc.b;
        this.f = emptyProtobufList();
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
                final ahbe g;
                if ((g = NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.g) == null) {
                    synchronized (NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.class) {
                        if (NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.g == null) {
                            NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.g = (ahbe)new agzb((agzi)NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.a;
            }
            case 4: {
                return new agza((agzi)NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.a);
            }
            case 3: {
                return new NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.a, "\u0001\u0005\u0000\u0001\u0003\t\u0005\u0000\u0001\u0003\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0000\b\u100a\u0004\t\u041b", new Object[] { "b", "h", "d", "c", "e", "f", aioe.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}

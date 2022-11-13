// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint extends ahbh implements ahcw
{
    public static final NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint a;
    private static volatile ahdd g;
    public static final ahbf notificationOptOutEndpoint;
    public int b;
    public ahab c;
    public ajut d;
    public ahab e;
    public ahbx f;
    private ajut h;
    private byte i;
    
    static {
        final NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint a2 = new NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint();
        ahbh.registerDefaultInstance((Class)NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.class, (ahbh)(a = a2));
        notificationOptOutEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 65091333, ahek.k, (Class)NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.class);
    }
    
    private NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint() {
        this.i = 2;
        this.c = ahab.b;
        emptyProtobufList();
        this.e = ahab.b;
        this.f = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.g) == null) {
                    synchronized (NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.class) {
                        if (NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.g == null) {
                            NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.g = (ahdd)new ahba((ahbh)NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.a);
            }
            case 3: {
                return new NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.a, "\u0001\u0005\u0000\u0001\u0003\t\u0005\u0000\u0001\u0003\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0000\b\u100a\u0004\t\u041b", new Object[] { "b", "h", "d", "c", "e", "f", aiqj.class });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}

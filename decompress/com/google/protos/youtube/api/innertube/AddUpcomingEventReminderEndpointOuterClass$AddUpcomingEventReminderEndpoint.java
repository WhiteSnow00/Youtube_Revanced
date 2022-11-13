// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint extends ahbh implements ahcw
{
    public static final AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint a;
    public static final ahbf addUpcomingEventReminderEndpoint;
    private static volatile ahdd c;
    public String b;
    private int d;
    private byte e;
    
    static {
        final AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint a2 = new AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint();
        ahbh.registerDefaultInstance((Class)AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.class, (ahbh)(a = a2));
        addUpcomingEventReminderEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 123790168, ahek.k, (Class)AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.class);
    }
    
    private AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint() {
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
                if ((c = AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.c) == null) {
                    synchronized (AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.class) {
                        if (AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.c == null) {
                            AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.c = (ahdd)new ahba((ahbh)AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.a);
            }
            case 3: {
                return new AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

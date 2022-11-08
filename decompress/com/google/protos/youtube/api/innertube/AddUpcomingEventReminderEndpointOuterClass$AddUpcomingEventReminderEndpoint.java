// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint extends agzi implements ahax
{
    public static final AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint a;
    public static final agzg addUpcomingEventReminderEndpoint;
    private static volatile ahbe c;
    public String b;
    private int d;
    private byte e;
    
    static {
        final AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint a2 = new AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint();
        agzi.registerDefaultInstance((Class)AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.class, (agzi)(a = a2));
        addUpcomingEventReminderEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 123790168, ahcm.k, (Class)AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.class);
    }
    
    private AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint() {
        this.e = 2;
        this.b = "";
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
                final ahbe c;
                if ((c = AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.c) == null) {
                    synchronized (AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.class) {
                        if (AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.c == null) {
                            AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.c = (ahbe)new agzb((agzi)AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.a;
            }
            case 4: {
                return new agza((agzi)AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.a);
            }
            case 3: {
                return new AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}

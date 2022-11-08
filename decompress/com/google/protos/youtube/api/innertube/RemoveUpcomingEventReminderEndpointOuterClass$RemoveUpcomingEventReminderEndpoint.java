// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint extends agzi implements ahax
{
    public static final RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint a;
    private static volatile ahbe c;
    public static final agzg removeUpcomingEventReminderEndpoint;
    public String b;
    private int d;
    private byte e;
    
    static {
        final RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint a2 = new RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint();
        agzi.registerDefaultInstance((Class)RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.class, (agzi)(a = a2));
        removeUpcomingEventReminderEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 124510444, ahcm.k, (Class)RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.class);
    }
    
    private RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint() {
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
                if ((c = RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.c) == null) {
                    synchronized (RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.class) {
                        if (RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.c == null) {
                            RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.c = (ahbe)new agzb((agzi)RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.a;
            }
            case 4: {
                return new agza((agzi)RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.a);
            }
            case 3: {
                return new RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

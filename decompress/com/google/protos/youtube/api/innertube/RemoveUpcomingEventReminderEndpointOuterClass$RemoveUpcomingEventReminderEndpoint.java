// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint extends ahbh implements ahcw
{
    public static final RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint a;
    private static volatile ahdd c;
    public static final ahbf removeUpcomingEventReminderEndpoint;
    public String b;
    private int d;
    private byte e;
    
    static {
        final RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint a2 = new RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint();
        ahbh.registerDefaultInstance((Class)RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.class, (ahbh)(a = a2));
        removeUpcomingEventReminderEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 124510444, ahek.k, (Class)RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.class);
    }
    
    private RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint() {
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
                if ((c = RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.c) == null) {
                    synchronized (RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.class) {
                        if (RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.c == null) {
                            RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.c = (ahdd)new ahba((ahbh)RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.a);
            }
            case 3: {
                return new RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

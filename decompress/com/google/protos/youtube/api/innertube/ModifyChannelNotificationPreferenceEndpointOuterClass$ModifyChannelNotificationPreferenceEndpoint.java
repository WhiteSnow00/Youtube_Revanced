// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint extends ahbh implements ahcw
{
    public static final ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint a;
    private static volatile ahdd h;
    public static final ahbf modifyChannelNotificationPreferenceEndpoint;
    public String b;
    public ahbx c;
    public ahbx d;
    public ahbx e;
    public ahbx f;
    public ahbx g;
    private int i;
    private byte j;
    
    static {
        final ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint a2 = new ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint();
        ahbh.registerDefaultInstance((Class)ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.class, (ahbh)(a = a2));
        modifyChannelNotificationPreferenceEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 90195593, ahek.k, (Class)ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.class);
    }
    
    private ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint() {
        this.j = 2;
        this.b = "";
        this.c = ahbh.emptyProtobufList();
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.h) == null) {
                    synchronized (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.class) {
                        if (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.h == null) {
                            ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.h = (ahdd)new ahba((ahbh)ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.a;
            }
            case 4: {
                return new ahaz((short[][])null, (byte[][])null);
            }
            case 3: {
                return new ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0005\u0004\u0001\u1008\u0000\u0002\u041b\u0003\u001a\u0004\u041b\u0005\u041b\u0006\u041b", new Object[] { "i", "b", "e", aiqj.class, "c", "f", aiqj.class, "g", aiqj.class, "d", aiqj.class });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}

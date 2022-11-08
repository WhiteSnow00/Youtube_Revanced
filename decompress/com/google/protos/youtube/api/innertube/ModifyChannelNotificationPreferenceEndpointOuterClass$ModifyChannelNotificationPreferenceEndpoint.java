// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint extends agzi implements ahax
{
    public static final ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint a;
    private static volatile ahbe h;
    public static final agzg modifyChannelNotificationPreferenceEndpoint;
    public String b;
    public agzy c;
    public agzy d;
    public agzy e;
    public agzy f;
    public agzy g;
    private int i;
    private byte j;
    
    static {
        final ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint a2 = new ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint();
        agzi.registerDefaultInstance((Class)ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.class, (agzi)(a = a2));
        modifyChannelNotificationPreferenceEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 90195593, ahcm.k, (Class)ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.class);
    }
    
    private ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint() {
        this.j = 2;
        this.b = "";
        this.c = agzi.emptyProtobufList();
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = emptyProtobufList();
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
                final ahbe h;
                if ((h = ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.h) == null) {
                    synchronized (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.class) {
                        if (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.h == null) {
                            ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.h = (ahbe)new agzb((agzi)ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.a;
            }
            case 4: {
                return new agza((boolean[][])null, (float[][])null);
            }
            case 3: {
                return new ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0005\u0004\u0001\u1008\u0000\u0002\u041b\u0003\u001a\u0004\u041b\u0005\u041b\u0006\u041b", new Object[] { "i", "b", "e", aioe.class, "c", "f", aioe.class, "g", aioe.class, "d", aioe.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}

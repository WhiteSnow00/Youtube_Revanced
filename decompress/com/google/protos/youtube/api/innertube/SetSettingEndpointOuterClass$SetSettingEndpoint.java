// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SetSettingEndpointOuterClass$SetSettingEndpoint extends agzi implements ahax
{
    public static final SetSettingEndpointOuterClass$SetSettingEndpoint a;
    private static volatile ahbe g;
    public static final agzg setSettingEndpoint;
    public int b;
    public int c;
    public Object d;
    public String e;
    public agzy f;
    private byte h;
    
    static {
        final SetSettingEndpointOuterClass$SetSettingEndpoint a2 = new SetSettingEndpointOuterClass$SetSettingEndpoint();
        agzi.registerDefaultInstance((Class)SetSettingEndpointOuterClass$SetSettingEndpoint.class, (agzi)(a = a2));
        setSettingEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 77872990, ahcm.k, (Class)SetSettingEndpointOuterClass$SetSettingEndpoint.class);
    }
    
    private SetSettingEndpointOuterClass$SetSettingEndpoint() {
        this.c = 0;
        this.h = 2;
        this.e = "";
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
                if ((g = SetSettingEndpointOuterClass$SetSettingEndpoint.g) == null) {
                    synchronized (SetSettingEndpointOuterClass$SetSettingEndpoint.class) {
                        if (SetSettingEndpointOuterClass$SetSettingEndpoint.g == null) {
                            SetSettingEndpointOuterClass$SetSettingEndpoint.g = (ahbe)new agzb((agzi)SetSettingEndpointOuterClass$SetSettingEndpoint.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return SetSettingEndpointOuterClass$SetSettingEndpoint.a;
            }
            case 4: {
                return new agza((agzi)SetSettingEndpointOuterClass$SetSettingEndpoint.a);
            }
            case 3: {
                return new SetSettingEndpointOuterClass$SetSettingEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SetSettingEndpointOuterClass$SetSettingEndpoint.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u103b\u0000\u0003\u103a\u0000\u0004\u1035\u0000\u0005\u041b", new Object[] { "d", "c", "b", "e", "f", aioe.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}

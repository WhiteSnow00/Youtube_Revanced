// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SetSettingEndpointOuterClass$SetSettingEndpoint extends ahbh implements ahcw
{
    public static final SetSettingEndpointOuterClass$SetSettingEndpoint a;
    private static volatile ahdd g;
    public static final ahbf setSettingEndpoint;
    public int b;
    public int c;
    public Object d;
    public String e;
    public ahbx f;
    private byte h;
    
    static {
        final SetSettingEndpointOuterClass$SetSettingEndpoint a2 = new SetSettingEndpointOuterClass$SetSettingEndpoint();
        ahbh.registerDefaultInstance((Class)SetSettingEndpointOuterClass$SetSettingEndpoint.class, (ahbh)(a = a2));
        setSettingEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 77872990, ahek.k, (Class)SetSettingEndpointOuterClass$SetSettingEndpoint.class);
    }
    
    private SetSettingEndpointOuterClass$SetSettingEndpoint() {
        this.c = 0;
        this.h = 2;
        this.e = "";
        this.f = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = SetSettingEndpointOuterClass$SetSettingEndpoint.g) == null) {
                    synchronized (SetSettingEndpointOuterClass$SetSettingEndpoint.class) {
                        if (SetSettingEndpointOuterClass$SetSettingEndpoint.g == null) {
                            SetSettingEndpointOuterClass$SetSettingEndpoint.g = (ahdd)new ahba((ahbh)SetSettingEndpointOuterClass$SetSettingEndpoint.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return SetSettingEndpointOuterClass$SetSettingEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)SetSettingEndpointOuterClass$SetSettingEndpoint.a);
            }
            case 3: {
                return new SetSettingEndpointOuterClass$SetSettingEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SetSettingEndpointOuterClass$SetSettingEndpoint.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u103b\u0000\u0003\u103a\u0000\u0004\u1035\u0000\u0005\u041b", new Object[] { "d", "c", "b", "e", "f", aiqj.class });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}

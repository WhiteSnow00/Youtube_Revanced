// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SetClientSettingEndpointOuterClass$SetClientSettingEndpoint extends ahbh implements ahcw
{
    public static final SetClientSettingEndpointOuterClass$SetClientSettingEndpoint a;
    private static volatile ahdd d;
    public static final ahbf setClientSettingEndpoint;
    public ahbx b;
    public ahbx c;
    private byte e;
    
    static {
        final SetClientSettingEndpointOuterClass$SetClientSettingEndpoint a2 = new SetClientSettingEndpointOuterClass$SetClientSettingEndpoint();
        ahbh.registerDefaultInstance((Class)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class, (ahbh)(a = a2));
        setClientSettingEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 81212182, ahek.k, (Class)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class);
    }
    
    private SetClientSettingEndpointOuterClass$SetClientSettingEndpoint() {
        this.e = 2;
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
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
                final ahdd d;
                if ((d = SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.d) == null) {
                    synchronized (SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class) {
                        if (SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.d == null) {
                            SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.d = (ahdd)new ahba((ahbh)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.a);
            }
            case 3: {
                return new SetClientSettingEndpointOuterClass$SetClientSettingEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u001b\u0002\u041b", new Object[] { "b", anzi.class, "c", aiqj.class });
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

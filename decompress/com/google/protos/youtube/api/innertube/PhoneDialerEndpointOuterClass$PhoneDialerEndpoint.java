// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PhoneDialerEndpointOuterClass$PhoneDialerEndpoint extends ahbh implements ahcw
{
    public static final PhoneDialerEndpointOuterClass$PhoneDialerEndpoint a;
    private static volatile ahdd c;
    public static final ahbf phoneDialerEndpoint;
    public String b;
    private int d;
    private aiqj e;
    private byte f;
    
    static {
        final PhoneDialerEndpointOuterClass$PhoneDialerEndpoint a2 = new PhoneDialerEndpointOuterClass$PhoneDialerEndpoint();
        ahbh.registerDefaultInstance((Class)PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.class, (ahbh)(a = a2));
        phoneDialerEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 100946440, ahek.k, (Class)PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.class);
    }
    
    private PhoneDialerEndpointOuterClass$PhoneDialerEndpoint() {
        this.f = 2;
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.c) == null) {
                    synchronized (PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.class) {
                        if (PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.c == null) {
                            PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.c = (ahdd)new ahba((ahbh)PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.a);
            }
            case 3: {
                return new PhoneDialerEndpointOuterClass$PhoneDialerEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", new Object[] { "d", "b", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint extends ahbh implements ahcw
{
    public static final PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint a;
    private static volatile ahdd g;
    public static final ahbf phoneVerificationEndpoint;
    public int b;
    public int c;
    public aiqj d;
    public aiqj e;
    public aiqj f;
    private aiqj h;
    private byte i;
    
    static {
        final PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint a2 = new PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint();
        ahbh.registerDefaultInstance((Class)PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.class, (ahbh)(a = a2));
        phoneVerificationEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 155595733, ahek.k, (Class)PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.class);
    }
    
    private PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint() {
        this.i = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.g) == null) {
                    synchronized (PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.class) {
                        if (PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.g == null) {
                            PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.g = (ahdd)new ahba((ahbh)PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.a);
            }
            case 3: {
                return new PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0004\u0002\u1409\u0001\u0003\u100c\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "b", "h", "c", akjo.t, "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}

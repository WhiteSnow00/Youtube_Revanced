// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AgeVerificationEndpointOuterClass$AgeVerificationEndpoint extends ahbh implements ahcw
{
    public static final AgeVerificationEndpointOuterClass$AgeVerificationEndpoint a;
    public static final ahbf ageVerificationEndpoint;
    private static volatile ahdd e;
    public String b;
    public aiqj c;
    public boolean d;
    private int f;
    private byte g;
    
    static {
        final AgeVerificationEndpointOuterClass$AgeVerificationEndpoint a2 = new AgeVerificationEndpointOuterClass$AgeVerificationEndpoint();
        ahbh.registerDefaultInstance((Class)AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.class, (ahbh)(a = a2));
        ageVerificationEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 322638812, ahek.k, (Class)AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.class);
    }
    
    private AgeVerificationEndpointOuterClass$AgeVerificationEndpoint() {
        this.g = 2;
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.e) == null) {
                    synchronized (AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.class) {
                        if (AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.e == null) {
                            AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.e = (ahdd)new ahba((ahbh)AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.a);
            }
            case 3: {
                return new AgeVerificationEndpointOuterClass$AgeVerificationEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0003\u1409\u0001\u0004\u1007\u0002", new Object[] { "f", "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}

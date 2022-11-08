// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AgeVerificationEndpointOuterClass$AgeVerificationEndpoint extends agzi implements ahax
{
    public static final AgeVerificationEndpointOuterClass$AgeVerificationEndpoint a;
    public static final agzg ageVerificationEndpoint;
    private static volatile ahbe e;
    public String b;
    public aioe c;
    public boolean d;
    private int f;
    private byte g;
    
    static {
        final AgeVerificationEndpointOuterClass$AgeVerificationEndpoint a2 = new AgeVerificationEndpointOuterClass$AgeVerificationEndpoint();
        agzi.registerDefaultInstance((Class)AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.class, (agzi)(a = a2));
        ageVerificationEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 322638812, ahcm.k, (Class)AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.class);
    }
    
    private AgeVerificationEndpointOuterClass$AgeVerificationEndpoint() {
        this.g = 2;
        this.b = "";
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
                final ahbe e;
                if ((e = AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.e) == null) {
                    synchronized (AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.class) {
                        if (AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.e == null) {
                            AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.e = (ahbe)new agzb((agzi)AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.a;
            }
            case 4: {
                return new agza((agzi)AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.a);
            }
            case 3: {
                return new AgeVerificationEndpointOuterClass$AgeVerificationEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0003\u1409\u0001\u0004\u1007\u0002", new Object[] { "f", "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint extends agzi implements ahax
{
    public static final PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint a;
    private static volatile ahbe g;
    public static final agzg phoneVerificationEndpoint;
    public int b;
    public int c;
    public aioe d;
    public aioe e;
    public aioe f;
    private aioe h;
    private byte i;
    
    static {
        final PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint a2 = new PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint();
        agzi.registerDefaultInstance((Class)PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.class, (agzi)(a = a2));
        phoneVerificationEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 155595733, ahcm.k, (Class)PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.class);
    }
    
    private PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint() {
        this.i = 2;
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
                if ((g = PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.g) == null) {
                    synchronized (PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.class) {
                        if (PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.g == null) {
                            PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.g = (ahbe)new agzb((agzi)PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.a;
            }
            case 4: {
                return new agza((agzi)PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.a);
            }
            case 3: {
                return new PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0004\u0002\u1409\u0001\u0003\u100c\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "b", "h", "c", akhl.s, "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}

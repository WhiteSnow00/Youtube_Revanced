// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PhoneDialerEndpointOuterClass$PhoneDialerEndpoint extends agzi implements ahax
{
    public static final PhoneDialerEndpointOuterClass$PhoneDialerEndpoint a;
    private static volatile ahbe c;
    public static final agzg phoneDialerEndpoint;
    public String b;
    private int d;
    private aioe e;
    private byte f;
    
    static {
        final PhoneDialerEndpointOuterClass$PhoneDialerEndpoint a2 = new PhoneDialerEndpointOuterClass$PhoneDialerEndpoint();
        agzi.registerDefaultInstance((Class)PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.class, (agzi)(a = a2));
        phoneDialerEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 100946440, ahcm.k, (Class)PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.class);
    }
    
    private PhoneDialerEndpointOuterClass$PhoneDialerEndpoint() {
        this.f = 2;
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
                final ahbe c;
                if ((c = PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.c) == null) {
                    synchronized (PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.class) {
                        if (PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.c == null) {
                            PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.c = (ahbe)new agzb((agzi)PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.a;
            }
            case 4: {
                return new agza((agzi)PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.a);
            }
            case 3: {
                return new PhoneDialerEndpointOuterClass$PhoneDialerEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", new Object[] { "d", "b", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}

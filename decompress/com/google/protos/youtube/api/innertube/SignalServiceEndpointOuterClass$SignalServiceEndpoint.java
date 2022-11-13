// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SignalServiceEndpointOuterClass$SignalServiceEndpoint extends ahbh implements ahcw
{
    public static final SignalServiceEndpointOuterClass$SignalServiceEndpoint a;
    private static volatile ahdd c;
    public static final ahbf signalServiceEndpoint;
    public ahbx b;
    private byte d;
    
    static {
        final SignalServiceEndpointOuterClass$SignalServiceEndpoint a2 = new SignalServiceEndpointOuterClass$SignalServiceEndpoint();
        ahbh.registerDefaultInstance((Class)SignalServiceEndpointOuterClass$SignalServiceEndpoint.class, (ahbh)(a = a2));
        signalServiceEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 124290411, ahek.k, (Class)SignalServiceEndpointOuterClass$SignalServiceEndpoint.class);
    }
    
    private SignalServiceEndpointOuterClass$SignalServiceEndpoint() {
        this.d = 2;
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = SignalServiceEndpointOuterClass$SignalServiceEndpoint.c) == null) {
                    synchronized (SignalServiceEndpointOuterClass$SignalServiceEndpoint.class) {
                        if (SignalServiceEndpointOuterClass$SignalServiceEndpoint.c == null) {
                            SignalServiceEndpointOuterClass$SignalServiceEndpoint.c = (ahdd)new ahba((ahbh)SignalServiceEndpointOuterClass$SignalServiceEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return SignalServiceEndpointOuterClass$SignalServiceEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)SignalServiceEndpointOuterClass$SignalServiceEndpoint.a);
            }
            case 3: {
                return new SignalServiceEndpointOuterClass$SignalServiceEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SignalServiceEndpointOuterClass$SignalServiceEndpoint.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002\u041b", new Object[] { "b", aiqj.class });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}

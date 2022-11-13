// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class StartStreamEndpointOuterClass$StartStreamEndpoint extends ahbh implements ahcw
{
    public static final StartStreamEndpointOuterClass$StartStreamEndpoint a;
    private static volatile ahdd d;
    public static final ahbf startStreamEndpoint;
    public String b;
    public ahbx c;
    private int e;
    private byte f;
    
    static {
        final StartStreamEndpointOuterClass$StartStreamEndpoint a2 = new StartStreamEndpointOuterClass$StartStreamEndpoint();
        ahbh.registerDefaultInstance((Class)StartStreamEndpointOuterClass$StartStreamEndpoint.class, (ahbh)(a = a2));
        startStreamEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 147899445, ahek.k, (Class)StartStreamEndpointOuterClass$StartStreamEndpoint.class);
    }
    
    private StartStreamEndpointOuterClass$StartStreamEndpoint() {
        this.f = 2;
        this.b = "";
        this.c = emptyProtobufList();
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
                final ahdd d;
                if ((d = StartStreamEndpointOuterClass$StartStreamEndpoint.d) == null) {
                    synchronized (StartStreamEndpointOuterClass$StartStreamEndpoint.class) {
                        if (StartStreamEndpointOuterClass$StartStreamEndpoint.d == null) {
                            StartStreamEndpointOuterClass$StartStreamEndpoint.d = (ahdd)new ahba((ahbh)StartStreamEndpointOuterClass$StartStreamEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return StartStreamEndpointOuterClass$StartStreamEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)StartStreamEndpointOuterClass$StartStreamEndpoint.a);
            }
            case 3: {
                return new StartStreamEndpointOuterClass$StartStreamEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)StartStreamEndpointOuterClass$StartStreamEndpoint.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0001\u0002\u1008\u0001\u0003\u041b", new Object[] { "e", "b", "c", aiqj.class });
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

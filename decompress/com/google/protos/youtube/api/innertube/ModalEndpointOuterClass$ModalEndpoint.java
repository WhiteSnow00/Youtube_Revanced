// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ModalEndpointOuterClass$ModalEndpoint extends ahbh implements ahcw
{
    public static final ModalEndpointOuterClass$ModalEndpoint a;
    private static volatile ahdd d;
    public static final ahbf modalEndpoint;
    public amko b;
    public boolean c;
    private int e;
    private byte f;
    
    static {
        final ModalEndpointOuterClass$ModalEndpoint a2 = new ModalEndpointOuterClass$ModalEndpoint();
        ahbh.registerDefaultInstance((Class)ModalEndpointOuterClass$ModalEndpoint.class, (ahbh)(a = a2));
        modalEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 106613511, ahek.k, (Class)ModalEndpointOuterClass$ModalEndpoint.class);
    }
    
    private ModalEndpointOuterClass$ModalEndpoint() {
        this.f = 2;
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
                if ((d = ModalEndpointOuterClass$ModalEndpoint.d) == null) {
                    synchronized (ModalEndpointOuterClass$ModalEndpoint.class) {
                        if (ModalEndpointOuterClass$ModalEndpoint.d == null) {
                            ModalEndpointOuterClass$ModalEndpoint.d = (ahdd)new ahba((ahbh)ModalEndpointOuterClass$ModalEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ModalEndpointOuterClass$ModalEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ModalEndpointOuterClass$ModalEndpoint.a);
            }
            case 3: {
                return new ModalEndpointOuterClass$ModalEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ModalEndpointOuterClass$ModalEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1007\u0001", new Object[] { "e", "b", "c" });
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

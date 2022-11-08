// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ModalEndpointOuterClass$ModalEndpoint extends agzi implements ahax
{
    public static final ModalEndpointOuterClass$ModalEndpoint a;
    private static volatile ahbe d;
    public static final agzg modalEndpoint;
    public amik b;
    public boolean c;
    private int e;
    private byte f;
    
    static {
        final ModalEndpointOuterClass$ModalEndpoint a2 = new ModalEndpointOuterClass$ModalEndpoint();
        agzi.registerDefaultInstance((Class)ModalEndpointOuterClass$ModalEndpoint.class, (agzi)(a = a2));
        modalEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 106613511, ahcm.k, (Class)ModalEndpointOuterClass$ModalEndpoint.class);
    }
    
    private ModalEndpointOuterClass$ModalEndpoint() {
        this.f = 2;
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
                final ahbe d;
                if ((d = ModalEndpointOuterClass$ModalEndpoint.d) == null) {
                    synchronized (ModalEndpointOuterClass$ModalEndpoint.class) {
                        if (ModalEndpointOuterClass$ModalEndpoint.d == null) {
                            ModalEndpointOuterClass$ModalEndpoint.d = (ahbe)new agzb((agzi)ModalEndpointOuterClass$ModalEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ModalEndpointOuterClass$ModalEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ModalEndpointOuterClass$ModalEndpoint.a);
            }
            case 3: {
                return new ModalEndpointOuterClass$ModalEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ModalEndpointOuterClass$ModalEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1007\u0001", new Object[] { "e", "b", "c" });
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

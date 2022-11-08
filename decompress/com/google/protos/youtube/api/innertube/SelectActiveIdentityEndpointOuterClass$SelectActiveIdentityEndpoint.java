// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint extends agzi implements ahax
{
    public static final SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint a;
    private static volatile ahbe c;
    public static final agzg selectActiveIdentityEndpoint;
    public agzy b;
    private int d;
    private aioe e;
    private aioe f;
    private byte g;
    
    static {
        final SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint a2 = new SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint();
        agzi.registerDefaultInstance((Class)SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.class, (agzi)(a = a2));
        selectActiveIdentityEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 77196420, ahcm.k, (Class)SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.class);
    }
    
    private SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint() {
        this.g = 2;
        this.b = emptyProtobufList();
        final agyc b = agyc.b;
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
                if ((c = SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.c) == null) {
                    synchronized (SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.class) {
                        if (SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.c == null) {
                            SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.c = (ahbe)new agzb((agzi)SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.a;
            }
            case 4: {
                return new agza((agzi)SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.a);
            }
            case 3: {
                return new SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001\u041b\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "d", "b", ahij.class, "e", "f" });
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

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint extends ahbh implements ahcw
{
    public static final SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint a;
    private static volatile ahdd c;
    public static final ahbf selectActiveIdentityEndpoint;
    public ahbx b;
    private int d;
    private aiqj e;
    private aiqj f;
    private byte g;
    
    static {
        final SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint a2 = new SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint();
        ahbh.registerDefaultInstance((Class)SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.class, (ahbh)(a = a2));
        selectActiveIdentityEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 77196420, ahek.k, (Class)SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.class);
    }
    
    private SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint() {
        this.g = 2;
        this.b = emptyProtobufList();
        final ahab b = ahab.b;
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
                final ahdd c;
                if ((c = SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.c) == null) {
                    synchronized (SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.class) {
                        if (SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.c == null) {
                            SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.c = (ahdd)new ahba((ahbh)SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.a);
            }
            case 3: {
                return new SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001\u041b\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "d", "b", ahkh.class, "e", "f" });
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

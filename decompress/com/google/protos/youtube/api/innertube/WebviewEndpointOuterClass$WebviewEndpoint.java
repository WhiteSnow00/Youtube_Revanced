// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class WebviewEndpointOuterClass$WebviewEndpoint extends agzi implements ahax
{
    public static final WebviewEndpointOuterClass$WebviewEndpoint a;
    private static volatile ahbe d;
    public static final agzg webviewEndpoint;
    public String b;
    public boolean c;
    private int e;
    private aioe f;
    private byte g;
    
    static {
        final WebviewEndpointOuterClass$WebviewEndpoint a2 = new WebviewEndpointOuterClass$WebviewEndpoint();
        agzi.registerDefaultInstance((Class)WebviewEndpointOuterClass$WebviewEndpoint.class, (agzi)(a = a2));
        webviewEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 77364463, ahcm.k, (Class)WebviewEndpointOuterClass$WebviewEndpoint.class);
    }
    
    private WebviewEndpointOuterClass$WebviewEndpoint() {
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
                final ahbe d;
                if ((d = WebviewEndpointOuterClass$WebviewEndpoint.d) == null) {
                    synchronized (WebviewEndpointOuterClass$WebviewEndpoint.class) {
                        if (WebviewEndpointOuterClass$WebviewEndpoint.d == null) {
                            WebviewEndpointOuterClass$WebviewEndpoint.d = (ahbe)new agzb((agzi)WebviewEndpointOuterClass$WebviewEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return WebviewEndpointOuterClass$WebviewEndpoint.a;
            }
            case 4: {
                return new agza((agzi)WebviewEndpointOuterClass$WebviewEndpoint.a);
            }
            case 3: {
                return new WebviewEndpointOuterClass$WebviewEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)WebviewEndpointOuterClass$WebviewEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0003\u1409\u0002\u0004\u1007\u0003", new Object[] { "e", "b", "f", "c" });
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

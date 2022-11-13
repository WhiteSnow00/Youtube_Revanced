// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShareEndpointOuterClass$ShareEndpoint extends ahbh implements ahcw
{
    public static final ShareEndpointOuterClass$ShareEndpoint a;
    private static volatile ahdd d;
    public static final ahbf shareEndpoint;
    public String b;
    public String c;
    private int e;
    private aoci f;
    private byte g;
    
    static {
        final ShareEndpointOuterClass$ShareEndpoint a2 = new ShareEndpointOuterClass$ShareEndpoint();
        ahbh.registerDefaultInstance((Class)ShareEndpointOuterClass$ShareEndpoint.class, (ahbh)(a = a2));
        shareEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 85383280, ahek.k, (Class)ShareEndpointOuterClass$ShareEndpoint.class);
    }
    
    private ShareEndpointOuterClass$ShareEndpoint() {
        this.g = 2;
        this.b = "";
        this.c = "";
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
                final ahdd d;
                if ((d = ShareEndpointOuterClass$ShareEndpoint.d) == null) {
                    synchronized (ShareEndpointOuterClass$ShareEndpoint.class) {
                        if (ShareEndpointOuterClass$ShareEndpoint.d == null) {
                            ShareEndpointOuterClass$ShareEndpoint.d = (ahdd)new ahba((ahbh)ShareEndpointOuterClass$ShareEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShareEndpointOuterClass$ShareEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ShareEndpointOuterClass$ShareEndpoint.a);
            }
            case 3: {
                return new ShareEndpointOuterClass$ShareEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShareEndpointOuterClass$ShareEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1409\u0002", new Object[] { "e", "b", "c", "f" });
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

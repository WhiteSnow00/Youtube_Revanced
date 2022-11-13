// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShareEndpointOuterClass$ShareEntityEndpoint extends ahbh implements ahcw
{
    public static final ShareEndpointOuterClass$ShareEntityEndpoint a;
    private static volatile ahdd g;
    public static final ahbf shareEntityEndpoint;
    public int b;
    public String c;
    public String d;
    public int e;
    public aiqj f;
    private byte h;
    
    static {
        final ShareEndpointOuterClass$ShareEntityEndpoint a2 = new ShareEndpointOuterClass$ShareEntityEndpoint();
        ahbh.registerDefaultInstance((Class)ShareEndpointOuterClass$ShareEntityEndpoint.class, (ahbh)(a = a2));
        shareEntityEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 90650344, ahek.k, (Class)ShareEndpointOuterClass$ShareEntityEndpoint.class);
    }
    
    private ShareEndpointOuterClass$ShareEntityEndpoint() {
        this.h = 2;
        this.c = "";
        this.d = "";
        this.e = 1;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = ShareEndpointOuterClass$ShareEntityEndpoint.g) == null) {
                    synchronized (ShareEndpointOuterClass$ShareEntityEndpoint.class) {
                        if (ShareEndpointOuterClass$ShareEntityEndpoint.g == null) {
                            ShareEndpointOuterClass$ShareEntityEndpoint.g = (ahdd)new ahba((ahbh)ShareEndpointOuterClass$ShareEntityEndpoint.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ShareEndpointOuterClass$ShareEntityEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ShareEndpointOuterClass$ShareEntityEndpoint.a);
            }
            case 3: {
                return new ShareEndpointOuterClass$ShareEntityEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShareEndpointOuterClass$ShareEntityEndpoint.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0006\u100c\u0003\u0007\u1409\u0004", new Object[] { "b", "c", "d", "e", anxd.r, "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}

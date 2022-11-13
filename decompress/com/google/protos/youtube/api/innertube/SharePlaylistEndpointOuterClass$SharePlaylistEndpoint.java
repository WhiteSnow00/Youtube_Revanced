// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SharePlaylistEndpointOuterClass$SharePlaylistEndpoint extends ahbh implements ahcw
{
    public static final SharePlaylistEndpointOuterClass$SharePlaylistEndpoint a;
    private static volatile ahdd e;
    public static final ahbf sharePlaylistEndpoint;
    public int b;
    public String c;
    public String d;
    
    static {
        final SharePlaylistEndpointOuterClass$SharePlaylistEndpoint a2 = new SharePlaylistEndpointOuterClass$SharePlaylistEndpoint();
        ahbh.registerDefaultInstance((Class)SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.class, (ahbh)(a = a2));
        sharePlaylistEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 73844191, ahek.k, (Class)SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.class);
    }
    
    private SharePlaylistEndpointOuterClass$SharePlaylistEndpoint() {
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.e) == null) {
                    synchronized (SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.class) {
                        if (SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.e == null) {
                            SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.e = (ahdd)new ahba((ahbh)SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.a);
            }
            case 3: {
                return new SharePlaylistEndpointOuterClass$SharePlaylistEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}

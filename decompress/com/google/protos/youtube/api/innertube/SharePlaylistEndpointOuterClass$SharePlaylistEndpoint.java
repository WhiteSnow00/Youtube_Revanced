// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SharePlaylistEndpointOuterClass$SharePlaylistEndpoint extends agzi implements ahax
{
    public static final SharePlaylistEndpointOuterClass$SharePlaylistEndpoint a;
    private static volatile ahbe e;
    public static final agzg sharePlaylistEndpoint;
    public int b;
    public String c;
    public String d;
    
    static {
        final SharePlaylistEndpointOuterClass$SharePlaylistEndpoint a2 = new SharePlaylistEndpointOuterClass$SharePlaylistEndpoint();
        agzi.registerDefaultInstance((Class)SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.class, (agzi)(a = a2));
        sharePlaylistEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 73844191, ahcm.k, (Class)SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.class);
    }
    
    private SharePlaylistEndpointOuterClass$SharePlaylistEndpoint() {
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.e) == null) {
                    synchronized (SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.class) {
                        if (SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.e == null) {
                            SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.e = (ahbe)new agzb((agzi)SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.a;
            }
            case 4: {
                return new agza((agzi)SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.a);
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

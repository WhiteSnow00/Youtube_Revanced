// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShareEndpointOuterClass$ShareEntityEndpoint extends agzi implements ahax
{
    public static final ShareEndpointOuterClass$ShareEntityEndpoint a;
    private static volatile ahbe g;
    public static final agzg shareEntityEndpoint;
    public int b;
    public String c;
    public String d;
    public int e;
    public aioe f;
    private byte h;
    
    static {
        final ShareEndpointOuterClass$ShareEntityEndpoint a2 = new ShareEndpointOuterClass$ShareEntityEndpoint();
        agzi.registerDefaultInstance((Class)ShareEndpointOuterClass$ShareEntityEndpoint.class, (agzi)(a = a2));
        shareEntityEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 90650344, ahcm.k, (Class)ShareEndpointOuterClass$ShareEntityEndpoint.class);
    }
    
    private ShareEndpointOuterClass$ShareEntityEndpoint() {
        this.h = 2;
        this.c = "";
        this.d = "";
        this.e = 1;
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
                final ahbe g;
                if ((g = ShareEndpointOuterClass$ShareEntityEndpoint.g) == null) {
                    synchronized (ShareEndpointOuterClass$ShareEntityEndpoint.class) {
                        if (ShareEndpointOuterClass$ShareEntityEndpoint.g == null) {
                            ShareEndpointOuterClass$ShareEntityEndpoint.g = (ahbe)new agzb((agzi)ShareEndpointOuterClass$ShareEntityEndpoint.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ShareEndpointOuterClass$ShareEntityEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ShareEndpointOuterClass$ShareEntityEndpoint.a);
            }
            case 3: {
                return new ShareEndpointOuterClass$ShareEntityEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShareEndpointOuterClass$ShareEntityEndpoint.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0006\u100c\u0003\u0007\u1409\u0004", new Object[] { "b", "c", "d", "e", anvq.q, "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}

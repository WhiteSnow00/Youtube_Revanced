// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShareEndpointOuterClass$ShareEndpoint extends agzi implements ahax
{
    public static final ShareEndpointOuterClass$ShareEndpoint a;
    private static volatile ahbe d;
    public static final agzg shareEndpoint;
    public String b;
    public String c;
    private int e;
    private aoag f;
    private byte g;
    
    static {
        final ShareEndpointOuterClass$ShareEndpoint a2 = new ShareEndpointOuterClass$ShareEndpoint();
        agzi.registerDefaultInstance((Class)ShareEndpointOuterClass$ShareEndpoint.class, (agzi)(a = a2));
        shareEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 85383280, ahcm.k, (Class)ShareEndpointOuterClass$ShareEndpoint.class);
    }
    
    private ShareEndpointOuterClass$ShareEndpoint() {
        this.g = 2;
        this.b = "";
        this.c = "";
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
                if ((d = ShareEndpointOuterClass$ShareEndpoint.d) == null) {
                    synchronized (ShareEndpointOuterClass$ShareEndpoint.class) {
                        if (ShareEndpointOuterClass$ShareEndpoint.d == null) {
                            ShareEndpointOuterClass$ShareEndpoint.d = (ahbe)new agzb((agzi)ShareEndpointOuterClass$ShareEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShareEndpointOuterClass$ShareEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ShareEndpointOuterClass$ShareEndpoint.a);
            }
            case 3: {
                return new ShareEndpointOuterClass$ShareEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShareEndpointOuterClass$ShareEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1409\u0002", new Object[] { "e", "b", "c", "f" });
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

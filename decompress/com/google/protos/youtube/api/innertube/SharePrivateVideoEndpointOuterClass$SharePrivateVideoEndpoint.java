// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint extends agzi implements ahax
{
    public static final SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint a;
    private static volatile ahbe d;
    public static final agzg sharePrivateVideoEndpoint;
    public String b;
    public aioe c;
    private int e;
    private byte f;
    
    static {
        final SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint a2 = new SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint();
        agzi.registerDefaultInstance((Class)SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.class, (agzi)(a = a2));
        sharePrivateVideoEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 117735229, ahcm.k, (Class)SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.class);
    }
    
    private SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint() {
        this.f = 2;
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
                if ((d = SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.d) == null) {
                    synchronized (SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.class) {
                        if (SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.d == null) {
                            SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.d = (ahbe)new agzb((agzi)SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.a;
            }
            case 4: {
                return new agza((agzi)SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.a);
            }
            case 3: {
                return new SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
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

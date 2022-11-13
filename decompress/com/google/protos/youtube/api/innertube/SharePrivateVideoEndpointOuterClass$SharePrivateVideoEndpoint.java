// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint extends ahbh implements ahcw
{
    public static final SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint a;
    private static volatile ahdd d;
    public static final ahbf sharePrivateVideoEndpoint;
    public String b;
    public aiqj c;
    private int e;
    private byte f;
    
    static {
        final SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint a2 = new SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint();
        ahbh.registerDefaultInstance((Class)SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.class, (ahbh)(a = a2));
        sharePrivateVideoEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 117735229, ahek.k, (Class)SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.class);
    }
    
    private SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint() {
        this.f = 2;
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.d) == null) {
                    synchronized (SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.class) {
                        if (SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.d == null) {
                            SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.d = (ahdd)new ahba((ahbh)SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.a);
            }
            case 3: {
                return new SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}

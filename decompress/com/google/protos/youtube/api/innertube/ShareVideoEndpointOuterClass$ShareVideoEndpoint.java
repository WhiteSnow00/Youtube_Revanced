// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShareVideoEndpointOuterClass$ShareVideoEndpoint extends agzi implements ahax
{
    public static final ShareVideoEndpointOuterClass$ShareVideoEndpoint a;
    private static volatile ahbe d;
    public static final agzg shareVideoEndpoint;
    public String b;
    public String c;
    private int e;
    
    static {
        final ShareVideoEndpointOuterClass$ShareVideoEndpoint a2 = new ShareVideoEndpointOuterClass$ShareVideoEndpoint();
        agzi.registerDefaultInstance((Class)ShareVideoEndpointOuterClass$ShareVideoEndpoint.class, (agzi)(a = a2));
        shareVideoEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 73844178, ahcm.k, (Class)ShareVideoEndpointOuterClass$ShareVideoEndpoint.class);
    }
    
    private ShareVideoEndpointOuterClass$ShareVideoEndpoint() {
        this.b = "";
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ShareVideoEndpointOuterClass$ShareVideoEndpoint.d) == null) {
                    synchronized (ShareVideoEndpointOuterClass$ShareVideoEndpoint.class) {
                        if (ShareVideoEndpointOuterClass$ShareVideoEndpoint.d == null) {
                            ShareVideoEndpointOuterClass$ShareVideoEndpoint.d = (ahbe)new agzb((agzi)ShareVideoEndpointOuterClass$ShareVideoEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShareVideoEndpointOuterClass$ShareVideoEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ShareVideoEndpointOuterClass$ShareVideoEndpoint.a);
            }
            case 3: {
                return new ShareVideoEndpointOuterClass$ShareVideoEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShareVideoEndpointOuterClass$ShareVideoEndpoint.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "e", "b", "c" });
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

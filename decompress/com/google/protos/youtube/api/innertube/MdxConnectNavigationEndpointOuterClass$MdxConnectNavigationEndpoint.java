// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint extends ahbh implements ahcw
{
    public static final MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint a;
    private static volatile ahdd e;
    public static final ahbf mdxConnectNavigationEndpoint;
    public int b;
    public amfm c;
    public amej d;
    private aiqj f;
    private byte g;
    
    static {
        final MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint a2 = new MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint();
        ahbh.registerDefaultInstance((Class)MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.class, (ahbh)(a = a2));
        mdxConnectNavigationEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 119886855, ahek.k, (Class)MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.class);
    }
    
    private MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint() {
        this.g = 2;
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
                final ahdd e;
                if ((e = MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.e) == null) {
                    synchronized (MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.class) {
                        if (MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.e == null) {
                            MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.e = (ahdd)new ahba((ahbh)MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.a);
            }
            case 3: {
                return new MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.a, "\u0001\u0003\u0000\u0001\u0004\b\u0003\u0000\u0000\u0001\u0004\u1009\u0001\u0006\u1009\u0002\b\u1409\u0003", new Object[] { "b", "c", "d", "f" });
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

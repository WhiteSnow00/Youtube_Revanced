// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint extends agzi implements ahax
{
    public static final MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint a;
    private static volatile ahbe e;
    public static final agzg mdxConnectNavigationEndpoint;
    public int b;
    public amdi c;
    public amcf d;
    private aioe f;
    private byte g;
    
    static {
        final MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint a2 = new MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint();
        agzi.registerDefaultInstance((Class)MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.class, (agzi)(a = a2));
        mdxConnectNavigationEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 119886855, ahcm.k, (Class)MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.class);
    }
    
    private MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint() {
        this.g = 2;
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
                final ahbe e;
                if ((e = MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.e) == null) {
                    synchronized (MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.class) {
                        if (MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.e == null) {
                            MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.e = (ahbe)new agzb((agzi)MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.a;
            }
            case 4: {
                return new agza((agzi)MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.a);
            }
            case 3: {
                return new MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.a, "\u0001\u0003\u0000\u0001\u0004\b\u0003\u0000\u0000\u0001\u0004\u1009\u0001\u0006\u1009\u0002\b\u1409\u0003", new Object[] { "b", "c", "d", "f" });
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

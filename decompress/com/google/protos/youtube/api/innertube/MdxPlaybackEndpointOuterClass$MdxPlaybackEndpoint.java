// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint extends agzi implements ahax
{
    public static final MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint a;
    private static volatile ahbe d;
    public static final agzg mdxPlaybackEndpoint;
    public int b;
    public amdi c;
    
    static {
        final MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint a2 = new MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint();
        agzi.registerDefaultInstance((Class)MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.class, (agzi)(a = a2));
        mdxPlaybackEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 164988379, ahcm.k, (Class)MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.class);
    }
    
    private MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.d) == null) {
                    synchronized (MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.class) {
                        if (MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.d == null) {
                            MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.d = (ahbe)new agzb((agzi)MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.a;
            }
            case 4: {
                return new agza((agzi)MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.a);
            }
            case 3: {
                return new MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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

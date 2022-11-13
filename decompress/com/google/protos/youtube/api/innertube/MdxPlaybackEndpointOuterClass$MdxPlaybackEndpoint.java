// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint extends ahbh implements ahcw
{
    public static final MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint a;
    private static volatile ahdd d;
    public static final ahbf mdxPlaybackEndpoint;
    public int b;
    public amfm c;
    
    static {
        final MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint a2 = new MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint();
        ahbh.registerDefaultInstance((Class)MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.class, (ahbh)(a = a2));
        mdxPlaybackEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 164988379, ahek.k, (Class)MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.class);
    }
    
    private MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.d) == null) {
                    synchronized (MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.class) {
                        if (MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.d == null) {
                            MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.d = (ahdd)new ahba((ahbh)MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.a);
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

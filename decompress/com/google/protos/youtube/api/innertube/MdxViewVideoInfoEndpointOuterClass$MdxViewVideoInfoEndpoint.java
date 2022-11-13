// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint extends ahbh implements ahcw
{
    public static final MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint a;
    private static volatile ahdd b;
    public static final ahbf mdxViewVideoInfoEndpoint;
    
    static {
        final MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint a2 = new MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint();
        ahbh.registerDefaultInstance((Class)MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.class, (ahbh)(a = a2));
        mdxViewVideoInfoEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 105496274, ahek.k, (Class)MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.class);
    }
    
    private MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.b) == null) {
                    synchronized (MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.class) {
                        if (MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.b == null) {
                            MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.b = (ahdd)new ahba((ahbh)MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.a);
            }
            case 3: {
                return new MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.a, "\u0001\u0000", (Object[])null);
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

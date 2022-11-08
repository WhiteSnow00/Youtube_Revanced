// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint extends agzi implements ahax
{
    public static final MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint a;
    private static volatile ahbe b;
    public static final agzg mdxViewVideoInfoEndpoint;
    
    static {
        final MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint a2 = new MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint();
        agzi.registerDefaultInstance((Class)MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.class, (agzi)(a = a2));
        mdxViewVideoInfoEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 105496274, ahcm.k, (Class)MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.class);
    }
    
    private MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.b) == null) {
                    synchronized (MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.class) {
                        if (MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.b == null) {
                            MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.b = (ahbe)new agzb((agzi)MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.a;
            }
            case 4: {
                return new agza((agzi)MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.a);
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

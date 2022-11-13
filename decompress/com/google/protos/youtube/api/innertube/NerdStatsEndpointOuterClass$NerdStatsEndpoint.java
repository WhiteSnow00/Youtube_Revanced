// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class NerdStatsEndpointOuterClass$NerdStatsEndpoint extends ahbh implements ahcw
{
    public static final NerdStatsEndpointOuterClass$NerdStatsEndpoint a;
    private static volatile ahdd b;
    public static final ahbf nerdStatsEndpoint;
    
    static {
        final NerdStatsEndpointOuterClass$NerdStatsEndpoint a2 = new NerdStatsEndpointOuterClass$NerdStatsEndpoint();
        ahbh.registerDefaultInstance((Class)NerdStatsEndpointOuterClass$NerdStatsEndpoint.class, (ahbh)(a = a2));
        nerdStatsEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 123140429, ahek.k, (Class)NerdStatsEndpointOuterClass$NerdStatsEndpoint.class);
    }
    
    private NerdStatsEndpointOuterClass$NerdStatsEndpoint() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = NerdStatsEndpointOuterClass$NerdStatsEndpoint.b) == null) {
                    synchronized (NerdStatsEndpointOuterClass$NerdStatsEndpoint.class) {
                        if (NerdStatsEndpointOuterClass$NerdStatsEndpoint.b == null) {
                            NerdStatsEndpointOuterClass$NerdStatsEndpoint.b = (ahdd)new ahba((ahbh)NerdStatsEndpointOuterClass$NerdStatsEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return NerdStatsEndpointOuterClass$NerdStatsEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)NerdStatsEndpointOuterClass$NerdStatsEndpoint.a);
            }
            case 3: {
                return new NerdStatsEndpointOuterClass$NerdStatsEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)NerdStatsEndpointOuterClass$NerdStatsEndpoint.a, "\u0001\u0000", (Object[])null);
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

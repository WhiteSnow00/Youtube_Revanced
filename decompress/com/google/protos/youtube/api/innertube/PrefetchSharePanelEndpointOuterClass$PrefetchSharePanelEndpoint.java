// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint extends ahbh implements ahcw
{
    public static final PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint a;
    private static volatile ahdd c;
    public static final ahbf prefetchSharePanelEndpoint;
    public String b;
    private int d;
    
    static {
        final PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint a2 = new PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint();
        ahbh.registerDefaultInstance((Class)PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.class, (ahbh)(a = a2));
        prefetchSharePanelEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 116980193, ahek.k, (Class)PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.class);
    }
    
    private PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.c) == null) {
                    synchronized (PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.class) {
                        if (PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.c == null) {
                            PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.c = (ahdd)new ahba((ahbh)PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.a);
            }
            case 3: {
                return new PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

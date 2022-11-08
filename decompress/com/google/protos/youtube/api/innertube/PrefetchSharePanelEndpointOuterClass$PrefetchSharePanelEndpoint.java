// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint extends agzi implements ahax
{
    public static final PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint a;
    private static volatile ahbe c;
    public static final agzg prefetchSharePanelEndpoint;
    public String b;
    private int d;
    
    static {
        final PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint a2 = new PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint();
        agzi.registerDefaultInstance((Class)PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.class, (agzi)(a = a2));
        prefetchSharePanelEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 116980193, ahcm.k, (Class)PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.class);
    }
    
    private PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.c) == null) {
                    synchronized (PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.class) {
                        if (PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.c == null) {
                            PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.c = (ahbe)new agzb((agzi)PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.a;
            }
            case 4: {
                return new agza((agzi)PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.a);
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

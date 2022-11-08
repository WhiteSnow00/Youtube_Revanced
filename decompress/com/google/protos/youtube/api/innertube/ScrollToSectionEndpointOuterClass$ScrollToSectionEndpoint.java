// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint extends agzi implements ahax
{
    public static final ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint a;
    private static volatile ahbe f;
    public static final agzg scrollToSectionEndpoint;
    public int b;
    public String c;
    public String d;
    public int e;
    
    static {
        final ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint a2 = new ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint();
        agzi.registerDefaultInstance((Class)ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.class, (agzi)(a = a2));
        scrollToSectionEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 135727656, ahcm.k, (Class)ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.class);
    }
    
    private ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint() {
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.f) == null) {
                    synchronized (ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.class) {
                        if (ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.f == null) {
                            ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.f = (ahbe)new agzb((agzi)ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.a);
            }
            case 3: {
                return new ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1004\u0002", new Object[] { "b", "c", "d", "e" });
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

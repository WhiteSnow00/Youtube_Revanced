// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint extends ahbh implements ahcw
{
    public static final ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint a;
    private static volatile ahdd f;
    public static final ahbf scrollToSectionEndpoint;
    public int b;
    public String c;
    public String d;
    public int e;
    
    static {
        final ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint a2 = new ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint();
        ahbh.registerDefaultInstance((Class)ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.class, (ahbh)(a = a2));
        scrollToSectionEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 135727656, ahek.k, (Class)ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.class);
    }
    
    private ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint() {
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.f) == null) {
                    synchronized (ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.class) {
                        if (ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.f == null) {
                            ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.f = (ahdd)new ahba((ahbh)ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.a);
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

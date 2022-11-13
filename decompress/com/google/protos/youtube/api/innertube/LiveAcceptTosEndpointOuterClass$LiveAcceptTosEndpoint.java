// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint extends ahbh implements ahcw
{
    public static final LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint a;
    private static volatile ahdd b;
    public static final ahbf liveAcceptTosEndpoint;
    
    static {
        final LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint a2 = new LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint();
        ahbh.registerDefaultInstance((Class)LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.class, (ahbh)(a = a2));
        liveAcceptTosEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 129686418, ahek.k, (Class)LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.class);
    }
    
    private LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.b) == null) {
                    synchronized (LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.class) {
                        if (LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.b == null) {
                            LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.b = (ahdd)new ahba((ahbh)LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.a);
            }
            case 3: {
                return new LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.a, "\u0001\u0000", (Object[])null);
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

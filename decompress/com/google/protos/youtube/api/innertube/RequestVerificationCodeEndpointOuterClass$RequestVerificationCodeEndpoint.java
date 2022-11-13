// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint extends ahbh implements ahcw
{
    public static final RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint a;
    private static volatile ahdd b;
    public static final ahbf requestVerificationCodeEndpoint;
    
    static {
        final RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint a2 = new RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint();
        ahbh.registerDefaultInstance((Class)RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.class, (ahbh)(a = a2));
        requestVerificationCodeEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 130003709, ahek.k, (Class)RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.class);
    }
    
    private RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.b) == null) {
                    synchronized (RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.class) {
                        if (RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.b == null) {
                            RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.b = (ahdd)new ahba((ahbh)RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.a);
            }
            case 3: {
                return new RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.a, "\u0001\u0000", (Object[])null);
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

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint extends agzi implements ahax
{
    public static final RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint a;
    private static volatile ahbe b;
    public static final agzg requestVerificationCodeEndpoint;
    
    static {
        final RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint a2 = new RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint();
        agzi.registerDefaultInstance((Class)RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.class, (agzi)(a = a2));
        requestVerificationCodeEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 130003709, ahcm.k, (Class)RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.class);
    }
    
    private RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.b) == null) {
                    synchronized (RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.class) {
                        if (RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.b == null) {
                            RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.b = (ahbe)new agzb((agzi)RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.a;
            }
            case 4: {
                return new agza((agzi)RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.a);
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
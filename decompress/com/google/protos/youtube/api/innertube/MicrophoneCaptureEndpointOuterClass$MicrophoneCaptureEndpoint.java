// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint extends agzi implements ahax
{
    public static final MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint a;
    private static volatile ahbe c;
    public static final agzg microphoneCaptureEndpoint;
    public boolean b;
    private int d;
    
    static {
        final MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint a2 = new MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint();
        agzi.registerDefaultInstance((Class)MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.class, (agzi)(a = a2));
        microphoneCaptureEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 142199843, ahcm.k, (Class)MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.class);
    }
    
    private MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.c) == null) {
                    synchronized (MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.class) {
                        if (MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.c == null) {
                            MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.c = (ahbe)new agzb((agzi)MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.a;
            }
            case 4: {
                return new agza((agzi)MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.a);
            }
            case 3: {
                return new MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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

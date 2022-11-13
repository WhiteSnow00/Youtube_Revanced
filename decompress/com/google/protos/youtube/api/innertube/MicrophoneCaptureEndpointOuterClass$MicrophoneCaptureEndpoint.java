// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint extends ahbh implements ahcw
{
    public static final MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint a;
    private static volatile ahdd c;
    public static final ahbf microphoneCaptureEndpoint;
    public boolean b;
    private int d;
    
    static {
        final MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint a2 = new MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint();
        ahbh.registerDefaultInstance((Class)MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.class, (ahbh)(a = a2));
        microphoneCaptureEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 142199843, ahek.k, (Class)MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.class);
    }
    
    private MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.c) == null) {
                    synchronized (MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.class) {
                        if (MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.c == null) {
                            MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.c = (ahdd)new ahba((ahbh)MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.a);
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

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SwitchCameraEndpointOuterClass$SwitchCameraEndpoint extends ahbh implements ahcw
{
    public static final SwitchCameraEndpointOuterClass$SwitchCameraEndpoint a;
    private static volatile ahdd b;
    public static final ahbf switchCameraEndpoint;
    
    static {
        final SwitchCameraEndpointOuterClass$SwitchCameraEndpoint a2 = new SwitchCameraEndpointOuterClass$SwitchCameraEndpoint();
        ahbh.registerDefaultInstance((Class)SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.class, (ahbh)(a = a2));
        switchCameraEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 142199568, ahek.k, (Class)SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.class);
    }
    
    private SwitchCameraEndpointOuterClass$SwitchCameraEndpoint() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.b) == null) {
                    synchronized (SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.class) {
                        if (SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.b == null) {
                            SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.b = (ahdd)new ahba((ahbh)SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.a);
            }
            case 3: {
                return new SwitchCameraEndpointOuterClass$SwitchCameraEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.a, "\u0001\u0000", (Object[])null);
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

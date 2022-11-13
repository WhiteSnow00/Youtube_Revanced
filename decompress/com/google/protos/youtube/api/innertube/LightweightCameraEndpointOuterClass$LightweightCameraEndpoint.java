// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LightweightCameraEndpointOuterClass$LightweightCameraEndpoint extends ahbh implements ahcw
{
    public static final LightweightCameraEndpointOuterClass$LightweightCameraEndpoint a;
    private static volatile ahdd f;
    public static final ahbf lightweightCameraEndpoint;
    public int b;
    public int c;
    public aiqj d;
    public ahbx e;
    private byte g;
    
    static {
        final LightweightCameraEndpointOuterClass$LightweightCameraEndpoint a2 = new LightweightCameraEndpointOuterClass$LightweightCameraEndpoint();
        ahbh.registerDefaultInstance((Class)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.class, (ahbh)(a = a2));
        lightweightCameraEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 139979438, ahek.k, (Class)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.class);
    }
    
    private LightweightCameraEndpointOuterClass$LightweightCameraEndpoint() {
        this.g = 2;
        this.e = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.f) == null) {
                    synchronized (LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.class) {
                        if (LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.f == null) {
                            LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.f = (ahdd)new ahba((ahbh)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.a);
            }
            case 3: {
                return new LightweightCameraEndpointOuterClass$LightweightCameraEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0002\u0002\u1004\u0001\u0003\u1409\u0002\u0005\u041b", new Object[] { "b", "c", "d", "e", anuv.class });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}

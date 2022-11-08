// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LightweightCameraEndpointOuterClass$LightweightCameraEndpoint extends agzi implements ahax
{
    public static final LightweightCameraEndpointOuterClass$LightweightCameraEndpoint a;
    private static volatile ahbe f;
    public static final agzg lightweightCameraEndpoint;
    public int b;
    public int c;
    public aioe d;
    public agzy e;
    private byte g;
    
    static {
        final LightweightCameraEndpointOuterClass$LightweightCameraEndpoint a2 = new LightweightCameraEndpointOuterClass$LightweightCameraEndpoint();
        agzi.registerDefaultInstance((Class)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.class, (agzi)(a = a2));
        lightweightCameraEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 139979438, ahcm.k, (Class)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.class);
    }
    
    private LightweightCameraEndpointOuterClass$LightweightCameraEndpoint() {
        this.g = 2;
        this.e = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.f) == null) {
                    synchronized (LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.class) {
                        if (LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.f == null) {
                            LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.f = (ahbe)new agzb((agzi)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.a;
            }
            case 4: {
                return new agza((agzi)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.a);
            }
            case 3: {
                return new LightweightCameraEndpointOuterClass$LightweightCameraEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0002\u0002\u1004\u0001\u0003\u1409\u0002\u0005\u041b", new Object[] { "b", "c", "d", "e", anss.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}

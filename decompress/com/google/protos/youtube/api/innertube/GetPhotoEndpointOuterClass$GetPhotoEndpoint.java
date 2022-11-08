// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class GetPhotoEndpointOuterClass$GetPhotoEndpoint extends agzi implements ahax
{
    public static final GetPhotoEndpointOuterClass$GetPhotoEndpoint a;
    private static volatile ahbe g;
    public static final agzg getPhotoEndpoint;
    public int b;
    public int c;
    public aibc d;
    public ajwa e;
    public ajsq f;
    private byte h;
    
    static {
        final GetPhotoEndpointOuterClass$GetPhotoEndpoint a2 = new GetPhotoEndpointOuterClass$GetPhotoEndpoint();
        agzi.registerDefaultInstance((Class)GetPhotoEndpointOuterClass$GetPhotoEndpoint.class, (agzi)(a = a2));
        getPhotoEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 99404607, ahcm.k, (Class)GetPhotoEndpointOuterClass$GetPhotoEndpoint.class);
    }
    
    private GetPhotoEndpointOuterClass$GetPhotoEndpoint() {
        this.h = 2;
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
                final ahbe g;
                if ((g = GetPhotoEndpointOuterClass$GetPhotoEndpoint.g) == null) {
                    synchronized (GetPhotoEndpointOuterClass$GetPhotoEndpoint.class) {
                        if (GetPhotoEndpointOuterClass$GetPhotoEndpoint.g == null) {
                            GetPhotoEndpointOuterClass$GetPhotoEndpoint.g = (ahbe)new agzb((agzi)GetPhotoEndpointOuterClass$GetPhotoEndpoint.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return GetPhotoEndpointOuterClass$GetPhotoEndpoint.a;
            }
            case 4: {
                return new agza((agzi)GetPhotoEndpointOuterClass$GetPhotoEndpoint.a);
            }
            case 3: {
                return new GetPhotoEndpointOuterClass$GetPhotoEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)GetPhotoEndpointOuterClass$GetPhotoEndpoint.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u100c\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", ajwj.b, "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}

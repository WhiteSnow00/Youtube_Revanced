// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LikeEndpointOuterClass$LikeEndpoint extends agzi implements ahax
{
    public static final LikeEndpointOuterClass$LikeEndpoint a;
    private static volatile ahbe h;
    public static final agzg likeEndpoint;
    public int b;
    public int c;
    public Object d;
    public int e;
    public alme f;
    public agzy g;
    private byte i;
    
    static {
        final LikeEndpointOuterClass$LikeEndpoint a2 = new LikeEndpointOuterClass$LikeEndpoint();
        agzi.registerDefaultInstance((Class)LikeEndpointOuterClass$LikeEndpoint.class, (agzi)(a = a2));
        likeEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 63158558, ahcm.k, (Class)LikeEndpointOuterClass$LikeEndpoint.class);
    }
    
    private LikeEndpointOuterClass$LikeEndpoint() {
        this.c = 0;
        this.i = 2;
        this.g = emptyProtobufList();
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
                final ahbe h;
                if ((h = LikeEndpointOuterClass$LikeEndpoint.h) == null) {
                    synchronized (LikeEndpointOuterClass$LikeEndpoint.class) {
                        if (LikeEndpointOuterClass$LikeEndpoint.h == null) {
                            LikeEndpointOuterClass$LikeEndpoint.h = (ahbe)new agzb((agzi)LikeEndpointOuterClass$LikeEndpoint.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return LikeEndpointOuterClass$LikeEndpoint.a;
            }
            case 4: {
                return new agza((agzi)LikeEndpointOuterClass$LikeEndpoint.a);
            }
            case 3: {
                return new LikeEndpointOuterClass$LikeEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)LikeEndpointOuterClass$LikeEndpoint.a, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0001\u0001\u0001\u100c\u0000\u0002\u1009\u0001\u0003\u041b\u0006\u103b\u0000\u0007\u103b\u0000\b\u103b\u0000", new Object[] { "d", "c", "b", "e", almd.a(), "f", "g", aioe.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}

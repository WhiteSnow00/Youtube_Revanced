// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LikeEndpointOuterClass$LikeEndpoint extends ahbh implements ahcw
{
    public static final LikeEndpointOuterClass$LikeEndpoint a;
    private static volatile ahdd h;
    public static final ahbf likeEndpoint;
    public int b;
    public int c;
    public Object d;
    public int e;
    public aloh f;
    public ahbx g;
    private byte i;
    
    static {
        final LikeEndpointOuterClass$LikeEndpoint a2 = new LikeEndpointOuterClass$LikeEndpoint();
        ahbh.registerDefaultInstance((Class)LikeEndpointOuterClass$LikeEndpoint.class, (ahbh)(a = a2));
        likeEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 63158558, ahek.k, (Class)LikeEndpointOuterClass$LikeEndpoint.class);
    }
    
    private LikeEndpointOuterClass$LikeEndpoint() {
        this.c = 0;
        this.i = 2;
        this.g = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = LikeEndpointOuterClass$LikeEndpoint.h) == null) {
                    synchronized (LikeEndpointOuterClass$LikeEndpoint.class) {
                        if (LikeEndpointOuterClass$LikeEndpoint.h == null) {
                            LikeEndpointOuterClass$LikeEndpoint.h = (ahdd)new ahba((ahbh)LikeEndpointOuterClass$LikeEndpoint.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return LikeEndpointOuterClass$LikeEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)LikeEndpointOuterClass$LikeEndpoint.a);
            }
            case 3: {
                return new LikeEndpointOuterClass$LikeEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)LikeEndpointOuterClass$LikeEndpoint.a, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0001\u0001\u0001\u100c\u0000\u0002\u1009\u0001\u0003\u041b\u0006\u103b\u0000\u0007\u103b\u0000\b\u103b\u0000", new Object[] { "d", "c", "b", "e", alog.a(), "f", "g", aiqj.class });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}

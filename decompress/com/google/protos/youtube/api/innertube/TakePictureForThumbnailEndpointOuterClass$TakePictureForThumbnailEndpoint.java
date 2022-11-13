// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint extends ahbh implements ahcw
{
    public static final TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint a;
    private static volatile ahdd c;
    public static final ahbf takePictureForThumbnailEndpoint;
    public String b;
    private int d;
    
    static {
        final TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint a2 = new TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint();
        ahbh.registerDefaultInstance((Class)TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.class, (ahbh)(a = a2));
        takePictureForThumbnailEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 124581055, ahek.k, (Class)TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.class);
    }
    
    private TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.c) == null) {
                    synchronized (TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.class) {
                        if (TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.c == null) {
                            TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.c = (ahdd)new ahba((ahbh)TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.a);
            }
            case 3: {
                return new TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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

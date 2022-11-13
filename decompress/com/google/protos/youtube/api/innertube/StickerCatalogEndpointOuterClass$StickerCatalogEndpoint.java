// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class StickerCatalogEndpointOuterClass$StickerCatalogEndpoint extends ahbh implements ahcw
{
    public static final StickerCatalogEndpointOuterClass$StickerCatalogEndpoint a;
    private static volatile ahdd b;
    public static final ahbf stickerCatalogEndpoint;
    private int c;
    private anuv d;
    private byte e;
    
    static {
        final StickerCatalogEndpointOuterClass$StickerCatalogEndpoint a2 = new StickerCatalogEndpointOuterClass$StickerCatalogEndpoint();
        ahbh.registerDefaultInstance((Class)StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.class, (ahbh)(a = a2));
        stickerCatalogEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 153501069, ahek.k, (Class)StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.class);
    }
    
    private StickerCatalogEndpointOuterClass$StickerCatalogEndpoint() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.b) == null) {
                    synchronized (StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.class) {
                        if (StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.b == null) {
                            StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.b = (ahdd)new ahba((ahbh)StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.a);
            }
            case 3: {
                return new StickerCatalogEndpointOuterClass$StickerCatalogEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint extends ahbh implements ahcw
{
    public static final MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint a;
    private static volatile ahdd b;
    public static final ahbf multiPageStickerCatalogEndpoint;
    
    static {
        final MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint a2 = new MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint();
        ahbh.registerDefaultInstance((Class)MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.class, (ahbh)(a = a2));
        multiPageStickerCatalogEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 167996903, ahek.k, (Class)MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.class);
    }
    
    private MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.b) == null) {
                    synchronized (MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.class) {
                        if (MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.b == null) {
                            MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.b = (ahdd)new ahba((ahbh)MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.a);
            }
            case 3: {
                return new MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.a, "\u0001\u0000", (Object[])null);
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

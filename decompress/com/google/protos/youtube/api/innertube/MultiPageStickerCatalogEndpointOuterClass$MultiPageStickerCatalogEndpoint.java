// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint extends agzi implements ahax
{
    public static final MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint a;
    private static volatile ahbe b;
    public static final agzg multiPageStickerCatalogEndpoint;
    
    static {
        final MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint a2 = new MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint();
        agzi.registerDefaultInstance((Class)MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.class, (agzi)(a = a2));
        multiPageStickerCatalogEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 167996903, ahcm.k, (Class)MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.class);
    }
    
    private MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.b) == null) {
                    synchronized (MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.class) {
                        if (MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.b == null) {
                            MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.b = (ahbe)new agzb((agzi)MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.a;
            }
            case 4: {
                return new agza((agzi)MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.a);
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

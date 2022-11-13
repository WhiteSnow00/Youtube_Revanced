// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint extends ahbh implements ahcw
{
    public static final OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint a;
    private static volatile ahdd b;
    public static final ahbf offlineRefreshEndpoint;
    
    static {
        final OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint a2 = new OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint();
        ahbh.registerDefaultInstance((Class)OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class, (ahbh)(a = a2));
        offlineRefreshEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 140507150, ahek.k, (Class)OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class);
    }
    
    private OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.b) == null) {
                    synchronized (OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class) {
                        if (OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.b == null) {
                            OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.b = (ahdd)new ahba((ahbh)OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.a);
            }
            case 3: {
                return new OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.a, "\u0001\u0000", (Object[])null);
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

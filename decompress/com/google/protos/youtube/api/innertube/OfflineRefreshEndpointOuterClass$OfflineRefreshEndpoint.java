// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint extends agzi implements ahax
{
    public static final OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint a;
    private static volatile ahbe b;
    public static final agzg offlineRefreshEndpoint;
    
    static {
        final OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint a2 = new OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint();
        agzi.registerDefaultInstance((Class)OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class, (agzi)(a = a2));
        offlineRefreshEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 140507150, ahcm.k, (Class)OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class);
    }
    
    private OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.b) == null) {
                    synchronized (OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class) {
                        if (OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.b == null) {
                            OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.b = (ahbe)new agzb((agzi)OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.a;
            }
            case 4: {
                return new agza((agzi)OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.a);
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

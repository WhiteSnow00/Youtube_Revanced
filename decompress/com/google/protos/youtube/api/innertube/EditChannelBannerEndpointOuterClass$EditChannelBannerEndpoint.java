// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint extends agzi implements ahax
{
    public static final EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint a;
    private static volatile ahbe b;
    public static final agzg editChannelBannerEndpoint;
    
    static {
        final EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint a2 = new EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint();
        agzi.registerDefaultInstance((Class)EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.class, (agzi)(a = a2));
        editChannelBannerEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 113001276, ahcm.k, (Class)EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.class);
    }
    
    private EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.b) == null) {
                    synchronized (EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.class) {
                        if (EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.b == null) {
                            EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.b = (ahbe)new agzb((agzi)EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.a;
            }
            case 4: {
                return new agza((agzi)EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.a);
            }
            case 3: {
                return new EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.a, "\u0001\u0000", (Object[])null);
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

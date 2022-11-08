// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint extends agzi implements ahax
{
    public static final LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint a;
    private static volatile ahbe c;
    public static final agzg liveChatPurchaseMessageEndpoint;
    public agyc b;
    private int d;
    
    static {
        final LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint a2 = new LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint();
        agzi.registerDefaultInstance((Class)LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.class, (agzi)(a = a2));
        liveChatPurchaseMessageEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 133030216, ahcm.k, (Class)LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.class);
    }
    
    private LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint() {
        this.b = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.c) == null) {
                    synchronized (LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.class) {
                        if (LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.c == null) {
                            LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.c = (ahbe)new agzb((agzi)LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.a;
            }
            case 4: {
                return new agza((agzi)LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.a);
            }
            case 3: {
                return new LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "d", "b" });
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

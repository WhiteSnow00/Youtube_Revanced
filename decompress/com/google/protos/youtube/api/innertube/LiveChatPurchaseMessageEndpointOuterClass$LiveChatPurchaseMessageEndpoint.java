// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint extends ahbh implements ahcw
{
    public static final LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint a;
    private static volatile ahdd c;
    public static final ahbf liveChatPurchaseMessageEndpoint;
    public ahab b;
    private int d;
    
    static {
        final LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint a2 = new LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint();
        ahbh.registerDefaultInstance((Class)LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.class, (ahbh)(a = a2));
        liveChatPurchaseMessageEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 133030216, ahek.k, (Class)LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.class);
    }
    
    private LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint() {
        this.b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.c) == null) {
                    synchronized (LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.class) {
                        if (LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.c == null) {
                            LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.c = (ahdd)new ahba((ahbh)LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.a);
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

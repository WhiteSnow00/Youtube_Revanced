// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatActionEndpointOuterClass$LiveChatActionEndpoint extends ahbh implements ahcw
{
    public static final LiveChatActionEndpointOuterClass$LiveChatActionEndpoint a;
    private static volatile ahdd c;
    public static final ahbf liveChatActionEndpoint;
    public ahab b;
    private int d;
    
    static {
        final LiveChatActionEndpointOuterClass$LiveChatActionEndpoint a2 = new LiveChatActionEndpointOuterClass$LiveChatActionEndpoint();
        ahbh.registerDefaultInstance((Class)LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.class, (ahbh)(a = a2));
        liveChatActionEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 256231008, ahek.k, (Class)LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.class);
    }
    
    private LiveChatActionEndpointOuterClass$LiveChatActionEndpoint() {
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
                if ((c = LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.c) == null) {
                    synchronized (LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.class) {
                        if (LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.c == null) {
                            LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.c = (ahdd)new ahba((ahbh)LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.a);
            }
            case 3: {
                return new LiveChatActionEndpointOuterClass$LiveChatActionEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "d", "b" });
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

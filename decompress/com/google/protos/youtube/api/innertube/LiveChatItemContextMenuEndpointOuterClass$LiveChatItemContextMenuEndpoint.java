// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint extends ahbh implements ahcw
{
    public static final LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint a;
    private static volatile ahdd c;
    public static final ahbf liveChatItemContextMenuEndpoint;
    public ahab b;
    private int d;
    
    static {
        final LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint a2 = new LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint();
        ahbh.registerDefaultInstance((Class)LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.class, (ahbh)(a = a2));
        liveChatItemContextMenuEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 122458429, ahek.k, (Class)LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.class);
    }
    
    private LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint() {
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
                if ((c = LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.c) == null) {
                    synchronized (LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.class) {
                        if (LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.c == null) {
                            LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.c = (ahdd)new ahba((ahbh)LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.a);
            }
            case 3: {
                return new LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "d", "b" });
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

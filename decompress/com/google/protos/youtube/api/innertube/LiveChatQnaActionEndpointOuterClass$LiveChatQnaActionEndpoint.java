// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint extends ahbh implements ahcw
{
    public static final LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint a;
    private static volatile ahdd c;
    public static final ahbf liveChatQnaActionEndpoint;
    public ahab b;
    private int d;
    
    static {
        final LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint a2 = new LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint();
        ahbh.registerDefaultInstance((Class)LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.class, (ahbh)(a = a2));
        liveChatQnaActionEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 399887779, ahek.k, (Class)LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.class);
    }
    
    private LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint() {
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
                if ((c = LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.c) == null) {
                    synchronized (LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.class) {
                        if (LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.c == null) {
                            LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.c = (ahdd)new ahba((ahbh)LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.a);
            }
            case 3: {
                return new LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "d", "b" });
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

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatEndpointOuterClass$LiveChatEndpoint extends ahbh implements ahcw
{
    public static final LiveChatEndpointOuterClass$LiveChatEndpoint a;
    private static volatile ahdd e;
    public static final ahbf liveChatEndpoint;
    public int b;
    public ahab c;
    public alsc d;
    private byte f;
    
    static {
        final LiveChatEndpointOuterClass$LiveChatEndpoint a2 = new LiveChatEndpointOuterClass$LiveChatEndpoint();
        ahbh.registerDefaultInstance((Class)LiveChatEndpointOuterClass$LiveChatEndpoint.class, (ahbh)(a = a2));
        liveChatEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 132716540, ahek.k, (Class)LiveChatEndpointOuterClass$LiveChatEndpoint.class);
    }
    
    private LiveChatEndpointOuterClass$LiveChatEndpoint() {
        this.f = 2;
        this.c = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = LiveChatEndpointOuterClass$LiveChatEndpoint.e) == null) {
                    synchronized (LiveChatEndpointOuterClass$LiveChatEndpoint.class) {
                        if (LiveChatEndpointOuterClass$LiveChatEndpoint.e == null) {
                            LiveChatEndpointOuterClass$LiveChatEndpoint.e = (ahdd)new ahba((ahbh)LiveChatEndpointOuterClass$LiveChatEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return LiveChatEndpointOuterClass$LiveChatEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatEndpointOuterClass$LiveChatEndpoint.a);
            }
            case 3: {
                return new LiveChatEndpointOuterClass$LiveChatEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatEndpointOuterClass$LiveChatEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u100a\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}

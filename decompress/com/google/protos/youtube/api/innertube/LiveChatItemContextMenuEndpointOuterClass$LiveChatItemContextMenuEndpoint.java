// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint extends agzi implements ahax
{
    public static final LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint a;
    private static volatile ahbe c;
    public static final agzg liveChatItemContextMenuEndpoint;
    public agyc b;
    private int d;
    
    static {
        final LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint a2 = new LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint();
        agzi.registerDefaultInstance((Class)LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.class, (agzi)(a = a2));
        liveChatItemContextMenuEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 122458429, ahcm.k, (Class)LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.class);
    }
    
    private LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint() {
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
                if ((c = LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.c) == null) {
                    synchronized (LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.class) {
                        if (LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.c == null) {
                            LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.c = (ahbe)new agzb((agzi)LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.a;
            }
            case 4: {
                return new agza((agzi)LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.a);
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

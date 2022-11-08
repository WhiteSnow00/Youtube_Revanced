// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatActionEndpointOuterClass$LiveChatActionEndpoint extends agzi implements ahax
{
    public static final LiveChatActionEndpointOuterClass$LiveChatActionEndpoint a;
    private static volatile ahbe c;
    public static final agzg liveChatActionEndpoint;
    public agyc b;
    private int d;
    
    static {
        final LiveChatActionEndpointOuterClass$LiveChatActionEndpoint a2 = new LiveChatActionEndpointOuterClass$LiveChatActionEndpoint();
        agzi.registerDefaultInstance((Class)LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.class, (agzi)(a = a2));
        liveChatActionEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 256231008, ahcm.k, (Class)LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.class);
    }
    
    private LiveChatActionEndpointOuterClass$LiveChatActionEndpoint() {
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
                if ((c = LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.c) == null) {
                    synchronized (LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.class) {
                        if (LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.c == null) {
                            LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.c = (ahbe)new agzb((agzi)LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.a;
            }
            case 4: {
                return new agza((agzi)LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.a);
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

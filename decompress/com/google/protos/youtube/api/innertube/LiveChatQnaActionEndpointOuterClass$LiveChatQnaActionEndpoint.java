// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint extends agzi implements ahax
{
    public static final LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint a;
    private static volatile ahbe c;
    public static final agzg liveChatQnaActionEndpoint;
    public agyc b;
    private int d;
    
    static {
        final LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint a2 = new LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint();
        agzi.registerDefaultInstance((Class)LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.class, (agzi)(a = a2));
        liveChatQnaActionEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 399887779, ahcm.k, (Class)LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.class);
    }
    
    private LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint() {
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
                if ((c = LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.c) == null) {
                    synchronized (LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.class) {
                        if (LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.c == null) {
                            LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.c = (ahbe)new agzb((agzi)LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.a;
            }
            case 4: {
                return new agza((agzi)LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.a);
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

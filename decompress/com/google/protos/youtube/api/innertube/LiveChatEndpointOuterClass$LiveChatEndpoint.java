// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatEndpointOuterClass$LiveChatEndpoint extends agzi implements ahax
{
    public static final LiveChatEndpointOuterClass$LiveChatEndpoint a;
    private static volatile ahbe e;
    public static final agzg liveChatEndpoint;
    public int b;
    public agyc c;
    public alpz d;
    private byte f;
    
    static {
        final LiveChatEndpointOuterClass$LiveChatEndpoint a2 = new LiveChatEndpointOuterClass$LiveChatEndpoint();
        agzi.registerDefaultInstance((Class)LiveChatEndpointOuterClass$LiveChatEndpoint.class, (agzi)(a = a2));
        liveChatEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 132716540, ahcm.k, (Class)LiveChatEndpointOuterClass$LiveChatEndpoint.class);
    }
    
    private LiveChatEndpointOuterClass$LiveChatEndpoint() {
        this.f = 2;
        this.c = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = LiveChatEndpointOuterClass$LiveChatEndpoint.e) == null) {
                    synchronized (LiveChatEndpointOuterClass$LiveChatEndpoint.class) {
                        if (LiveChatEndpointOuterClass$LiveChatEndpoint.e == null) {
                            LiveChatEndpointOuterClass$LiveChatEndpoint.e = (ahbe)new agzb((agzi)LiveChatEndpointOuterClass$LiveChatEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return LiveChatEndpointOuterClass$LiveChatEndpoint.a;
            }
            case 4: {
                return new agza((agzi)LiveChatEndpointOuterClass$LiveChatEndpoint.a);
            }
            case 3: {
                return new LiveChatEndpointOuterClass$LiveChatEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatEndpointOuterClass$LiveChatEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u100a\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint extends agzi implements ahax
{
    public static final ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint a;
    private static volatile ahbe c;
    public static final agzg moderateLiveChatEndpoint;
    public agyc b;
    private int d;
    
    static {
        final ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint a2 = new ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint();
        agzi.registerDefaultInstance((Class)ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.class, (agzi)(a = a2));
        moderateLiveChatEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 125606357, ahcm.k, (Class)ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.class);
    }
    
    private ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint() {
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
                if ((c = ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.c) == null) {
                    synchronized (ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.class) {
                        if (ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.c == null) {
                            ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.c = (ahbe)new agzb((agzi)ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.a);
            }
            case 3: {
                return new ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "d", "b" });
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

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint extends ahbh implements ahcw
{
    public static final ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint a;
    private static volatile ahdd c;
    public static final ahbf moderateLiveChatEndpoint;
    public ahab b;
    private int d;
    
    static {
        final ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint a2 = new ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint();
        ahbh.registerDefaultInstance((Class)ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.class, (ahbh)(a = a2));
        moderateLiveChatEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 125606357, ahek.k, (Class)ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.class);
    }
    
    private ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint() {
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
                if ((c = ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.c) == null) {
                    synchronized (ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.class) {
                        if (ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.c == null) {
                            ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.c = (ahdd)new ahba((ahbh)ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.a);
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

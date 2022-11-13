// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint extends ahbh implements ahcw
{
    public static final ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint a;
    private static volatile ahdd c;
    public static final ahbf manageLiveChatUserEndpoint;
    public ahab b;
    private int d;
    
    static {
        final ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint a2 = new ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint();
        ahbh.registerDefaultInstance((Class)ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.class, (ahbh)(a = a2));
        manageLiveChatUserEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 133716455, ahek.k, (Class)ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.class);
    }
    
    private ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint() {
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
                if ((c = ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.c) == null) {
                    synchronized (ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.class) {
                        if (ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.c == null) {
                            ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.c = (ahdd)new ahba((ahbh)ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.a);
            }
            case 3: {
                return new ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "d", "b" });
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

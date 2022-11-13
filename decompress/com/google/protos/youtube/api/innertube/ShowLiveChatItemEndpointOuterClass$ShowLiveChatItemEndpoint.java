// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint extends ahbh implements ahcw
{
    public static final ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint a;
    private static volatile ahdd d;
    public static final ahbf showLiveChatItemEndpoint;
    public int b;
    public alqh c;
    private ahhu e;
    private byte f;
    
    static {
        final ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint a2 = new ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint();
        ahbh.registerDefaultInstance((Class)ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.class, (ahbh)(a = a2));
        showLiveChatItemEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 135843030, ahek.k, (Class)ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.class);
    }
    
    private ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint() {
        this.f = 2;
        final ahab b = ahab.b;
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
                final ahdd d;
                if ((d = ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.d) == null) {
                    synchronized (ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.class) {
                        if (ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.d == null) {
                            ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.d = (ahdd)new ahba((ahbh)ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.a);
            }
            case 3: {
                return new ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "e" });
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

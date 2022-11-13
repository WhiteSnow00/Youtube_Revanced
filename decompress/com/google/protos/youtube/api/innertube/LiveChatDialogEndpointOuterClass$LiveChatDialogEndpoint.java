// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint extends ahbh implements ahcw
{
    public static final LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint a;
    private static volatile ahdd c;
    public static final ahbf liveChatDialogEndpoint;
    public alpt b;
    private int d;
    private byte e;
    
    static {
        final LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint a2 = new LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint();
        ahbh.registerDefaultInstance((Class)LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.class, (ahbh)(a = a2));
        liveChatDialogEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 146867030, ahek.k, (Class)LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.class);
    }
    
    private LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.c) == null) {
                    synchronized (LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.class) {
                        if (LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.c == null) {
                            LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.c = (ahdd)new ahba((ahbh)LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.a);
            }
            case 3: {
                return new LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}

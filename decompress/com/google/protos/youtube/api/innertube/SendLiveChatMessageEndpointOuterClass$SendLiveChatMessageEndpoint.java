// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint extends ahbh implements ahcw
{
    public static final SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint a;
    private static volatile ahdd e;
    public static final ahbf sendLiveChatMessageEndpoint;
    public ahab b;
    public ahbx c;
    public String d;
    private int f;
    private byte g;
    
    static {
        final SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint a2 = new SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint();
        ahbh.registerDefaultInstance((Class)SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.class, (ahbh)(a = a2));
        sendLiveChatMessageEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 120929770, ahek.k, (Class)SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.class);
    }
    
    private SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint() {
        this.g = 2;
        this.b = ahab.b;
        this.c = emptyProtobufList();
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.e) == null) {
                    synchronized (SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.class) {
                        if (SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.e == null) {
                            SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.e = (ahdd)new ahba((ahbh)SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.a);
            }
            case 3: {
                return new SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\u100a\u0000\u0002\u041b\u0003\u1008\u0001", new Object[] { "f", "b", "c", aiqj.class, "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint extends ahbh implements ahcw
{
    public static final SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint a;
    private static volatile ahdd c;
    public static final ahbf sendLiveChatVoteEndpoint;
    public ahab b;
    private int d;
    
    static {
        final SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint a2 = new SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint();
        ahbh.registerDefaultInstance((Class)SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.class, (ahbh)(a = a2));
        sendLiveChatVoteEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 239906307, ahek.k, (Class)SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.class);
    }
    
    private SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint() {
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
                if ((c = SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.c) == null) {
                    synchronized (SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.class) {
                        if (SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.c == null) {
                            SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.c = (ahdd)new ahba((ahbh)SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.a);
            }
            case 3: {
                return new SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "d", "b" });
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

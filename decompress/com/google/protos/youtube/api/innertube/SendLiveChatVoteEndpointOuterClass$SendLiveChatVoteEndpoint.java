// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint extends agzi implements ahax
{
    public static final SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint a;
    private static volatile ahbe c;
    public static final agzg sendLiveChatVoteEndpoint;
    public agyc b;
    private int d;
    
    static {
        final SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint a2 = new SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint();
        agzi.registerDefaultInstance((Class)SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.class, (agzi)(a = a2));
        sendLiveChatVoteEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 239906307, ahcm.k, (Class)SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.class);
    }
    
    private SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint() {
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
                if ((c = SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.c) == null) {
                    synchronized (SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.class) {
                        if (SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.c == null) {
                            SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.c = (ahbe)new agzb((agzi)SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.a;
            }
            case 4: {
                return new agza((agzi)SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.a);
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

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SendShareEndpoint$SendShareToConversationEndpoint extends agzi implements ahax
{
    public static final SendShareEndpoint$SendShareToConversationEndpoint a;
    private static volatile ahbe b;
    public static final agzg sendShareToConversationEndpoint;
    private int c;
    private aiwu d;
    private ajsq e;
    private byte f;
    
    static {
        final SendShareEndpoint$SendShareToConversationEndpoint a2 = new SendShareEndpoint$SendShareToConversationEndpoint();
        agzi.registerDefaultInstance((Class)SendShareEndpoint$SendShareToConversationEndpoint.class, (agzi)(a = a2));
        sendShareToConversationEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 92589349, ahcm.k, (Class)SendShareEndpoint$SendShareToConversationEndpoint.class);
    }
    
    private SendShareEndpoint$SendShareToConversationEndpoint() {
        this.f = 2;
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
                final ahbe b2;
                if ((b2 = SendShareEndpoint$SendShareToConversationEndpoint.b) == null) {
                    synchronized (SendShareEndpoint$SendShareToConversationEndpoint.class) {
                        if (SendShareEndpoint$SendShareToConversationEndpoint.b == null) {
                            SendShareEndpoint$SendShareToConversationEndpoint.b = (ahbe)new agzb((agzi)SendShareEndpoint$SendShareToConversationEndpoint.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return SendShareEndpoint$SendShareToConversationEndpoint.a;
            }
            case 4: {
                return new agza((agzi)SendShareEndpoint$SendShareToConversationEndpoint.a);
            }
            case 3: {
                return new SendShareEndpoint$SendShareToConversationEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SendShareEndpoint$SendShareToConversationEndpoint.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e" });
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

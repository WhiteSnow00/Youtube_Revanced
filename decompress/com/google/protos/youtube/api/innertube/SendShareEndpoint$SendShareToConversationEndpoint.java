// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SendShareEndpoint$SendShareToConversationEndpoint extends ahbh implements ahcw
{
    public static final SendShareEndpoint$SendShareToConversationEndpoint a;
    private static volatile ahdd b;
    public static final ahbf sendShareToConversationEndpoint;
    private int c;
    private aiyz d;
    private ajut e;
    private byte f;
    
    static {
        final SendShareEndpoint$SendShareToConversationEndpoint a2 = new SendShareEndpoint$SendShareToConversationEndpoint();
        ahbh.registerDefaultInstance((Class)SendShareEndpoint$SendShareToConversationEndpoint.class, (ahbh)(a = a2));
        sendShareToConversationEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 92589349, ahek.k, (Class)SendShareEndpoint$SendShareToConversationEndpoint.class);
    }
    
    private SendShareEndpoint$SendShareToConversationEndpoint() {
        this.f = 2;
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
                final ahdd b;
                if ((b = SendShareEndpoint$SendShareToConversationEndpoint.b) == null) {
                    synchronized (SendShareEndpoint$SendShareToConversationEndpoint.class) {
                        if (SendShareEndpoint$SendShareToConversationEndpoint.b == null) {
                            SendShareEndpoint$SendShareToConversationEndpoint.b = (ahdd)new ahba((ahbh)SendShareEndpoint$SendShareToConversationEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return SendShareEndpoint$SendShareToConversationEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)SendShareEndpoint$SendShareToConversationEndpoint.a);
            }
            case 3: {
                return new SendShareEndpoint$SendShareToConversationEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SendShareEndpoint$SendShareToConversationEndpoint.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e" });
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

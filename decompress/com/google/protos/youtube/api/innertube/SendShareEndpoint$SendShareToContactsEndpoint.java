// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SendShareEndpoint$SendShareToContactsEndpoint extends ahbh implements ahcw
{
    public static final SendShareEndpoint$SendShareToContactsEndpoint a;
    private static volatile ahdd e;
    public static final ahbf sendShareToContactsEndpoint;
    public int b;
    public akjm c;
    public akjl d;
    private aiyz f;
    private aiqj g;
    private byte h;
    
    static {
        final SendShareEndpoint$SendShareToContactsEndpoint a2 = new SendShareEndpoint$SendShareToContactsEndpoint();
        ahbh.registerDefaultInstance((Class)SendShareEndpoint$SendShareToContactsEndpoint.class, (ahbh)(a = a2));
        sendShareToContactsEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 92775415, ahek.k, (Class)SendShareEndpoint$SendShareToContactsEndpoint.class);
    }
    
    private SendShareEndpoint$SendShareToContactsEndpoint() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = SendShareEndpoint$SendShareToContactsEndpoint.e) == null) {
                    synchronized (SendShareEndpoint$SendShareToContactsEndpoint.class) {
                        if (SendShareEndpoint$SendShareToContactsEndpoint.e == null) {
                            SendShareEndpoint$SendShareToContactsEndpoint.e = (ahdd)new ahba((ahbh)SendShareEndpoint$SendShareToContactsEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return SendShareEndpoint$SendShareToContactsEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)SendShareEndpoint$SendShareToContactsEndpoint.a);
            }
            case 3: {
                return new SendShareEndpoint$SendShareToContactsEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SendShareEndpoint$SendShareToContactsEndpoint.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}

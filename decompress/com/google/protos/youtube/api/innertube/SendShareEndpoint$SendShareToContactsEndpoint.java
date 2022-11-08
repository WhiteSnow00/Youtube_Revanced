// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SendShareEndpoint$SendShareToContactsEndpoint extends agzi implements ahax
{
    public static final SendShareEndpoint$SendShareToContactsEndpoint a;
    private static volatile ahbe e;
    public static final agzg sendShareToContactsEndpoint;
    public int b;
    public akhj c;
    public akhi d;
    private aiwu f;
    private aioe g;
    private byte h;
    
    static {
        final SendShareEndpoint$SendShareToContactsEndpoint a2 = new SendShareEndpoint$SendShareToContactsEndpoint();
        agzi.registerDefaultInstance((Class)SendShareEndpoint$SendShareToContactsEndpoint.class, (agzi)(a = a2));
        sendShareToContactsEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 92775415, ahcm.k, (Class)SendShareEndpoint$SendShareToContactsEndpoint.class);
    }
    
    private SendShareEndpoint$SendShareToContactsEndpoint() {
        this.h = 2;
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
                final ahbe e;
                if ((e = SendShareEndpoint$SendShareToContactsEndpoint.e) == null) {
                    synchronized (SendShareEndpoint$SendShareToContactsEndpoint.class) {
                        if (SendShareEndpoint$SendShareToContactsEndpoint.e == null) {
                            SendShareEndpoint$SendShareToContactsEndpoint.e = (ahbe)new agzb((agzi)SendShareEndpoint$SendShareToContactsEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return SendShareEndpoint$SendShareToContactsEndpoint.a;
            }
            case 4: {
                return new agza((agzi)SendShareEndpoint$SendShareToContactsEndpoint.a);
            }
            case 3: {
                return new SendShareEndpoint$SendShareToContactsEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SendShareEndpoint$SendShareToContactsEndpoint.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SendShareEndpoint$SendShareExternallyEndpoint extends ahbh implements ahcw
{
    public static final SendShareEndpoint$SendShareExternallyEndpoint a;
    private static volatile ahdd f;
    public static final ahbf sendShareExternallyEndpoint;
    public int b;
    public akjm c;
    public akjk d;
    public akjj e;
    private byte g;
    
    static {
        final SendShareEndpoint$SendShareExternallyEndpoint a2 = new SendShareEndpoint$SendShareExternallyEndpoint();
        ahbh.registerDefaultInstance((Class)SendShareEndpoint$SendShareExternallyEndpoint.class, (ahbh)(a = a2));
        sendShareExternallyEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 92310068, ahek.k, (Class)SendShareEndpoint$SendShareExternallyEndpoint.class);
    }
    
    private SendShareEndpoint$SendShareExternallyEndpoint() {
        this.g = 2;
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
                final ahdd f;
                if ((f = SendShareEndpoint$SendShareExternallyEndpoint.f) == null) {
                    synchronized (SendShareEndpoint$SendShareExternallyEndpoint.class) {
                        if (SendShareEndpoint$SendShareExternallyEndpoint.f == null) {
                            SendShareEndpoint$SendShareExternallyEndpoint.f = (ahdd)new ahba((ahbh)SendShareEndpoint$SendShareExternallyEndpoint.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return SendShareEndpoint$SendShareExternallyEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)SendShareEndpoint$SendShareExternallyEndpoint.a);
            }
            case 3: {
                return new SendShareEndpoint$SendShareExternallyEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SendShareEndpoint$SendShareExternallyEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u1009\u0000\u0002\u1009\u0001\u0004\u1409\u0002", new Object[] { "b", "c", "d", "e" });
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

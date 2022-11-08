// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SendShareEndpoint$SendShareExternallyEndpoint extends agzi implements ahax
{
    public static final SendShareEndpoint$SendShareExternallyEndpoint a;
    private static volatile ahbe f;
    public static final agzg sendShareExternallyEndpoint;
    public int b;
    public akhj c;
    public akhh d;
    public akhg e;
    private byte g;
    
    static {
        final SendShareEndpoint$SendShareExternallyEndpoint a2 = new SendShareEndpoint$SendShareExternallyEndpoint();
        agzi.registerDefaultInstance((Class)SendShareEndpoint$SendShareExternallyEndpoint.class, (agzi)(a = a2));
        sendShareExternallyEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 92310068, ahcm.k, (Class)SendShareEndpoint$SendShareExternallyEndpoint.class);
    }
    
    private SendShareEndpoint$SendShareExternallyEndpoint() {
        this.g = 2;
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
                final ahbe f;
                if ((f = SendShareEndpoint$SendShareExternallyEndpoint.f) == null) {
                    synchronized (SendShareEndpoint$SendShareExternallyEndpoint.class) {
                        if (SendShareEndpoint$SendShareExternallyEndpoint.f == null) {
                            SendShareEndpoint$SendShareExternallyEndpoint.f = (ahbe)new agzb((agzi)SendShareEndpoint$SendShareExternallyEndpoint.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return SendShareEndpoint$SendShareExternallyEndpoint.a;
            }
            case 4: {
                return new agza((agzi)SendShareEndpoint$SendShareExternallyEndpoint.a);
            }
            case 3: {
                return new SendShareEndpoint$SendShareExternallyEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SendShareEndpoint$SendShareExternallyEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u1009\u0000\u0002\u1009\u0001\u0004\u1409\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}

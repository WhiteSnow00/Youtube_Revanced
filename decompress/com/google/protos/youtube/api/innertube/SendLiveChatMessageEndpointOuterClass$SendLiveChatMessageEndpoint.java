// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint extends agzi implements ahax
{
    public static final SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint a;
    private static volatile ahbe e;
    public static final agzg sendLiveChatMessageEndpoint;
    public agyc b;
    public agzy c;
    public String d;
    private int f;
    private byte g;
    
    static {
        final SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint a2 = new SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint();
        agzi.registerDefaultInstance((Class)SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.class, (agzi)(a = a2));
        sendLiveChatMessageEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 120929770, ahcm.k, (Class)SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.class);
    }
    
    private SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint() {
        this.g = 2;
        this.b = agyc.b;
        this.c = emptyProtobufList();
        this.d = "";
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
                if ((e = SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.e) == null) {
                    synchronized (SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.class) {
                        if (SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.e == null) {
                            SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.e = (ahbe)new agzb((agzi)SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.a;
            }
            case 4: {
                return new agza((agzi)SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.a);
            }
            case 3: {
                return new SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\u100a\u0000\u0002\u041b\u0003\u1008\u0001", new Object[] { "f", "b", "c", aioe.class, "d" });
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

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SendSmsEndpointOuterClass$SendSmsEndpoint extends agzi implements ahax
{
    public static final SendSmsEndpointOuterClass$SendSmsEndpoint a;
    private static volatile ahbe e;
    public static final agzg sendSmsEndpoint;
    public agzy b;
    public String c;
    public String d;
    private int f;
    
    static {
        final SendSmsEndpointOuterClass$SendSmsEndpoint a2 = new SendSmsEndpointOuterClass$SendSmsEndpoint();
        agzi.registerDefaultInstance((Class)SendSmsEndpointOuterClass$SendSmsEndpoint.class, (agzi)(a = a2));
        sendSmsEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 75581109, ahcm.k, (Class)SendSmsEndpointOuterClass$SendSmsEndpoint.class);
    }
    
    private SendSmsEndpointOuterClass$SendSmsEndpoint() {
        this.b = agzi.emptyProtobufList();
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = SendSmsEndpointOuterClass$SendSmsEndpoint.e) == null) {
                    synchronized (SendSmsEndpointOuterClass$SendSmsEndpoint.class) {
                        if (SendSmsEndpointOuterClass$SendSmsEndpoint.e == null) {
                            SendSmsEndpointOuterClass$SendSmsEndpoint.e = (ahbe)new agzb((agzi)SendSmsEndpointOuterClass$SendSmsEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return SendSmsEndpointOuterClass$SendSmsEndpoint.a;
            }
            case 4: {
                return new agza((agzi)SendSmsEndpointOuterClass$SendSmsEndpoint.a);
            }
            case 3: {
                return new SendSmsEndpointOuterClass$SendSmsEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SendSmsEndpointOuterClass$SendSmsEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002\u1008\u0000\u0003\u1008\u0001", new Object[] { "f", "b", "c", "d" });
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

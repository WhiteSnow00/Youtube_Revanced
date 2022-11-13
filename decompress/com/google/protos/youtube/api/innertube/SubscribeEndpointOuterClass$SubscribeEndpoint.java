// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SubscribeEndpointOuterClass$SubscribeEndpoint extends ahbh implements ahcw
{
    public static final SubscribeEndpointOuterClass$SubscribeEndpoint a;
    private static volatile ahdd e;
    public static final ahbf subscribeEndpoint;
    public ahbx b;
    public String c;
    public String d;
    private int f;
    
    static {
        final SubscribeEndpointOuterClass$SubscribeEndpoint a2 = new SubscribeEndpointOuterClass$SubscribeEndpoint();
        ahbh.registerDefaultInstance((Class)SubscribeEndpointOuterClass$SubscribeEndpoint.class, (ahbh)(a = a2));
        subscribeEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 68997349, ahek.k, (Class)SubscribeEndpointOuterClass$SubscribeEndpoint.class);
    }
    
    private SubscribeEndpointOuterClass$SubscribeEndpoint() {
        this.b = ahbh.emptyProtobufList();
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = SubscribeEndpointOuterClass$SubscribeEndpoint.e) == null) {
                    synchronized (SubscribeEndpointOuterClass$SubscribeEndpoint.class) {
                        if (SubscribeEndpointOuterClass$SubscribeEndpoint.e == null) {
                            SubscribeEndpointOuterClass$SubscribeEndpoint.e = (ahdd)new ahba((ahbh)SubscribeEndpointOuterClass$SubscribeEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return SubscribeEndpointOuterClass$SubscribeEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)SubscribeEndpointOuterClass$SubscribeEndpoint.a);
            }
            case 3: {
                return new SubscribeEndpointOuterClass$SubscribeEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SubscribeEndpointOuterClass$SubscribeEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002\u1008\u0000\u0003\u1008\u0001", new Object[] { "f", "b", "c", "d" });
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

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UnsubscribeEndpointOuterClass$UnsubscribeEndpoint extends ahbh implements ahcw
{
    public static final UnsubscribeEndpointOuterClass$UnsubscribeEndpoint a;
    private static volatile ahdd f;
    public static final ahbf unsubscribeEndpoint;
    public int b;
    public ahbx c;
    public String d;
    public String e;
    private apfq g;
    private byte h;
    
    static {
        final UnsubscribeEndpointOuterClass$UnsubscribeEndpoint a2 = new UnsubscribeEndpointOuterClass$UnsubscribeEndpoint();
        ahbh.registerDefaultInstance((Class)UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.class, (ahbh)(a = a2));
        unsubscribeEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 68997401, ahek.k, (Class)UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.class);
    }
    
    private UnsubscribeEndpointOuterClass$UnsubscribeEndpoint() {
        this.h = 2;
        this.c = ahbh.emptyProtobufList();
        this.d = "";
        this.e = "";
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
                final ahdd f;
                if ((f = UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.f) == null) {
                    synchronized (UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.class) {
                        if (UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.f == null) {
                            UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.f = (ahdd)new ahba((ahbh)UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.a);
            }
            case 3: {
                return new UnsubscribeEndpointOuterClass$UnsubscribeEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001\u001a\u0002\u1008\u0000\u0004\u1008\u0001\u0005\u1409\u0002", new Object[] { "b", "c", "d", "e", "g" });
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

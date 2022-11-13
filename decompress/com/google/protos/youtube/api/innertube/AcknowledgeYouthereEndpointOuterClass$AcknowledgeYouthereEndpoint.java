// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint extends ahbh implements ahcw
{
    public static final AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint a;
    public static final ahbf acknowledgeYouthereEndpoint;
    private static volatile ahdd d;
    public int b;
    public apvt c;
    private byte e;
    
    static {
        final AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint a2 = new AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint();
        ahbh.registerDefaultInstance((Class)AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.class, (ahbh)(a = a2));
        acknowledgeYouthereEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 333157331, ahek.k, (Class)AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.class);
    }
    
    private AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.d) == null) {
                    synchronized (AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.class) {
                        if (AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.d == null) {
                            AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.d = (ahdd)new ahba((ahbh)AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.a);
            }
            case 3: {
                return new AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}

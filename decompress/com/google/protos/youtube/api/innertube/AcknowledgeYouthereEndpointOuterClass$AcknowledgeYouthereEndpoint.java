// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint extends agzi implements ahax
{
    public static final AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint a;
    public static final agzg acknowledgeYouthereEndpoint;
    private static volatile ahbe d;
    public int b;
    public aptj c;
    private byte e;
    
    static {
        final AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint a2 = new AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint();
        agzi.registerDefaultInstance((Class)AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.class, (agzi)(a = a2));
        acknowledgeYouthereEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 333157331, ahcm.k, (Class)AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.class);
    }
    
    private AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint() {
        this.e = 2;
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
                final ahbe d;
                if ((d = AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.d) == null) {
                    synchronized (AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.class) {
                        if (AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.d == null) {
                            AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.d = (ahbe)new agzb((agzi)AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.a;
            }
            case 4: {
                return new agza((agzi)AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.a);
            }
            case 3: {
                return new AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}

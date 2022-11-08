// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class DismissalEndpointOuterClass$DismissalEndpoint extends agzi implements ahax
{
    public static final DismissalEndpointOuterClass$DismissalEndpoint a;
    private static volatile ahbe d;
    public static final agzg dismissalEndpoint;
    public String b;
    public agzy c;
    private int e;
    private byte f;
    
    static {
        final DismissalEndpointOuterClass$DismissalEndpoint a2 = new DismissalEndpointOuterClass$DismissalEndpoint();
        agzi.registerDefaultInstance((Class)DismissalEndpointOuterClass$DismissalEndpoint.class, (agzi)(a = a2));
        dismissalEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 63120728, ahcm.k, (Class)DismissalEndpointOuterClass$DismissalEndpoint.class);
    }
    
    private DismissalEndpointOuterClass$DismissalEndpoint() {
        this.f = 2;
        this.b = "";
        this.c = emptyProtobufList();
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
                if ((d = DismissalEndpointOuterClass$DismissalEndpoint.d) == null) {
                    synchronized (DismissalEndpointOuterClass$DismissalEndpoint.class) {
                        if (DismissalEndpointOuterClass$DismissalEndpoint.d == null) {
                            DismissalEndpointOuterClass$DismissalEndpoint.d = (ahbe)new agzb((agzi)DismissalEndpointOuterClass$DismissalEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return DismissalEndpointOuterClass$DismissalEndpoint.a;
            }
            case 4: {
                return new agza((agzi)DismissalEndpointOuterClass$DismissalEndpoint.a);
            }
            case 3: {
                return new DismissalEndpointOuterClass$DismissalEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)DismissalEndpointOuterClass$DismissalEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u041b", new Object[] { "e", "b", "c", aioe.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}

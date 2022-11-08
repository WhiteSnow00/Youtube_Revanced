// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint extends agzi implements ahax
{
    public static final ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint a;
    private static volatile ahbe c;
    public static final agzg managePurchaseEndpoint;
    public alys b;
    private int d;
    private byte e;
    
    static {
        final ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint a2 = new ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint();
        agzi.registerDefaultInstance((Class)ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.class, (agzi)(a = a2));
        managePurchaseEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 95591119, ahcm.k, (Class)ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.class);
    }
    
    private ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint() {
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
                final ahbe c;
                if ((c = ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.c) == null) {
                    synchronized (ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.class) {
                        if (ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.c == null) {
                            ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.c = (ahbe)new agzb((agzi)ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.a);
            }
            case 3: {
                return new ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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

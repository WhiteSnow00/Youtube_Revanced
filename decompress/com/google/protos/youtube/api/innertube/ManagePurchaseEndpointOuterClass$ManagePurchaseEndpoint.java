// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint extends ahbh implements ahcw
{
    public static final ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint a;
    private static volatile ahdd c;
    public static final ahbf managePurchaseEndpoint;
    public amaw b;
    private int d;
    private byte e;
    
    static {
        final ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint a2 = new ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint();
        ahbh.registerDefaultInstance((Class)ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.class, (ahbh)(a = a2));
        managePurchaseEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 95591119, ahek.k, (Class)ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.class);
    }
    
    private ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint() {
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
                final ahdd c;
                if ((c = ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.c) == null) {
                    synchronized (ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.class) {
                        if (ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.c == null) {
                            ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.c = (ahdd)new ahba((ahbh)ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.a);
            }
            case 3: {
                return new ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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

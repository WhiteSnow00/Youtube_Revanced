// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint extends ahbh implements ahcw
{
    public static final ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint a;
    private static volatile ahdd d;
    public static final ahbf shoppingDrawerEndpoint;
    public int b;
    public int c;
    private int e;
    
    static {
        final ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint a2 = new ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint();
        ahbh.registerDefaultInstance((Class)ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.class, (ahbh)(a = a2));
        shoppingDrawerEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 154446441, ahek.k, (Class)ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.class);
    }
    
    private ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.d) == null) {
                    synchronized (ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.class) {
                        if (ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.d == null) {
                            ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.d = (ahdd)new ahba((ahbh)ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.a);
            }
            case 3: {
                return new ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001", new Object[] { "e", "b", anxd.u, "c" });
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

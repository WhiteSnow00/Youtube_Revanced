// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint extends agzi implements ahax
{
    public static final ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint a;
    private static volatile ahbe d;
    public static final agzg shoppingDrawerEndpoint;
    public int b;
    public int c;
    private int e;
    
    static {
        final ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint a2 = new ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint();
        agzi.registerDefaultInstance((Class)ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.class, (agzi)(a = a2));
        shoppingDrawerEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 154446441, ahcm.k, (Class)ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.class);
    }
    
    private ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.d) == null) {
                    synchronized (ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.class) {
                        if (ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.d == null) {
                            ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.d = (ahbe)new agzb((agzi)ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.a);
            }
            case 3: {
                return new ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001", new Object[] { "e", "b", anvq.t, "c" });
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

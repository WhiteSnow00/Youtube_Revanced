// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MenuEndpointOuterClass$MenuEndpoint extends ahbh implements ahcw
{
    public static final MenuEndpointOuterClass$MenuEndpoint a;
    private static volatile ahdd d;
    public static final ahbf menuEndpoint;
    public int b;
    public amgv c;
    private byte e;
    
    static {
        final MenuEndpointOuterClass$MenuEndpoint a2 = new MenuEndpointOuterClass$MenuEndpoint();
        ahbh.registerDefaultInstance((Class)MenuEndpointOuterClass$MenuEndpoint.class, (ahbh)(a = a2));
        menuEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 98150882, ahek.k, (Class)MenuEndpointOuterClass$MenuEndpoint.class);
    }
    
    private MenuEndpointOuterClass$MenuEndpoint() {
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
                if ((d = MenuEndpointOuterClass$MenuEndpoint.d) == null) {
                    synchronized (MenuEndpointOuterClass$MenuEndpoint.class) {
                        if (MenuEndpointOuterClass$MenuEndpoint.d == null) {
                            MenuEndpointOuterClass$MenuEndpoint.d = (ahdd)new ahba((ahbh)MenuEndpointOuterClass$MenuEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return MenuEndpointOuterClass$MenuEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)MenuEndpointOuterClass$MenuEndpoint.a);
            }
            case 3: {
                return new MenuEndpointOuterClass$MenuEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)MenuEndpointOuterClass$MenuEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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

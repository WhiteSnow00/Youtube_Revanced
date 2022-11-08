// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MenuEndpointOuterClass$MenuEndpoint extends agzi implements ahax
{
    public static final MenuEndpointOuterClass$MenuEndpoint a;
    private static volatile ahbe d;
    public static final agzg menuEndpoint;
    public int b;
    public amer c;
    private byte e;
    
    static {
        final MenuEndpointOuterClass$MenuEndpoint a2 = new MenuEndpointOuterClass$MenuEndpoint();
        agzi.registerDefaultInstance((Class)MenuEndpointOuterClass$MenuEndpoint.class, (agzi)(a = a2));
        menuEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 98150882, ahcm.k, (Class)MenuEndpointOuterClass$MenuEndpoint.class);
    }
    
    private MenuEndpointOuterClass$MenuEndpoint() {
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
                if ((d = MenuEndpointOuterClass$MenuEndpoint.d) == null) {
                    synchronized (MenuEndpointOuterClass$MenuEndpoint.class) {
                        if (MenuEndpointOuterClass$MenuEndpoint.d == null) {
                            MenuEndpointOuterClass$MenuEndpoint.d = (ahbe)new agzb((agzi)MenuEndpointOuterClass$MenuEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return MenuEndpointOuterClass$MenuEndpoint.a;
            }
            case 4: {
                return new agza((agzi)MenuEndpointOuterClass$MenuEndpoint.a);
            }
            case 3: {
                return new MenuEndpointOuterClass$MenuEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)MenuEndpointOuterClass$MenuEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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

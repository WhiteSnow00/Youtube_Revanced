// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddPlaceEndpointOuterClass$AddPlaceEndpoint extends ahbh implements ahcw
{
    public static final AddPlaceEndpointOuterClass$AddPlaceEndpoint a;
    public static final ahbf addPlaceEndpoint;
    private static volatile ahdd e;
    public int b;
    public String c;
    public ajut d;
    private ajut f;
    private byte g;
    
    static {
        final AddPlaceEndpointOuterClass$AddPlaceEndpoint a2 = new AddPlaceEndpointOuterClass$AddPlaceEndpoint();
        ahbh.registerDefaultInstance((Class)AddPlaceEndpointOuterClass$AddPlaceEndpoint.class, (ahbh)(a = a2));
        addPlaceEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 153675053, ahek.k, (Class)AddPlaceEndpointOuterClass$AddPlaceEndpoint.class);
    }
    
    private AddPlaceEndpointOuterClass$AddPlaceEndpoint() {
        this.g = 2;
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = AddPlaceEndpointOuterClass$AddPlaceEndpoint.e) == null) {
                    synchronized (AddPlaceEndpointOuterClass$AddPlaceEndpoint.class) {
                        if (AddPlaceEndpointOuterClass$AddPlaceEndpoint.e == null) {
                            AddPlaceEndpointOuterClass$AddPlaceEndpoint.e = (ahdd)new ahba((ahbh)AddPlaceEndpointOuterClass$AddPlaceEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return AddPlaceEndpointOuterClass$AddPlaceEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)AddPlaceEndpointOuterClass$AddPlaceEndpoint.a);
            }
            case 3: {
                return new AddPlaceEndpointOuterClass$AddPlaceEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddPlaceEndpointOuterClass$AddPlaceEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}

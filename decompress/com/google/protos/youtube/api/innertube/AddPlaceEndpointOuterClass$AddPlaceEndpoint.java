// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddPlaceEndpointOuterClass$AddPlaceEndpoint extends agzi implements ahax
{
    public static final AddPlaceEndpointOuterClass$AddPlaceEndpoint a;
    public static final agzg addPlaceEndpoint;
    private static volatile ahbe e;
    public int b;
    public String c;
    public ajsq d;
    private ajsq f;
    private byte g;
    
    static {
        final AddPlaceEndpointOuterClass$AddPlaceEndpoint a2 = new AddPlaceEndpointOuterClass$AddPlaceEndpoint();
        agzi.registerDefaultInstance((Class)AddPlaceEndpointOuterClass$AddPlaceEndpoint.class, (agzi)(a = a2));
        addPlaceEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 153675053, ahcm.k, (Class)AddPlaceEndpointOuterClass$AddPlaceEndpoint.class);
    }
    
    private AddPlaceEndpointOuterClass$AddPlaceEndpoint() {
        this.g = 2;
        this.c = "";
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
                final ahbe e;
                if ((e = AddPlaceEndpointOuterClass$AddPlaceEndpoint.e) == null) {
                    synchronized (AddPlaceEndpointOuterClass$AddPlaceEndpoint.class) {
                        if (AddPlaceEndpointOuterClass$AddPlaceEndpoint.e == null) {
                            AddPlaceEndpointOuterClass$AddPlaceEndpoint.e = (ahbe)new agzb((agzi)AddPlaceEndpointOuterClass$AddPlaceEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return AddPlaceEndpointOuterClass$AddPlaceEndpoint.a;
            }
            case 4: {
                return new agza((agzi)AddPlaceEndpointOuterClass$AddPlaceEndpoint.a);
            }
            case 3: {
                return new AddPlaceEndpointOuterClass$AddPlaceEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddPlaceEndpointOuterClass$AddPlaceEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}

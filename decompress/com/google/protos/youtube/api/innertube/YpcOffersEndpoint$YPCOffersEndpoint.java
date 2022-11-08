// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class YpcOffersEndpoint$YPCOffersEndpoint extends agzi implements ahax
{
    public static final YpcOffersEndpoint$YPCOffersEndpoint a;
    private static volatile ahbe e;
    public static final agzg ypcOffersEndpoint;
    public String b;
    public boolean c;
    public boolean d;
    private int f;
    private apug g;
    private aioe h;
    private byte i;
    
    static {
        final YpcOffersEndpoint$YPCOffersEndpoint a2 = new YpcOffersEndpoint$YPCOffersEndpoint();
        agzi.registerDefaultInstance((Class)YpcOffersEndpoint$YPCOffersEndpoint.class, (agzi)(a = a2));
        ypcOffersEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 64681250, ahcm.k, (Class)YpcOffersEndpoint$YPCOffersEndpoint.class);
    }
    
    private YpcOffersEndpoint$YPCOffersEndpoint() {
        this.i = 2;
        this.b = "";
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
                if ((e = YpcOffersEndpoint$YPCOffersEndpoint.e) == null) {
                    synchronized (YpcOffersEndpoint$YPCOffersEndpoint.class) {
                        if (YpcOffersEndpoint$YPCOffersEndpoint.e == null) {
                            YpcOffersEndpoint$YPCOffersEndpoint.e = (ahbe)new agzb((agzi)YpcOffersEndpoint$YPCOffersEndpoint.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return YpcOffersEndpoint$YPCOffersEndpoint.a;
            }
            case 4: {
                return new agza((agzi)YpcOffersEndpoint$YPCOffersEndpoint.a);
            }
            case 3: {
                return new YpcOffersEndpoint$YPCOffersEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)YpcOffersEndpoint$YPCOffersEndpoint.a, "\u0001\u0005\u0000\u0001\u0001\uf70f\u2a7b\u0005\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1409\u0002\u0003\u1007\u0003\u0005\u1007\u0004\uf70f\u2a7b\u1409\u0001", new Object[] { "f", "b", "h", "c", "d", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}

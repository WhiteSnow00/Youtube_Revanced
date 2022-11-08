// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AboutThisAdEndpointOuterClass$AboutThisAdEndpoint extends agzi implements ahax
{
    public static final AboutThisAdEndpointOuterClass$AboutThisAdEndpoint a;
    public static final agzg aboutThisAdEndpoint;
    private static volatile ahbe d;
    public int b;
    public anss c;
    private int e;
    private ahfw f;
    private byte g;
    
    static {
        final AboutThisAdEndpointOuterClass$AboutThisAdEndpoint a2 = new AboutThisAdEndpointOuterClass$AboutThisAdEndpoint();
        agzi.registerDefaultInstance((Class)AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.class, (agzi)(a = a2));
        aboutThisAdEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 366527935, ahcm.k, (Class)AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.class);
    }
    
    private AboutThisAdEndpointOuterClass$AboutThisAdEndpoint() {
        this.g = 2;
        final agyc b = agyc.b;
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
                if ((d = AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.d) == null) {
                    synchronized (AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.class) {
                        if (AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.d == null) {
                            AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.d = (ahbe)new agzb((agzi)AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.a;
            }
            case 4: {
                return new agza((agzi)AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.a);
            }
            case 3: {
                return new AboutThisAdEndpointOuterClass$AboutThisAdEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0002\u0002\u1409\u0001\u0004\u100c\u0003\u0005\u1409\u0004", new Object[] { "e", "f", "b", ahec.n, "c" });
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

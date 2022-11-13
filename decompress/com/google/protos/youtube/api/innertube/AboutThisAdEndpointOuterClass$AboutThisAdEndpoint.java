// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AboutThisAdEndpointOuterClass$AboutThisAdEndpoint extends ahbh implements ahcw
{
    public static final AboutThisAdEndpointOuterClass$AboutThisAdEndpoint a;
    public static final ahbf aboutThisAdEndpoint;
    private static volatile ahdd d;
    public int b;
    public anuv c;
    private int e;
    private ahhu f;
    private byte g;
    
    static {
        final AboutThisAdEndpointOuterClass$AboutThisAdEndpoint a2 = new AboutThisAdEndpointOuterClass$AboutThisAdEndpoint();
        ahbh.registerDefaultInstance((Class)AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.class, (ahbh)(a = a2));
        aboutThisAdEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 366527935, ahek.k, (Class)AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.class);
    }
    
    private AboutThisAdEndpointOuterClass$AboutThisAdEndpoint() {
        this.g = 2;
        final ahab b = ahab.b;
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
                final ahdd d;
                if ((d = AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.d) == null) {
                    synchronized (AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.class) {
                        if (AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.d == null) {
                            AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.d = (ahdd)new ahba((ahbh)AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.a);
            }
            case 3: {
                return new AboutThisAdEndpointOuterClass$AboutThisAdEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0002\u0002\u1409\u0001\u0004\u100c\u0003\u0005\u1409\u0004", new Object[] { "e", "f", "b", ahga.n, "c" });
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

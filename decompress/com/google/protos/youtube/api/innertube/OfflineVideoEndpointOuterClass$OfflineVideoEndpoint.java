// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OfflineVideoEndpointOuterClass$OfflineVideoEndpoint extends agzi implements ahax
{
    public static final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint a;
    private static volatile ahbe j;
    public static final agzg offlineVideoEndpoint;
    public int b;
    public int c;
    public Object d;
    public String e;
    public int f;
    public anss g;
    public amqx h;
    public aioe i;
    private byte k;
    
    static {
        final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint a2 = new OfflineVideoEndpointOuterClass$OfflineVideoEndpoint();
        agzi.registerDefaultInstance((Class)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.class, (agzi)(a = a2));
        offlineVideoEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 73080600, ahcm.k, (Class)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.class);
    }
    
    private OfflineVideoEndpointOuterClass$OfflineVideoEndpoint() {
        this.c = 0;
        this.k = 2;
        this.e = "";
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
                final ahbe j;
                if ((j = OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.j) == null) {
                    synchronized (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.class) {
                        if (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.j == null) {
                            OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.j = (ahbe)new agzb((agzi)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.a;
            }
            case 4: {
                return new agza((agzi)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.a);
            }
            case 3: {
                return new OfflineVideoEndpointOuterClass$OfflineVideoEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.a, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001\u103b\u0000\u0002\u100c\u0003\u0004\u1409\u0005\u0005\u1008\u0002\u0006\u1009\u0006\u0007\u103b\u0000\b\u1409\u0007", new Object[] { "d", "c", "b", "f", amtq.a(), "g", "e", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}

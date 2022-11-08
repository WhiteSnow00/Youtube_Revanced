// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint extends agzi implements ahax
{
    public static final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint a;
    private static volatile ahbe g;
    public static final agzg offlinePlaylistEndpoint;
    public int b;
    public String c;
    public int d;
    public anss e;
    public amqx f;
    private aioe h;
    private byte i;
    
    static {
        final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint a2 = new OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint();
        agzi.registerDefaultInstance((Class)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.class, (agzi)(a = a2));
        offlinePlaylistEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 73082583, ahcm.k, (Class)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.class);
    }
    
    private OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint() {
        this.i = 2;
        this.c = "";
        emptyProtobufList();
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
                final ahbe g;
                if ((g = OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.g) == null) {
                    synchronized (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.class) {
                        if (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.g == null) {
                            OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.g = (ahbe)new agzb((agzi)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.a;
            }
            case 4: {
                return new agza((agzi)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.a);
            }
            case 3: {
                return new OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u100c\u0001\u0004\u1409\u0003\u0006\u1009\u0004\u0007\u1409\u0005", new Object[] { "b", "c", "d", amsc.m, "e", "f", "h" });
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

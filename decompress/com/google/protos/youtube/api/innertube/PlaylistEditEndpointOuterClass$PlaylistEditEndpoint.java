// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PlaylistEditEndpointOuterClass$PlaylistEditEndpoint extends agzi implements ahax
{
    public static final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint a;
    private static volatile ahbe i;
    public static final agzg playlistEditEndpoint;
    public int b;
    public String c;
    public agzy d;
    public agzy e;
    public aioe f;
    public String g;
    public boolean h;
    private byte j;
    
    static {
        final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint a2 = new PlaylistEditEndpointOuterClass$PlaylistEditEndpoint();
        agzi.registerDefaultInstance((Class)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.class, (agzi)(a = a2));
        playlistEditEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 60666189, ahcm.k, (Class)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.class);
    }
    
    private PlaylistEditEndpointOuterClass$PlaylistEditEndpoint() {
        this.j = 2;
        this.c = "";
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        this.g = "";
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
                final ahbe i;
                if ((i = PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.i) == null) {
                    synchronized (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.class) {
                        if (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.i == null) {
                            PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.i = (ahbe)new agzb((agzi)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.a;
            }
            case 4: {
                return new agza((byte[][][])null, (byte[][][])null);
            }
            case 3: {
                return new PlaylistEditEndpointOuterClass$PlaylistEditEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0002\u0001\u1008\u0000\u0002\u001b\u0003\u1008\u0002\u0005\u041b\u0006\u1007\u0003\u0007\u1409\u0001", new Object[] { "b", "c", "d", anfw.class, "g", "e", aioe.class, "h", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}

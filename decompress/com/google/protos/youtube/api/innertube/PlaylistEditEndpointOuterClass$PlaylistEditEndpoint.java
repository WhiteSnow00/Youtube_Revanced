// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PlaylistEditEndpointOuterClass$PlaylistEditEndpoint extends ahbh implements ahcw
{
    public static final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint a;
    private static volatile ahdd i;
    public static final ahbf playlistEditEndpoint;
    public int b;
    public String c;
    public ahbx d;
    public ahbx e;
    public aiqj f;
    public String g;
    public boolean h;
    private byte j;
    
    static {
        final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint a2 = new PlaylistEditEndpointOuterClass$PlaylistEditEndpoint();
        ahbh.registerDefaultInstance((Class)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.class, (ahbh)(a = a2));
        playlistEditEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 60666189, ahek.k, (Class)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.class);
    }
    
    private PlaylistEditEndpointOuterClass$PlaylistEditEndpoint() {
        this.j = 2;
        this.c = "";
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        this.g = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.i) == null) {
                    synchronized (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.class) {
                        if (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.i == null) {
                            PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.i = (ahdd)new ahba((ahbh)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.a;
            }
            case 4: {
                return new ahaz((byte[][])null, (char[][])null);
            }
            case 3: {
                return new PlaylistEditEndpointOuterClass$PlaylistEditEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0002\u0001\u1008\u0000\u0002\u001b\u0003\u1008\u0002\u0005\u041b\u0006\u1007\u0003\u0007\u1409\u0001", new Object[] { "b", "c", "d", ania.class, "g", "e", aiqj.class, "h", "f" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}

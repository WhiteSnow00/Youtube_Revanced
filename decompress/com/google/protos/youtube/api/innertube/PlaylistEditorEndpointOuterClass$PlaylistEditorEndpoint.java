// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint extends agzi implements ahax
{
    public static final PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint a;
    private static volatile ahbe c;
    public static final agzg playlistEditorEndpoint;
    public String b;
    private int d;
    
    static {
        final PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint a2 = new PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint();
        agzi.registerDefaultInstance((Class)PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.class, (agzi)(a = a2));
        playlistEditorEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 93440769, ahcm.k, (Class)PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.class);
    }
    
    private PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.c) == null) {
                    synchronized (PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.class) {
                        if (PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.c == null) {
                            PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.c = (ahbe)new agzb((agzi)PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.a;
            }
            case 4: {
                return new agza((agzi)PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.a);
            }
            case 3: {
                return new PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint extends ahbh implements ahcw
{
    public static final PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint a;
    private static volatile ahdd c;
    public static final ahbf playlistEditorEndpoint;
    public String b;
    private int d;
    
    static {
        final PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint a2 = new PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint();
        ahbh.registerDefaultInstance((Class)PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.class, (ahbh)(a = a2));
        playlistEditorEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 93440769, ahek.k, (Class)PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.class);
    }
    
    private PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.c) == null) {
                    synchronized (PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.class) {
                        if (PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.c == null) {
                            PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.c = (ahdd)new ahba((ahbh)PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.a);
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

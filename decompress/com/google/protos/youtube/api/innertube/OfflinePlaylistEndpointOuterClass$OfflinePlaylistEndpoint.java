// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint extends ahbh implements ahcw
{
    public static final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint a;
    private static volatile ahdd g;
    public static final ahbf offlinePlaylistEndpoint;
    public int b;
    public String c;
    public int d;
    public anuv e;
    public amtb f;
    private aiqj h;
    private byte i;
    
    static {
        final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint a2 = new OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint();
        ahbh.registerDefaultInstance((Class)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.class, (ahbh)(a = a2));
        offlinePlaylistEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 73082583, ahek.k, (Class)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.class);
    }
    
    private OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint() {
        this.i = 2;
        this.c = "";
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.g) == null) {
                    synchronized (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.class) {
                        if (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.g == null) {
                            OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.g = (ahdd)new ahba((ahbh)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.a);
            }
            case 3: {
                return new OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u100c\u0001\u0004\u1409\u0003\u0006\u1009\u0004\u0007\u1409\u0005", new Object[] { "b", "c", "d", amud.n, "e", "f", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}

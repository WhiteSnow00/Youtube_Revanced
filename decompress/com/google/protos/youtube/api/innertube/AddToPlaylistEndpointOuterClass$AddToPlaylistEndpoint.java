// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint extends ahbh implements ahcw
{
    public static final AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint a;
    public static final ahbf addToPlaylistEndpoint;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        final AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint a2 = new AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint();
        ahbh.registerDefaultInstance((Class)AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.class, (ahbh)(a = a2));
        addToPlaylistEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 69487224, ahek.k, (Class)AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.class);
    }
    
    private AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint() {
        this.b = "";
        ahbh.emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.c) == null) {
                    synchronized (AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.class) {
                        if (AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.c == null) {
                            AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.c = (ahdd)new ahba((ahbh)AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.a);
            }
            case 3: {
                return new AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

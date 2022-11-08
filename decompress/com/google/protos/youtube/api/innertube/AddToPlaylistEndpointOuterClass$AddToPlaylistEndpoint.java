// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint extends agzi implements ahax
{
    public static final AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint a;
    public static final agzg addToPlaylistEndpoint;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        final AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint a2 = new AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint();
        agzi.registerDefaultInstance((Class)AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.class, (agzi)(a = a2));
        addToPlaylistEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 69487224, ahcm.k, (Class)AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.class);
    }
    
    private AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint() {
        this.b = "";
        agzi.emptyProtobufList();
        final agyc b = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.c) == null) {
                    synchronized (AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.class) {
                        if (AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.c == null) {
                            AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.c = (ahbe)new agzb((agzi)AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.a;
            }
            case 4: {
                return new agza((agzi)AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.a);
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

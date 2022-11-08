// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint extends agzi implements ahax
{
    public static final PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint a;
    private static volatile ahbe b;
    public static final agzg pauseWatchHistoryEndpoint;
    private byte c;
    
    static {
        final PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint a2 = new PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint();
        agzi.registerDefaultInstance((Class)PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.class, (agzi)(a = a2));
        pauseWatchHistoryEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 63121553, ahcm.k, (Class)PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.class);
    }
    
    private PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint() {
        this.c = 2;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.b) == null) {
                    synchronized (PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.class) {
                        if (PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.b == null) {
                            PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.b = (ahbe)new agzb((agzi)PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.a;
            }
            case 4: {
                return new agza((agzi)PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.a);
            }
            case 3: {
                return new PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                this.c = (byte)((o != null) ? 1 : 0);
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}

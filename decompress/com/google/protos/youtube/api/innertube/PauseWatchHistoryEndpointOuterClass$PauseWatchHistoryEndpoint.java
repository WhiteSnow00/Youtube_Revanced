// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint extends ahbh implements ahcw
{
    public static final PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint a;
    private static volatile ahdd b;
    public static final ahbf pauseWatchHistoryEndpoint;
    private byte c;
    
    static {
        final PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint a2 = new PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint();
        ahbh.registerDefaultInstance((Class)PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.class, (ahbh)(a = a2));
        pauseWatchHistoryEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 63121553, ahek.k, (Class)PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.class);
    }
    
    private PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint() {
        this.c = 2;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.b) == null) {
                    synchronized (PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.class) {
                        if (PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.b == null) {
                            PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.b = (ahdd)new ahba((ahbh)PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.a);
            }
            case 3: {
                return new PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                byte c;
                if (o == null) {
                    c = 0;
                }
                else {
                    c = 1;
                }
                this.c = c;
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}

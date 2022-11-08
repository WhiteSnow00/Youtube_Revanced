// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint extends agzi implements ahax
{
    public static final ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint a;
    private static volatile ahbe b;
    public static final agzg resumeWatchHistoryEndpoint;
    private byte c;
    
    static {
        final ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint a2 = new ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint();
        agzi.registerDefaultInstance((Class)ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.class, (agzi)(a = a2));
        resumeWatchHistoryEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 63121560, ahcm.k, (Class)ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.class);
    }
    
    private ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint() {
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
                if ((b = ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.b) == null) {
                    synchronized (ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.class) {
                        if (ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.b == null) {
                            ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.b = (ahbe)new agzb((agzi)ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.a);
            }
            case 3: {
                return new ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.a, "\u0001\u0000", (Object[])null);
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

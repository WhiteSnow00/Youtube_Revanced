// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint extends ahbh implements ahcw
{
    public static final ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint a;
    private static volatile ahdd b;
    public static final ahbf resumeWatchHistoryEndpoint;
    private byte c;
    
    static {
        final ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint a2 = new ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint();
        ahbh.registerDefaultInstance((Class)ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.class, (ahbh)(a = a2));
        resumeWatchHistoryEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 63121560, ahek.k, (Class)ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.class);
    }
    
    private ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint() {
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
                if ((b = ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.b) == null) {
                    synchronized (ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.class) {
                        if (ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.b == null) {
                            ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.b = (ahdd)new ahba((ahbh)ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.a);
            }
            case 3: {
                return new ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.a, "\u0001\u0000", (Object[])null);
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

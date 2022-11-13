// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SubtitlesEndpointOuterClass$SubtitlesEndpoint extends ahbh implements ahcw
{
    public static final SubtitlesEndpointOuterClass$SubtitlesEndpoint a;
    private static volatile ahdd b;
    public static final ahbf subtitlesEndpoint;
    
    static {
        final SubtitlesEndpointOuterClass$SubtitlesEndpoint a2 = new SubtitlesEndpointOuterClass$SubtitlesEndpoint();
        ahbh.registerDefaultInstance((Class)SubtitlesEndpointOuterClass$SubtitlesEndpoint.class, (ahbh)(a = a2));
        subtitlesEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 105751339, ahek.k, (Class)SubtitlesEndpointOuterClass$SubtitlesEndpoint.class);
    }
    
    private SubtitlesEndpointOuterClass$SubtitlesEndpoint() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = SubtitlesEndpointOuterClass$SubtitlesEndpoint.b) == null) {
                    synchronized (SubtitlesEndpointOuterClass$SubtitlesEndpoint.class) {
                        if (SubtitlesEndpointOuterClass$SubtitlesEndpoint.b == null) {
                            SubtitlesEndpointOuterClass$SubtitlesEndpoint.b = (ahdd)new ahba((ahbh)SubtitlesEndpointOuterClass$SubtitlesEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return SubtitlesEndpointOuterClass$SubtitlesEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)SubtitlesEndpointOuterClass$SubtitlesEndpoint.a);
            }
            case 3: {
                return new SubtitlesEndpointOuterClass$SubtitlesEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SubtitlesEndpointOuterClass$SubtitlesEndpoint.a, "\u0001\u0000", (Object[])null);
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

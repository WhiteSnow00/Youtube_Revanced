// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AdFeedbackEndpointOuterClass$AdFeedbackEndpoint extends agzi implements ahax
{
    public static final AdFeedbackEndpointOuterClass$AdFeedbackEndpoint a;
    public static final agzg adFeedbackEndpoint;
    private static volatile ahbe c;
    public ahji b;
    private int d;
    private byte e;
    
    static {
        final AdFeedbackEndpointOuterClass$AdFeedbackEndpoint a2 = new AdFeedbackEndpointOuterClass$AdFeedbackEndpoint();
        agzi.registerDefaultInstance((Class)AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.class, (agzi)(a = a2));
        adFeedbackEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 79296801, ahcm.k, (Class)AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.class);
    }
    
    private AdFeedbackEndpointOuterClass$AdFeedbackEndpoint() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.c) == null) {
                    synchronized (AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.class) {
                        if (AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.c == null) {
                            AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.c = (ahbe)new agzb((agzi)AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.a;
            }
            case 4: {
                return new agza((agzi)AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.a);
            }
            case 3: {
                return new AdFeedbackEndpointOuterClass$AdFeedbackEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}

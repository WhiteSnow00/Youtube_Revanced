// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AdFeedbackEndpointOuterClass$AdFeedbackEndpoint extends ahbh implements ahcw
{
    public static final AdFeedbackEndpointOuterClass$AdFeedbackEndpoint a;
    public static final ahbf adFeedbackEndpoint;
    private static volatile ahdd c;
    public ahlg b;
    private int d;
    private byte e;
    
    static {
        final AdFeedbackEndpointOuterClass$AdFeedbackEndpoint a2 = new AdFeedbackEndpointOuterClass$AdFeedbackEndpoint();
        ahbh.registerDefaultInstance((Class)AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.class, (ahbh)(a = a2));
        adFeedbackEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 79296801, ahek.k, (Class)AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.class);
    }
    
    private AdFeedbackEndpointOuterClass$AdFeedbackEndpoint() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.c) == null) {
                    synchronized (AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.class) {
                        if (AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.c == null) {
                            AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.c = (ahdd)new ahba((ahbh)AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.a);
            }
            case 3: {
                return new AdFeedbackEndpointOuterClass$AdFeedbackEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}

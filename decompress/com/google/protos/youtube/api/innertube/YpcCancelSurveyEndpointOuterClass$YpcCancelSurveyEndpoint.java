// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint extends agzi implements ahax
{
    public static final YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint a;
    private static volatile ahbe d;
    public static final agzg ypcCancelSurveyEndpoint;
    public int b;
    public aonl c;
    private byte e;
    
    static {
        final YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint a2 = new YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint();
        agzi.registerDefaultInstance((Class)YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.class, (agzi)(a = a2));
        ypcCancelSurveyEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 152893416, ahcm.k, (Class)YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.class);
    }
    
    private YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint() {
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
                final ahbe d;
                if ((d = YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.d) == null) {
                    synchronized (YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.class) {
                        if (YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.d == null) {
                            YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.d = (ahbe)new agzb((agzi)YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.a;
            }
            case 4: {
                return new agza((agzi)YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.a);
            }
            case 3: {
                return new YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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

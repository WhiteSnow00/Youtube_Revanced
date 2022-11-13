// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SurveyEndpointOuterClass$SurveyEndpoint extends ahbh implements ahcw
{
    public static final SurveyEndpointOuterClass$SurveyEndpoint a;
    private static volatile ahdd c;
    public static final ahbf surveyEndpoint;
    public aopo b;
    private int d;
    private byte e;
    
    static {
        final SurveyEndpointOuterClass$SurveyEndpoint a2 = new SurveyEndpointOuterClass$SurveyEndpoint();
        ahbh.registerDefaultInstance((Class)SurveyEndpointOuterClass$SurveyEndpoint.class, (ahbh)(a = a2));
        surveyEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 162669933, ahek.k, (Class)SurveyEndpointOuterClass$SurveyEndpoint.class);
    }
    
    private SurveyEndpointOuterClass$SurveyEndpoint() {
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
                if ((c = SurveyEndpointOuterClass$SurveyEndpoint.c) == null) {
                    synchronized (SurveyEndpointOuterClass$SurveyEndpoint.class) {
                        if (SurveyEndpointOuterClass$SurveyEndpoint.c == null) {
                            SurveyEndpointOuterClass$SurveyEndpoint.c = (ahdd)new ahba((ahbh)SurveyEndpointOuterClass$SurveyEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return SurveyEndpointOuterClass$SurveyEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)SurveyEndpointOuterClass$SurveyEndpoint.a);
            }
            case 3: {
                return new SurveyEndpointOuterClass$SurveyEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SurveyEndpointOuterClass$SurveyEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint extends ahbh implements ahcw
{
    public static final ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint a;
    private static volatile ahdd c;
    public static final ahbf replaceCompanionEndpoint;
    public String b;
    private int d;
    
    static {
        final ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint a2 = new ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint();
        ahbh.registerDefaultInstance((Class)ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.class, (ahbh)(a = a2));
        replaceCompanionEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 167146950, ahek.k, (Class)ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.class);
    }
    
    private ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.c) == null) {
                    synchronized (ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.class) {
                        if (ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.c == null) {
                            ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.c = (ahdd)new ahba((ahbh)ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.a);
            }
            case 3: {
                return new ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

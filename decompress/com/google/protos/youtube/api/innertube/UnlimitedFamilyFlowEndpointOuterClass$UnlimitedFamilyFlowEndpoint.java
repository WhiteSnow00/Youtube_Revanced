// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint extends ahbh implements ahcw
{
    public static final UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint a;
    private static volatile ahdd c;
    public static final ahbf unlimitedFamilyFlowEndpoint;
    public apah b;
    private int d;
    private byte e;
    
    static {
        final UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint a2 = new UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint();
        ahbh.registerDefaultInstance((Class)UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.class, (ahbh)(a = a2));
        unlimitedFamilyFlowEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 128200871, ahek.k, (Class)UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.class);
    }
    
    private UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint() {
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
                if ((c = UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.c) == null) {
                    synchronized (UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.class) {
                        if (UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.c == null) {
                            UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.c = (ahdd)new ahba((ahbh)UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.a);
            }
            case 3: {
                return new UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.a, "\u0001\u0001\u0000\u0001\uf34d\u3c94\uf34d\u3c94\u0001\u0000\u0000\u0001\uf34d\u3c94\u1409\u0000", new Object[] { "d", "b" });
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

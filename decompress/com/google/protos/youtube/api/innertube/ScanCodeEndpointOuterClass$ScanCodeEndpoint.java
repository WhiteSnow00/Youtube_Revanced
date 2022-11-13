// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ScanCodeEndpointOuterClass$ScanCodeEndpoint extends ahbh implements ahcw
{
    public static final ScanCodeEndpointOuterClass$ScanCodeEndpoint a;
    private static volatile ahdd b;
    public static final ahbf scanCodeEndpoint;
    
    static {
        final ScanCodeEndpointOuterClass$ScanCodeEndpoint a2 = new ScanCodeEndpointOuterClass$ScanCodeEndpoint();
        ahbh.registerDefaultInstance((Class)ScanCodeEndpointOuterClass$ScanCodeEndpoint.class, (ahbh)(a = a2));
        scanCodeEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 159170544, ahek.k, (Class)ScanCodeEndpointOuterClass$ScanCodeEndpoint.class);
    }
    
    private ScanCodeEndpointOuterClass$ScanCodeEndpoint() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ScanCodeEndpointOuterClass$ScanCodeEndpoint.b) == null) {
                    synchronized (ScanCodeEndpointOuterClass$ScanCodeEndpoint.class) {
                        if (ScanCodeEndpointOuterClass$ScanCodeEndpoint.b == null) {
                            ScanCodeEndpointOuterClass$ScanCodeEndpoint.b = (ahdd)new ahba((ahbh)ScanCodeEndpointOuterClass$ScanCodeEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ScanCodeEndpointOuterClass$ScanCodeEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ScanCodeEndpointOuterClass$ScanCodeEndpoint.a);
            }
            case 3: {
                return new ScanCodeEndpointOuterClass$ScanCodeEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ScanCodeEndpointOuterClass$ScanCodeEndpoint.a, "\u0001\u0000", (Object[])null);
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

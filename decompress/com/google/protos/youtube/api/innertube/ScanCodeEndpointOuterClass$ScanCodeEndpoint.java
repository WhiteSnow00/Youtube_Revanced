// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ScanCodeEndpointOuterClass$ScanCodeEndpoint extends agzi implements ahax
{
    public static final ScanCodeEndpointOuterClass$ScanCodeEndpoint a;
    private static volatile ahbe b;
    public static final agzg scanCodeEndpoint;
    
    static {
        final ScanCodeEndpointOuterClass$ScanCodeEndpoint a2 = new ScanCodeEndpointOuterClass$ScanCodeEndpoint();
        agzi.registerDefaultInstance((Class)ScanCodeEndpointOuterClass$ScanCodeEndpoint.class, (agzi)(a = a2));
        scanCodeEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 159170544, ahcm.k, (Class)ScanCodeEndpointOuterClass$ScanCodeEndpoint.class);
    }
    
    private ScanCodeEndpointOuterClass$ScanCodeEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ScanCodeEndpointOuterClass$ScanCodeEndpoint.b) == null) {
                    synchronized (ScanCodeEndpointOuterClass$ScanCodeEndpoint.class) {
                        if (ScanCodeEndpointOuterClass$ScanCodeEndpoint.b == null) {
                            ScanCodeEndpointOuterClass$ScanCodeEndpoint.b = (ahbe)new agzb((agzi)ScanCodeEndpointOuterClass$ScanCodeEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ScanCodeEndpointOuterClass$ScanCodeEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ScanCodeEndpointOuterClass$ScanCodeEndpoint.a);
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

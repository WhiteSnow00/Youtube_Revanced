// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class GetReportFormEndpointOuterClass$GetReportFormEndpoint extends agzi implements ahax
{
    public static final GetReportFormEndpointOuterClass$GetReportFormEndpoint a;
    private static volatile ahbe c;
    public static final agzg getReportFormEndpoint;
    public String b;
    private int d;
    
    static {
        final GetReportFormEndpointOuterClass$GetReportFormEndpoint a2 = new GetReportFormEndpointOuterClass$GetReportFormEndpoint();
        agzi.registerDefaultInstance((Class)GetReportFormEndpointOuterClass$GetReportFormEndpoint.class, (agzi)(a = a2));
        getReportFormEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 113762617, ahcm.k, (Class)GetReportFormEndpointOuterClass$GetReportFormEndpoint.class);
    }
    
    private GetReportFormEndpointOuterClass$GetReportFormEndpoint() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = GetReportFormEndpointOuterClass$GetReportFormEndpoint.c) == null) {
                    synchronized (GetReportFormEndpointOuterClass$GetReportFormEndpoint.class) {
                        if (GetReportFormEndpointOuterClass$GetReportFormEndpoint.c == null) {
                            GetReportFormEndpointOuterClass$GetReportFormEndpoint.c = (ahbe)new agzb((agzi)GetReportFormEndpointOuterClass$GetReportFormEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return GetReportFormEndpointOuterClass$GetReportFormEndpoint.a;
            }
            case 4: {
                return new agza((agzi)GetReportFormEndpointOuterClass$GetReportFormEndpoint.a);
            }
            case 3: {
                return new GetReportFormEndpointOuterClass$GetReportFormEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)GetReportFormEndpointOuterClass$GetReportFormEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

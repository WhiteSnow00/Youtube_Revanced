// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint extends agzi implements ahax
{
    public static final OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint a;
    private static volatile ahbe b;
    public static final agzg openSourceLicensesEndpoint;
    
    static {
        final OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint a2 = new OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint();
        agzi.registerDefaultInstance((Class)OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.class, (agzi)(a = a2));
        openSourceLicensesEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 102687288, ahcm.k, (Class)OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.class);
    }
    
    private OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.b) == null) {
                    synchronized (OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.class) {
                        if (OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.b == null) {
                            OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.b = (ahbe)new agzb((agzi)OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.a;
            }
            case 4: {
                return new agza((agzi)OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.a);
            }
            case 3: {
                return new OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.a, "\u0001\u0000", (Object[])null);
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

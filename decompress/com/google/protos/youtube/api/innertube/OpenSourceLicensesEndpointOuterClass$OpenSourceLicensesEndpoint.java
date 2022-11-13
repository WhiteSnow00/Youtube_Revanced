// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint extends ahbh implements ahcw
{
    public static final OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint a;
    private static volatile ahdd b;
    public static final ahbf openSourceLicensesEndpoint;
    
    static {
        final OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint a2 = new OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint();
        ahbh.registerDefaultInstance((Class)OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.class, (ahbh)(a = a2));
        openSourceLicensesEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 102687288, ahek.k, (Class)OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.class);
    }
    
    private OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.b) == null) {
                    synchronized (OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.class) {
                        if (OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.b == null) {
                            OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.b = (ahdd)new ahba((ahbh)OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.a);
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

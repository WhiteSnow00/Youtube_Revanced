// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint extends ahbh implements ahcw
{
    public static final ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint a;
    private static volatile ahdd b;
    public static final ahbf manageBlockedContactsEndpoint;
    
    static {
        final ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint a2 = new ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint();
        ahbh.registerDefaultInstance((Class)ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.class, (ahbh)(a = a2));
        manageBlockedContactsEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 303779213, ahek.k, (Class)ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.class);
    }
    
    private ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.b) == null) {
                    synchronized (ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.class) {
                        if (ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.b == null) {
                            ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.b = (ahdd)new ahba((ahbh)ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.a);
            }
            case 3: {
                return new ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.a, "\u0001\u0000", (Object[])null);
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

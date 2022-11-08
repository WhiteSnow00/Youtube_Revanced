// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint extends agzi implements ahax
{
    public static final ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint a;
    private static volatile ahbe b;
    public static final agzg manageBlockedContactsEndpoint;
    
    static {
        final ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint a2 = new ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint();
        agzi.registerDefaultInstance((Class)ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.class, (agzi)(a = a2));
        manageBlockedContactsEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 303779213, ahcm.k, (Class)ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.class);
    }
    
    private ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.b) == null) {
                    synchronized (ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.class) {
                        if (ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.b == null) {
                            ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.b = (ahbe)new agzb((agzi)ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.a);
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

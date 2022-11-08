// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint extends agzi implements ahax
{
    public static final EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint a;
    private static volatile ahbe b;
    public static final agzg editNonGaiaConnectionStateEndpoint;
    
    static {
        final EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint a2 = new EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint();
        agzi.registerDefaultInstance((Class)EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.class, (agzi)(a = a2));
        editNonGaiaConnectionStateEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 129377887, ahcm.k, (Class)EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.class);
    }
    
    private EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.b) == null) {
                    synchronized (EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.class) {
                        if (EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.b == null) {
                            EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.b = (ahbe)new agzb((agzi)EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.a;
            }
            case 4: {
                return new agza((agzi)EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.a);
            }
            case 3: {
                return new EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.a, "\u0001\u0000", (Object[])null);
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

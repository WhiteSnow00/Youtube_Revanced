// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddContactsEndpointOuterClass$AddContactsEndpoint extends agzi implements ahax
{
    public static final AddContactsEndpointOuterClass$AddContactsEndpoint a;
    public static final agzg addContactsEndpoint;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        final AddContactsEndpointOuterClass$AddContactsEndpoint a2 = new AddContactsEndpointOuterClass$AddContactsEndpoint();
        agzi.registerDefaultInstance((Class)AddContactsEndpointOuterClass$AddContactsEndpoint.class, (agzi)(a = a2));
        addContactsEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 126354119, ahcm.k, (Class)AddContactsEndpointOuterClass$AddContactsEndpoint.class);
    }
    
    private AddContactsEndpointOuterClass$AddContactsEndpoint() {
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
                if ((c = AddContactsEndpointOuterClass$AddContactsEndpoint.c) == null) {
                    synchronized (AddContactsEndpointOuterClass$AddContactsEndpoint.class) {
                        if (AddContactsEndpointOuterClass$AddContactsEndpoint.c == null) {
                            AddContactsEndpointOuterClass$AddContactsEndpoint.c = (ahbe)new agzb((agzi)AddContactsEndpointOuterClass$AddContactsEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return AddContactsEndpointOuterClass$AddContactsEndpoint.a;
            }
            case 4: {
                return new agza((agzi)AddContactsEndpointOuterClass$AddContactsEndpoint.a);
            }
            case 3: {
                return new AddContactsEndpointOuterClass$AddContactsEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddContactsEndpointOuterClass$AddContactsEndpoint.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
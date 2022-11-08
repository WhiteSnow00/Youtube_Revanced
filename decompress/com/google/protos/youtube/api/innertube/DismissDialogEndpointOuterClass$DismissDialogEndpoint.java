// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class DismissDialogEndpointOuterClass$DismissDialogEndpoint extends agzi implements ahax
{
    public static final DismissDialogEndpointOuterClass$DismissDialogEndpoint a;
    private static volatile ahbe d;
    public static final agzg dismissDialogEndpoint;
    public int b;
    public String c;
    
    static {
        final DismissDialogEndpointOuterClass$DismissDialogEndpoint a2 = new DismissDialogEndpointOuterClass$DismissDialogEndpoint();
        agzi.registerDefaultInstance((Class)DismissDialogEndpointOuterClass$DismissDialogEndpoint.class, (agzi)(a = a2));
        dismissDialogEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 330811011, ahcm.k, (Class)DismissDialogEndpointOuterClass$DismissDialogEndpoint.class);
    }
    
    private DismissDialogEndpointOuterClass$DismissDialogEndpoint() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = DismissDialogEndpointOuterClass$DismissDialogEndpoint.d) == null) {
                    synchronized (DismissDialogEndpointOuterClass$DismissDialogEndpoint.class) {
                        if (DismissDialogEndpointOuterClass$DismissDialogEndpoint.d == null) {
                            DismissDialogEndpointOuterClass$DismissDialogEndpoint.d = (ahbe)new agzb((agzi)DismissDialogEndpointOuterClass$DismissDialogEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return DismissDialogEndpointOuterClass$DismissDialogEndpoint.a;
            }
            case 4: {
                return new agza((agzi)DismissDialogEndpointOuterClass$DismissDialogEndpoint.a);
            }
            case 3: {
                return new DismissDialogEndpointOuterClass$DismissDialogEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)DismissDialogEndpointOuterClass$DismissDialogEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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

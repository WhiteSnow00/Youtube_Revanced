// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RefreshPanelEndpointOuterClass$RefreshPanelEndpoint extends agzi implements ahax
{
    public static final RefreshPanelEndpointOuterClass$RefreshPanelEndpoint a;
    private static volatile ahbe c;
    public static final agzg refreshPanelEndpoint;
    public String b;
    private int d;
    
    static {
        final RefreshPanelEndpointOuterClass$RefreshPanelEndpoint a2 = new RefreshPanelEndpointOuterClass$RefreshPanelEndpoint();
        agzi.registerDefaultInstance((Class)RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.class, (agzi)(a = a2));
        refreshPanelEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 380210655, ahcm.k, (Class)RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.class);
    }
    
    private RefreshPanelEndpointOuterClass$RefreshPanelEndpoint() {
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
                if ((c = RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.c) == null) {
                    synchronized (RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.class) {
                        if (RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.c == null) {
                            RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.c = (ahbe)new agzb((agzi)RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.a;
            }
            case 4: {
                return new agza((agzi)RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.a);
            }
            case 3: {
                return new RefreshPanelEndpointOuterClass$RefreshPanelEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

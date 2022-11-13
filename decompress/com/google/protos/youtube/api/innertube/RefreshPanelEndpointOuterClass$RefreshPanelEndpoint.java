// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RefreshPanelEndpointOuterClass$RefreshPanelEndpoint extends ahbh implements ahcw
{
    public static final RefreshPanelEndpointOuterClass$RefreshPanelEndpoint a;
    private static volatile ahdd c;
    public static final ahbf refreshPanelEndpoint;
    public String b;
    private int d;
    
    static {
        final RefreshPanelEndpointOuterClass$RefreshPanelEndpoint a2 = new RefreshPanelEndpointOuterClass$RefreshPanelEndpoint();
        ahbh.registerDefaultInstance((Class)RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.class, (ahbh)(a = a2));
        refreshPanelEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 380210655, ahek.k, (Class)RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.class);
    }
    
    private RefreshPanelEndpointOuterClass$RefreshPanelEndpoint() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.c) == null) {
                    synchronized (RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.class) {
                        if (RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.c == null) {
                            RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.c = (ahdd)new ahba((ahbh)RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.a);
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

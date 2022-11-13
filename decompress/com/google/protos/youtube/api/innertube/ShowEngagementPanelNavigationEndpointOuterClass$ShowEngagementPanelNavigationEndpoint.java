// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint extends ahbh implements ahcw
{
    public static final ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint a;
    private static volatile ahdd f;
    public static final ahbf showEngagementPanelNavigationEndpoint;
    public int b;
    public String c;
    public boolean d;
    public akfi e;
    private byte g;
    
    static {
        final ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint a2 = new ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint();
        ahbh.registerDefaultInstance((Class)ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.class, (ahbh)(a = a2));
        showEngagementPanelNavigationEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 163501208, ahek.k, (Class)ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.class);
    }
    
    private ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint() {
        this.g = 2;
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.f) == null) {
                    synchronized (ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.class) {
                        if (ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.f == null) {
                            ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.f = (ahdd)new ahba((ahbh)ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.a);
            }
            case 3: {
                return new ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}

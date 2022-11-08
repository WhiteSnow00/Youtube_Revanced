// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint extends agzi implements ahax
{
    public static final ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint a;
    private static volatile ahbe f;
    public static final agzg showEngagementPanelNavigationEndpoint;
    public int b;
    public String c;
    public boolean d;
    public akdf e;
    private byte g;
    
    static {
        final ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint a2 = new ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint();
        agzi.registerDefaultInstance((Class)ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.class, (agzi)(a = a2));
        showEngagementPanelNavigationEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 163501208, ahcm.k, (Class)ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.class);
    }
    
    private ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint() {
        this.g = 2;
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.f) == null) {
                    synchronized (ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.class) {
                        if (ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.f == null) {
                            ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.f = (ahbe)new agzb((agzi)ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.a);
            }
            case 3: {
                return new ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}

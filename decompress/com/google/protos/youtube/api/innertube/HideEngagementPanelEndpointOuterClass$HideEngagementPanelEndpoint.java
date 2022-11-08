// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint extends agzi implements ahax
{
    public static final HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint a;
    private static volatile ahbe h;
    public static final agzg hideEngagementPanelEndpoint;
    public int b;
    public int c;
    public Object d;
    public boolean e;
    public aioe f;
    public boolean g;
    private byte i;
    
    static {
        final HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint a2 = new HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint();
        agzi.registerDefaultInstance((Class)HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.class, (agzi)(a = a2));
        hideEngagementPanelEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 183437148, ahcm.k, (Class)HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.class);
    }
    
    private HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint() {
        this.c = 0;
        this.i = 2;
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
                final ahbe h;
                if ((h = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.h) == null) {
                    synchronized (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.class) {
                        if (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.h == null) {
                            HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.h = (ahbe)new agzb((agzi)HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a;
            }
            case 4: {
                return new agza((agzi)HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a);
            }
            case 3: {
                return new HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u103b\u0000\u0002\u1007\u0002\u0003\u1409\u0003\u0004\u103c\u0000\u0005\u1007\u0004", new Object[] { "d", "c", "b", "e", "f", ajng.class, "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}

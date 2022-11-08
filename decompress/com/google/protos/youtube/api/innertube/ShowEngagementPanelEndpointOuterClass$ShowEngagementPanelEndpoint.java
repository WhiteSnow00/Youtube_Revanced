// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint extends agzi implements ahax
{
    public static final ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint a;
    private static volatile ahbe m;
    public static final agzg showEngagementPanelEndpoint;
    public int b;
    public int c;
    public Object d;
    public aoeg e;
    public String f;
    public boolean g;
    public ajnh h;
    public boolean i;
    public aioe j;
    public aoef k;
    public aoee l;
    private amwi n;
    private byte o;
    
    static {
        final ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint a2 = new ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint();
        agzi.registerDefaultInstance((Class)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.class, (agzi)(a = a2));
        showEngagementPanelEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 138681778, ahcm.k, (Class)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.class);
    }
    
    private ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint() {
        this.c = 0;
        this.o = 2;
        this.f = "";
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
                final ahbe m;
                if ((m = ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.m) == null) {
                    synchronized (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.class) {
                        if (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.m == null) {
                            ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.m = (ahbe)new agzb((agzi)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a;
            }
            case 4: {
                return new agza((agzi)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a);
            }
            case 3: {
                return new ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a, "\u0001\u000b\u0001\u0001\u0001\r\u000b\u0000\u0000\u0005\u0001\u103b\u0000\u0002\u1409\u0006\u0003\u1008\u0003\u0005\u1007\u0005\u0006\u1007\u0007\u0007\u1409\b\b\u1009\t\t\u1409\n\n\u103c\u0000\u000b\u1409\u0002\r\u1409\f", new Object[] { "d", "c", "b", "h", "f", "g", "i", "j", "k", "l", ajng.class, "e", "n" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.o = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}

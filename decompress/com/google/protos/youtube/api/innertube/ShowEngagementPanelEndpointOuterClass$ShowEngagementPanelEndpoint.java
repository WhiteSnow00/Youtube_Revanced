// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint extends ahbh implements ahcw
{
    public static final ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint a;
    private static volatile ahdd m;
    public static final ahbf showEngagementPanelEndpoint;
    public int b;
    public int c;
    public Object d;
    public aogj e;
    public String f;
    public boolean g;
    public ajpm h;
    public boolean i;
    public aiqj j;
    public aogi k;
    public aogh l;
    private amym n;
    private byte o;
    
    static {
        final ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint a2 = new ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint();
        ahbh.registerDefaultInstance((Class)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.class, (ahbh)(a = a2));
        showEngagementPanelEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 138681778, ahek.k, (Class)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.class);
    }
    
    private ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint() {
        this.c = 0;
        this.o = 2;
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd m;
                if ((m = ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.m) == null) {
                    synchronized (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.class) {
                        if (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.m == null) {
                            ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.m = (ahdd)new ahba((ahbh)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a);
            }
            case 3: {
                return new ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a, "\u0001\u000b\u0001\u0001\u0001\r\u000b\u0000\u0000\u0005\u0001\u103b\u0000\u0002\u1409\u0006\u0003\u1008\u0003\u0005\u1007\u0005\u0006\u1007\u0007\u0007\u1409\b\b\u1009\t\t\u1409\n\n\u103c\u0000\u000b\u1409\u0002\r\u1409\f", new Object[] { "d", "c", "b", "h", "f", "g", "i", "j", "k", "l", ajpl.class, "e", "n" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}

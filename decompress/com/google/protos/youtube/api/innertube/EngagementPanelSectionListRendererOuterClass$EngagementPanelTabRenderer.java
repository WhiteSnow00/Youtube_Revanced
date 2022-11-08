// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer extends agzi implements ahax
{
    public static final EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer a;
    private static volatile ahbe e;
    public static final agzg engagementPanelTabRenderer;
    public String b;
    public boolean c;
    public anss d;
    private int f;
    private ahfw g;
    private byte h;
    
    static {
        final EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer a2 = new EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer();
        agzi.registerDefaultInstance((Class)EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer.class, (agzi)(a = a2));
        engagementPanelTabRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)a2, (MessageLite)a2, (agzn)null, 292019130, ahcm.k, (Class)EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer.class);
    }
    
    private EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer() {
        this.h = 2;
        this.b = "";
        final agyc b = agyc.b;
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
                final ahbe e;
                if ((e = EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer.e) == null) {
                    synchronized (EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer.class) {
                        if (EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer.e == null) {
                            EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer.e = (ahbe)new agzb((agzi)EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer.a;
            }
            case 4: {
                return new agza((agzi)EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer.a);
            }
            case 3: {
                return new EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0002\u0002\u1008\u0001\u0003\u1409\u0003\u0004\u1007\u0002\u0005\u1409\u0004", new Object[] { "f", "b", "d", "c", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}

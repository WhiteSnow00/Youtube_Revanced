// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer extends ahbh implements ahcw
{
    public static final PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer a;
    private static volatile ahdd f;
    public static final ahbf pollTypeSelectionRenderer;
    public int b;
    public ajut c;
    public anuv d;
    public anuv e;
    private byte g;
    
    static {
        final PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer a2 = new PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer();
        ahbh.registerDefaultInstance((Class)PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.class, (ahbh)(a = a2));
        pollTypeSelectionRenderer = ahbh.newSingularGeneratedExtension((MessageLite)anuv.a, (Object)a2, (MessageLite)a2, (ahbm)null, 411466342, ahek.k, (Class)PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.class);
    }
    
    private PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer() {
        this.g = 2;
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
                if ((f = PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.f) == null) {
                    synchronized (PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.class) {
                        if (PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.f == null) {
                            PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.f = (ahdd)new ahba((ahbh)PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.a;
            }
            case 4: {
                return new ahaz((ahbh)PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.a);
            }
            case 3: {
                return new PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "b", "c", "d", "e" });
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

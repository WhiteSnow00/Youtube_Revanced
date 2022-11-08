// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer extends agzi implements ahax
{
    public static final PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer a;
    private static volatile ahbe f;
    public static final agzg pollTypeSelectionRenderer;
    public int b;
    public ajsq c;
    public anss d;
    public anss e;
    private byte g;
    
    static {
        final PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer a2 = new PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer();
        agzi.registerDefaultInstance((Class)PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.class, (agzi)(a = a2));
        pollTypeSelectionRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)a2, (MessageLite)a2, (agzn)null, 411466342, ahcm.k, (Class)PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.class);
    }
    
    private PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer() {
        this.g = 2;
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
                if ((f = PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.f) == null) {
                    synchronized (PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.class) {
                        if (PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.f == null) {
                            PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.f = (ahbe)new agzb((agzi)PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.a;
            }
            case 4: {
                return new agza((agzi)PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.a);
            }
            case 3: {
                return new PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "b", "c", "d", "e" });
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

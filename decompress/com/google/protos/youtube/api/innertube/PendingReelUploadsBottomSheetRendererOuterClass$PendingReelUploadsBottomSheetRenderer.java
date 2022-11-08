// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer extends agzi implements ahax
{
    public static final PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer a;
    private static volatile ahbe g;
    public static final agzg pendingReelUploadsBottomSheetRenderer;
    public int b;
    public ajsq c;
    public anss d;
    public anss e;
    public agyc f;
    private ajsq h;
    private ahfw i;
    private byte j;
    
    static {
        final PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer a2 = new PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer();
        agzi.registerDefaultInstance((Class)PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.class, (agzi)(a = a2));
        pendingReelUploadsBottomSheetRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)a2, (MessageLite)a2, (agzn)null, 291412923, ahcm.k, (Class)PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.class);
    }
    
    private PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer() {
        this.j = 2;
        this.f = agyc.b;
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
                final ahbe g;
                if ((g = PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.g) == null) {
                    synchronized (PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.class) {
                        if (PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.g == null) {
                            PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.g = (ahbe)new agzb((agzi)PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.a;
            }
            case 4: {
                return new agza((agzi)PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.a);
            }
            case 3: {
                return new PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u1409\u0005", new Object[] { "b", "c", "d", "h", "e", "f", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}

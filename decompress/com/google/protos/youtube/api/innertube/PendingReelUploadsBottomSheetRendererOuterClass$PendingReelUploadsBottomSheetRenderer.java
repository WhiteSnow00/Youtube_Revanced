// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer extends ahbh implements ahcw
{
    public static final PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer a;
    private static volatile ahdd g;
    public static final ahbf pendingReelUploadsBottomSheetRenderer;
    public int b;
    public ajut c;
    public anuv d;
    public anuv e;
    public ahab f;
    private ajut h;
    private ahhu i;
    private byte j;
    
    static {
        final PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer a2 = new PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer();
        ahbh.registerDefaultInstance((Class)PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.class, (ahbh)(a = a2));
        pendingReelUploadsBottomSheetRenderer = ahbh.newSingularGeneratedExtension((MessageLite)anuv.a, (Object)a2, (MessageLite)a2, (ahbm)null, 291412923, ahek.k, (Class)PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.class);
    }
    
    private PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer() {
        this.j = 2;
        this.f = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.g) == null) {
                    synchronized (PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.class) {
                        if (PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.g == null) {
                            PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.g = (ahdd)new ahba((ahbh)PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.a;
            }
            case 4: {
                return new ahaz((ahbh)PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.a);
            }
            case 3: {
                return new PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0004\u0006\u1409\u0005", new Object[] { "b", "c", "d", "h", "e", "f", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}

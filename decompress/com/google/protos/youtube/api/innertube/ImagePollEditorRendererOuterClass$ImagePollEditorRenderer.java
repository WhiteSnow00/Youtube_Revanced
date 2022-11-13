// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ImagePollEditorRendererOuterClass$ImagePollEditorRenderer extends ahbh implements ahcw
{
    public static final ImagePollEditorRendererOuterClass$ImagePollEditorRenderer a;
    private static volatile ahdd d;
    public static final ahbf imagePollEditorRenderer;
    public akdv b;
    public ajut c;
    private int e;
    private ajut f;
    private ajut g;
    private ajut h;
    private ajut i;
    private ajut j;
    private ahyw k;
    private byte l;
    
    static {
        final ImagePollEditorRendererOuterClass$ImagePollEditorRenderer a2 = new ImagePollEditorRendererOuterClass$ImagePollEditorRenderer();
        ahbh.registerDefaultInstance((Class)ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.class, (ahbh)(a = a2));
        imagePollEditorRenderer = ahbh.newSingularGeneratedExtension((MessageLite)anuv.a, (Object)a2, (MessageLite)a2, (ahbm)null, 411621223, ahek.k, (Class)ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.class);
    }
    
    private ImagePollEditorRendererOuterClass$ImagePollEditorRenderer() {
        this.l = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.d) == null) {
                    synchronized (ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.class) {
                        if (ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.d == null) {
                            ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.d = (ahdd)new ahba((ahbh)ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.a;
            }
            case 4: {
                return new ahaz((ahbh)ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.a);
            }
            case 3: {
                return new ImagePollEditorRendererOuterClass$ImagePollEditorRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007", new Object[] { "e", "b", "c", "f", "g", "h", "i", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ImagePollEditorRendererOuterClass$ImagePollEditorRenderer extends agzi implements ahax
{
    public static final ImagePollEditorRendererOuterClass$ImagePollEditorRenderer a;
    private static volatile ahbe d;
    public static final agzg imagePollEditorRenderer;
    public akbs b;
    public ajsq c;
    private int e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private ajsq i;
    private ajsq j;
    private ahwy k;
    private byte l;
    
    static {
        final ImagePollEditorRendererOuterClass$ImagePollEditorRenderer a2 = new ImagePollEditorRendererOuterClass$ImagePollEditorRenderer();
        agzi.registerDefaultInstance((Class)ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.class, (agzi)(a = a2));
        imagePollEditorRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)a2, (MessageLite)a2, (agzn)null, 411621223, ahcm.k, (Class)ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.class);
    }
    
    private ImagePollEditorRendererOuterClass$ImagePollEditorRenderer() {
        this.l = 2;
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
                final ahbe d;
                if ((d = ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.d) == null) {
                    synchronized (ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.class) {
                        if (ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.d == null) {
                            ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.d = (ahbe)new agzb((agzi)ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.a;
            }
            case 4: {
                return new agza((agzi)ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.a);
            }
            case 3: {
                return new ImagePollEditorRendererOuterClass$ImagePollEditorRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007", new Object[] { "e", "b", "c", "f", "g", "h", "i", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}

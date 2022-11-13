// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer extends ahbh implements ahcw
{
    public static final PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer a;
    private static volatile ahdd e;
    public static final ahbf postEphemeralityDialogRenderer;
    public int b;
    public ajut c;
    public anuv d;
    private byte f;
    
    static {
        final PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer a2 = new PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer();
        ahbh.registerDefaultInstance((Class)PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.class, (ahbh)(a = a2));
        postEphemeralityDialogRenderer = ahbh.newSingularGeneratedExtension((MessageLite)anuv.a, (Object)a2, (MessageLite)a2, (ahbm)null, 427886063, ahek.k, (Class)PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.class);
    }
    
    private PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.e) == null) {
                    synchronized (PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.class) {
                        if (PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.e == null) {
                            PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.e = (ahdd)new ahba((ahbh)PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.a;
            }
            case 4: {
                return new ahaz((ahbh)PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.a);
            }
            case 3: {
                return new PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}

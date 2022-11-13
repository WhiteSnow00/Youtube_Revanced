// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer extends ahbh implements ahcw
{
    public static final SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer a;
    private static volatile ahdd d;
    public static final ahbf swipeoverContainerRenderer;
    public int b;
    public aiqj c;
    private aoqc e;
    private aoqc f;
    private ahhu g;
    private byte h;
    
    static {
        final SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer a2 = new SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer();
        ahbh.registerDefaultInstance((Class)SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer.class, (ahbh)(a = a2));
        swipeoverContainerRenderer = ahbh.newSingularGeneratedExtension((MessageLite)anuv.a, (Object)a2, (MessageLite)a2, (ahbm)null, 436517566, ahek.k, (Class)SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer.class);
    }
    
    private SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer() {
        this.h = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer.d) == null) {
                    synchronized (SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer.class) {
                        if (SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer.d == null) {
                            SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer.d = (ahdd)new ahba((ahbh)SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer.a;
            }
            case 4: {
                return new ahaz((ahbh)SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer.a);
            }
            case 3: {
                return new SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}

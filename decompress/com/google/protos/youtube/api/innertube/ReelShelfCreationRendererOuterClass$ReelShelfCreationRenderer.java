// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer extends ahbh implements ahcw
{
    public static final ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer a;
    private static volatile ahdd i;
    public static final ahbf reelShelfCreationRenderer;
    public int b;
    public aiqj c;
    public akdi d;
    public ajut e;
    public aotp f;
    public ahil g;
    public ahab h;
    private ahhu j;
    private byte k;
    
    static {
        final ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer a2 = new ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer();
        ahbh.registerDefaultInstance((Class)ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.class, (ahbh)(a = a2));
        reelShelfCreationRenderer = ahbh.newSingularGeneratedExtension((MessageLite)anuv.a, (Object)a2, (MessageLite)a2, (ahbm)null, 231434348, ahek.k, (Class)ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.class);
    }
    
    private ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer() {
        this.k = 2;
        this.h = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.i) == null) {
                    synchronized (ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.class) {
                        if (ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.i == null) {
                            ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.i = (ahdd)new ahba((ahbh)ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.a;
            }
            case 4: {
                return new ahaz((ahbh)ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.a);
            }
            case 3: {
                return new ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1009\u0004\u0005\u100a\u0005\u0006\u1409\u0006\u0007\u1409\u0003", new Object[] { "b", "c", "d", "e", "g", "h", "j", "f" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}

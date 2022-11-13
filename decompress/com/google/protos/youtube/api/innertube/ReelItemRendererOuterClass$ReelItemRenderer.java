// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ReelItemRendererOuterClass$ReelItemRenderer extends ahbh implements ahcw
{
    public static final ReelItemRendererOuterClass$ReelItemRenderer a;
    public static final ahbf reelItemRenderer;
    private static volatile ahdd t;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    public aotp f;
    public aotp g;
    public ajut h;
    public ajut i;
    public ajut j;
    public ajut k;
    public int l;
    public aiqj m;
    public amgv n;
    public int o;
    public ahab p;
    public ahil q;
    public int r;
    public ansl s;
    private ajut u;
    private aiqj v;
    private ahhu w;
    private byte x;
    
    static {
        final ReelItemRendererOuterClass$ReelItemRenderer a2 = new ReelItemRendererOuterClass$ReelItemRenderer();
        ahbh.registerDefaultInstance((Class)ReelItemRendererOuterClass$ReelItemRenderer.class, (ahbh)(a = a2));
        reelItemRenderer = ahbh.newSingularGeneratedExtension((MessageLite)anuv.a, (Object)a2, (MessageLite)a2, (ahbm)null, 158884182, ahek.k, (Class)ReelItemRendererOuterClass$ReelItemRenderer.class);
    }
    
    private ReelItemRendererOuterClass$ReelItemRenderer() {
        this.x = 2;
        this.p = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte x = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd t;
                if ((t = ReelItemRendererOuterClass$ReelItemRenderer.t) == null) {
                    synchronized (ReelItemRendererOuterClass$ReelItemRenderer.class) {
                        if (ReelItemRendererOuterClass$ReelItemRenderer.t == null) {
                            ReelItemRendererOuterClass$ReelItemRenderer.t = (ahdd)new ahba((ahbh)ReelItemRendererOuterClass$ReelItemRenderer.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return ReelItemRendererOuterClass$ReelItemRenderer.a;
            }
            case 4: {
                return new ahaz((ahbh)ReelItemRendererOuterClass$ReelItemRenderer.a);
            }
            case 3: {
                return new ReelItemRendererOuterClass$ReelItemRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)ReelItemRendererOuterClass$ReelItemRenderer.a, "\u0001\u0014\u0000\u0001\u0002\u0017\u0014\u0000\u0000\u000e\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\b\b\u1409\f\t\u1409\u000e\u000b\u1409\u0011\f\u100a\u0012\r\u1009\u0013\u000e\u100c\u0014\u000f\u1409\u0007\u0010\u100c\u000f\u0012\u1409\u0001\u0013\u1009\u0016\u0014\u1409\t\u0015\u1409\n\u0016\u100c\u000b\u0017\u1409\r", new Object[] { "b", "d", "e", "f", "g", "h", "i", "m", "n", "w", "p", "q", "r", anqj.n, "u", "o", anqj.m, "c", "s", "j", "k", "l", ansm.j, "v" });
            }
            case 1: {
                if (o == null) {
                    x = 0;
                }
                this.x = x;
                return null;
            }
            case 0: {
                return this.x;
            }
        }
    }
}

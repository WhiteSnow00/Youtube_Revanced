// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ReelItemRendererOuterClass$ReelItemRenderer extends agzi implements ahax
{
    public static final ReelItemRendererOuterClass$ReelItemRenderer a;
    public static final agzg reelItemRenderer;
    private static volatile ahbe t;
    public int b;
    public ajsq c;
    public ajsq d;
    public ajsq e;
    public aorm f;
    public aorm g;
    public ajsq h;
    public ajsq i;
    public ajsq j;
    public ajsq k;
    public int l;
    public aioe m;
    public amer n;
    public int o;
    public agyc p;
    public ahgn q;
    public int r;
    public anqi s;
    private ajsq u;
    private aioe v;
    private ahfw w;
    private byte x;
    
    static {
        final ReelItemRendererOuterClass$ReelItemRenderer a2 = new ReelItemRendererOuterClass$ReelItemRenderer();
        agzi.registerDefaultInstance((Class)ReelItemRendererOuterClass$ReelItemRenderer.class, (agzi)(a = a2));
        reelItemRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)a2, (MessageLite)a2, (agzn)null, 158884182, ahcm.k, (Class)ReelItemRendererOuterClass$ReelItemRenderer.class);
    }
    
    private ReelItemRendererOuterClass$ReelItemRenderer() {
        this.x = 2;
        this.p = agyc.b;
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
                final ahbe t;
                if ((t = ReelItemRendererOuterClass$ReelItemRenderer.t) == null) {
                    synchronized (ReelItemRendererOuterClass$ReelItemRenderer.class) {
                        if (ReelItemRendererOuterClass$ReelItemRenderer.t == null) {
                            ReelItemRendererOuterClass$ReelItemRenderer.t = (ahbe)new agzb((agzi)ReelItemRendererOuterClass$ReelItemRenderer.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return ReelItemRendererOuterClass$ReelItemRenderer.a;
            }
            case 4: {
                return new agza((agzi)ReelItemRendererOuterClass$ReelItemRenderer.a);
            }
            case 3: {
                return new ReelItemRendererOuterClass$ReelItemRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)ReelItemRendererOuterClass$ReelItemRenderer.a, "\u0001\u0014\u0000\u0001\u0002\u0017\u0014\u0000\u0000\u000e\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\b\b\u1409\f\t\u1409\u000e\u000b\u1409\u0011\f\u100a\u0012\r\u1009\u0013\u000e\u100c\u0014\u000f\u1409\u0007\u0010\u100c\u000f\u0012\u1409\u0001\u0013\u1009\u0016\u0014\u1409\t\u0015\u1409\n\u0016\u100c\u000b\u0017\u1409\r", new Object[] { "b", "d", "e", "f", "g", "h", "i", "m", "n", "w", "p", "q", "r", anoo.m, "u", "o", anoo.l, "c", "s", "j", "k", "l", anqs.i, "v" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.x = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.x;
            }
        }
    }
}

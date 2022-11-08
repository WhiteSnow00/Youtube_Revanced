// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer extends agzi implements ahax
{
    public static final ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer a;
    private static volatile ahbe i;
    public static final agzg reelShelfCreationRenderer;
    public int b;
    public aioe c;
    public akbf d;
    public ajsq e;
    public aorm f;
    public ahgn g;
    public agyc h;
    private ahfw j;
    private byte k;
    
    static {
        final ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer a2 = new ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer();
        agzi.registerDefaultInstance((Class)ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.class, (agzi)(a = a2));
        reelShelfCreationRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)a2, (MessageLite)a2, (agzn)null, 231434348, ahcm.k, (Class)ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.class);
    }
    
    private ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer() {
        this.k = 2;
        this.h = agyc.b;
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
                final ahbe i;
                if ((i = ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.i) == null) {
                    synchronized (ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.class) {
                        if (ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.i == null) {
                            ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.i = (ahbe)new agzb((agzi)ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.a;
            }
            case 4: {
                return new agza((agzi)ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.a);
            }
            case 3: {
                return new ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1009\u0004\u0005\u100a\u0005\u0006\u1409\u0006\u0007\u1409\u0003", new Object[] { "b", "c", "d", "e", "g", "h", "j", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}

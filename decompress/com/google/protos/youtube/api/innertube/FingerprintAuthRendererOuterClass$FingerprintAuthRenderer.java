// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class FingerprintAuthRendererOuterClass$FingerprintAuthRenderer extends agzi implements ahax
{
    public static final FingerprintAuthRendererOuterClass$FingerprintAuthRenderer a;
    public static final agzg fingerprintAuthRenderer;
    private static volatile ahbe i;
    public int b;
    public ajsq c;
    public agzy d;
    public int e;
    public boolean f;
    public agyc g;
    public ajsq h;
    private ahfw j;
    private byte k;
    
    static {
        final FingerprintAuthRendererOuterClass$FingerprintAuthRenderer a2 = new FingerprintAuthRendererOuterClass$FingerprintAuthRenderer();
        agzi.registerDefaultInstance((Class)FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.class, (agzi)(a = a2));
        fingerprintAuthRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)a2, (MessageLite)a2, (agzn)null, 196186429, ahcm.k, (Class)FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.class);
    }
    
    private FingerprintAuthRendererOuterClass$FingerprintAuthRenderer() {
        this.k = 2;
        this.d = emptyProtobufList();
        this.g = agyc.b;
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
                if ((i = FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.i) == null) {
                    synchronized (FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.class) {
                        if (FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.i == null) {
                            FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.i = (ahbe)new agzb((agzi)FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.a;
            }
            case 4: {
                return new agza((agzi)FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.a);
            }
            case 3: {
                return new FingerprintAuthRendererOuterClass$FingerprintAuthRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u041b\u0003\u1004\u0001\u0004\u1007\u0002\u0005\u1409\u0003\u0006\u100a\u0004\u0007\u1409\u0005", new Object[] { "b", "c", "d", ajsq.class, "e", "f", "j", "g", "h" });
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

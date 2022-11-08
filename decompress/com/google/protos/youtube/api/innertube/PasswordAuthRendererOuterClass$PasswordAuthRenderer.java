// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PasswordAuthRendererOuterClass$PasswordAuthRenderer extends agzi implements ahax
{
    public static final PasswordAuthRendererOuterClass$PasswordAuthRenderer a;
    private static volatile ahbe n;
    public static final agzg passwordAuthRenderer;
    public int b;
    public ajsq c;
    public agzy d;
    public int e;
    public boolean f;
    public ajsq g;
    public ajsq h;
    public agyc i;
    public ajsq j;
    public aikc k;
    public anss l;
    public int m;
    private ahfw o;
    private byte p;
    
    static {
        final PasswordAuthRendererOuterClass$PasswordAuthRenderer a2 = new PasswordAuthRendererOuterClass$PasswordAuthRenderer();
        agzi.registerDefaultInstance((Class)PasswordAuthRendererOuterClass$PasswordAuthRenderer.class, (agzi)(a = a2));
        passwordAuthRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)a2, (MessageLite)a2, (agzn)null, 196176225, ahcm.k, (Class)PasswordAuthRendererOuterClass$PasswordAuthRenderer.class);
    }
    
    private PasswordAuthRendererOuterClass$PasswordAuthRenderer() {
        this.p = 2;
        this.d = emptyProtobufList();
        this.i = agyc.b;
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
                final ahbe n;
                if ((n = PasswordAuthRendererOuterClass$PasswordAuthRenderer.n) == null) {
                    synchronized (PasswordAuthRendererOuterClass$PasswordAuthRenderer.class) {
                        if (PasswordAuthRendererOuterClass$PasswordAuthRenderer.n == null) {
                            PasswordAuthRendererOuterClass$PasswordAuthRenderer.n = (ahbe)new agzb((agzi)PasswordAuthRendererOuterClass$PasswordAuthRenderer.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return PasswordAuthRendererOuterClass$PasswordAuthRenderer.a;
            }
            case 4: {
                return new agza((agzi)PasswordAuthRendererOuterClass$PasswordAuthRenderer.a);
            }
            case 3: {
                return new PasswordAuthRendererOuterClass$PasswordAuthRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)PasswordAuthRendererOuterClass$PasswordAuthRenderer.a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u041b\u0003\u1004\u0001\u0004\u1007\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u100a\u0006\t\u1409\u0007\n\u1009\b\u000b\u1409\t\f\u100c\n", new Object[] { "b", "c", "d", ajsq.class, "e", "f", "g", "h", "o", "i", "j", "k", "l", "m", ahse.j });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}

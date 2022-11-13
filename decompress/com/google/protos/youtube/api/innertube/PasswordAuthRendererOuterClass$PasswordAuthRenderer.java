// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PasswordAuthRendererOuterClass$PasswordAuthRenderer extends ahbh implements ahcw
{
    public static final PasswordAuthRendererOuterClass$PasswordAuthRenderer a;
    private static volatile ahdd n;
    public static final ahbf passwordAuthRenderer;
    public int b;
    public ajut c;
    public ahbx d;
    public int e;
    public boolean f;
    public ajut g;
    public ajut h;
    public ahab i;
    public ajut j;
    public aima k;
    public anuv l;
    public int m;
    private ahhu o;
    private byte p;
    
    static {
        final PasswordAuthRendererOuterClass$PasswordAuthRenderer a2 = new PasswordAuthRendererOuterClass$PasswordAuthRenderer();
        ahbh.registerDefaultInstance((Class)PasswordAuthRendererOuterClass$PasswordAuthRenderer.class, (ahbh)(a = a2));
        passwordAuthRenderer = ahbh.newSingularGeneratedExtension((MessageLite)anuv.a, (Object)a2, (MessageLite)a2, (ahbm)null, 196176225, ahek.k, (Class)PasswordAuthRendererOuterClass$PasswordAuthRenderer.class);
    }
    
    private PasswordAuthRendererOuterClass$PasswordAuthRenderer() {
        this.p = 2;
        this.d = emptyProtobufList();
        this.i = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd n;
                if ((n = PasswordAuthRendererOuterClass$PasswordAuthRenderer.n) == null) {
                    synchronized (PasswordAuthRendererOuterClass$PasswordAuthRenderer.class) {
                        if (PasswordAuthRendererOuterClass$PasswordAuthRenderer.n == null) {
                            PasswordAuthRendererOuterClass$PasswordAuthRenderer.n = (ahdd)new ahba((ahbh)PasswordAuthRendererOuterClass$PasswordAuthRenderer.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return PasswordAuthRendererOuterClass$PasswordAuthRenderer.a;
            }
            case 4: {
                return new ahaz((ahbh)PasswordAuthRendererOuterClass$PasswordAuthRenderer.a);
            }
            case 3: {
                return new PasswordAuthRendererOuterClass$PasswordAuthRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)PasswordAuthRendererOuterClass$PasswordAuthRenderer.a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u041b\u0003\u1004\u0001\u0004\u1007\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u100a\u0006\t\u1409\u0007\n\u1009\b\u000b\u1409\t\f\u100c\n", new Object[] { "b", "c", "d", ajut.class, "e", "f", "g", "h", "o", "i", "j", "k", "l", "m", ahuc.j });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}

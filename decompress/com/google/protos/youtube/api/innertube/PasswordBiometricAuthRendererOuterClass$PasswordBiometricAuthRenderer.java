// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer extends ahbh implements ahcw
{
    public static final PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer a;
    private static volatile ahdd f;
    public static final ahbf passwordBiometricAuthRenderer;
    public int b;
    public anuv c;
    public ajut d;
    public boolean e;
    private byte g;
    
    static {
        final PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer a2 = new PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer();
        ahbh.registerDefaultInstance((Class)PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.class, (ahbh)(a = a2));
        passwordBiometricAuthRenderer = ahbh.newSingularGeneratedExtension((MessageLite)anuv.a, (Object)a2, (MessageLite)a2, (ahbm)null, 310393920, ahek.k, (Class)PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.class);
    }
    
    private PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.f) == null) {
                    synchronized (PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.class) {
                        if (PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.f == null) {
                            PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.f = (ahdd)new ahba((ahbh)PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.a;
            }
            case 4: {
                return new ahaz((ahbh)PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.a);
            }
            case 3: {
                return new PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}

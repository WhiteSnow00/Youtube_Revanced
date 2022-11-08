// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer extends agzi implements ahax
{
    public static final PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer a;
    private static volatile ahbe f;
    public static final agzg passwordBiometricAuthRenderer;
    public int b;
    public anss c;
    public ajsq d;
    public boolean e;
    private byte g;
    
    static {
        final PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer a2 = new PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer();
        agzi.registerDefaultInstance((Class)PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.class, (agzi)(a = a2));
        passwordBiometricAuthRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)a2, (MessageLite)a2, (agzn)null, 310393920, ahcm.k, (Class)PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.class);
    }
    
    private PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer() {
        this.g = 2;
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
                final ahbe f;
                if ((f = PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.f) == null) {
                    synchronized (PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.class) {
                        if (PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.f == null) {
                            PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.f = (ahbe)new agzb((agzi)PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.a;
            }
            case 4: {
                return new agza((agzi)PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.a);
            }
            case 3: {
                return new PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
